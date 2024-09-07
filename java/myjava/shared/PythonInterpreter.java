package myjava.shared;

import java.util.*;

public class PythonInterpreter {
  private static Object read(String s, int[] index) {
    if (s.charAt(index[0]) == '[') {
      List<Object> arr = new ArrayList<Object>();
      do {
        index[0]++;
        arr.add(read(s, index));
      } while (s.charAt(index[0]) != ']');
      index[0]++;
      return arr;
    } else if ('0' <= s.charAt(index[0]) && s.charAt(index[0]) <= '9') {
      final var sb = new StringBuilder();
      do {
        sb.append(s.charAt(index[0]++));
      } while ('0' <= s.charAt(index[0]) && s.charAt(index[0]) <= '9');
      return Integer.parseInt(sb.toString());
    } else if (s.charAt(index[0]) == '"') {
      index[0]++;
      final var sb = new StringBuilder();
      while (s.charAt(index[0]) != '"') sb.append(s.charAt(index[0]++));
      return sb.toString();
    } else {
      throw new IllegalStateException(
        String.format(
          "Input not recognized index:%d character:%s string:%s",
          index[0],
          s.charAt(index[0]),
          s
        )
      );
    }
  }

  public static Object read(String s) {
    return read(s, new int[]{0});
  }
}
