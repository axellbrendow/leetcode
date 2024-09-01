package myjava;

import java.util.*;
import java.util.stream.*;

public class WordLadder {
  private static boolean oneDiff(Map<String, Set<Integer>> wordChars, String str1, String str2) {
    int lengthDiff = Math.abs(str1.length() - str2.length());
    if (lengthDiff > 1) return false;
    if (lengthDiff == 1) {
      String longestStr, smallestStr;
      if (str1.length() <= str2.length()) {
        smallestStr = str1;
        longestStr = str2;
      } else {
        smallestStr = str2;
        longestStr = str1;
      }
      return longestStr.contains(smallestStr);
    }

    int diff = 0;
    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) != str2.charAt(i)) diff++;
      if (diff > 1) return false;
    }
    return true;
  }

  private static Map<String, List<String>> buildGraph(List<String> wordList) {
    Map<String, Set<Integer>> wordChars = wordList.stream().collect(
      Collectors.toMap(
        word -> word,
        word -> word.chars().boxed().collect(Collectors.toSet())
      )
    );
    Map<String, List<String>> graph = new HashMap<>();
    for (int i = 0; i < wordList.size(); i++) {
      String wordI = wordList.get(i);
      for (int j = i + 1; j < wordList.size(); j++) {
        String wordJ = wordList.get(j);
        if (oneDiff(wordChars, wordI, wordJ)) {
          graph.computeIfAbsent(wordI, k -> new ArrayList<>()).add(wordJ);
          graph.computeIfAbsent(wordJ, k -> new ArrayList<>()).add(wordI);
        }
      }
    }
    return graph;
  }

  public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
    if (!wordList.contains(beginWord)) wordList.add(beginWord);
    Map<String, List<String>> graph = buildGraph(wordList);
    if (!graph.containsKey(endWord) || graph.get(beginWord) == null) return 0;
    Map<String, Boolean> visited = wordList.stream().collect(Collectors.toMap(word -> word, word -> false));
    Map<String, Integer> levelMap = new HashMap<>();
    levelMap.put(endWord, 1);
    Queue<String> queue = new LinkedList<>();
    queue.offer(endWord);
    while (!queue.isEmpty()) {
      String word = queue.poll();
      if (visited.get(word)) continue;
      visited.put(word, true);
      int level = levelMap.get(word);
      if (beginWord.equals(word)) return level;
      for (String child : graph.get(word)) {
        Integer childLevel = levelMap.get(child);
        if (childLevel == null || level + 1 < childLevel) {
          levelMap.put(child, level + 1);
          queue.offer(child);
        }
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    assert ladderLength(
      "a",
      "c",
      new ArrayList<>(List.of("a", "b", "c"))
    ) == 2;

    assert ladderLength(
      "hit",
      "cog",
      new ArrayList<>(List.of("hot", "dot", "dog", "lot", "log", "cog"))
    ) == 5;

    assert ladderLength(
      "hit",
      "cog",
      new ArrayList<>(List.of("hot", "dot", "dog", "lot", "log"))
    ) == 0;

    assert ladderLength(
      "lost",
      "miss",
      new ArrayList<>(List.of("most", "mist", "miss", "lost", "fist", "fish"))
    ) == 4;
  }
}
