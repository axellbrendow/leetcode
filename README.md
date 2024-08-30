# leetcode

LeetCode problems

Related repositories:

- [Daily Coding Problem](https://github.com/axellbrendow/daily-coding-problem)
- [HackerRank problems](https://github.com/axellbrendow/hackerrank)

Other sites that I recommend: [LintCode](https://www.lintcode.com/), [NeetCode 150](https://neetcode.io/practice), [AlgoMonster](https://algo.monster/problems/stats) and [Tech Interview Handbook](https://www.techinterviewhandbook.org/coding-interview-prep/).

## How to run Java files ?

Use the JVM flag `-enableassertions` or `-ea` to run Java files. The VSCode config in this repository already includes this flag when running files through F5 key or run button.

```sh
cd java
javac ./**/shared/*.java  # compiles common files
java -ea myjava/AddTwoNumbers.java  # works for java >= 11
javac myjava/AddTwoNumbers.java && java -ea myjava/AddTwoNumbers  # works for java < 11
```

## Some coding question topics:

- Two Pointers
  - Fast & Slow Pointers
    - Move slow by 1 and fast by 2
    - Move slow by 1 and fast by n
    - Move only fast until some point (e.g. distance between slow and fast is k)
- Cyclic Sort (consists of using the value as its own index to sort the array)
  - Find all Missing Numbers
  - Find all Duplicate Numbers
  - Find the Smallest Missing Positive Number
  - Find the First K Missing Positive Numbers
- Sliding Window
- Merge Intervals
- In-place Reversal of a LinkedList
- Doubly-Linked List
- Stacks
- Monotonic Stack
- Monotonic Queue
- Hash Maps
- Tree Breadth-First Search
- Tree Depth First Search
- Graphs
- Islands (Matrix Traversal)
- Two Heaps
- Design
- Subsets (permutations or combinations)
  - String Permutations by Changing Case
  - Unique Generalized Abbreviations
- Modified Binary Search
  - Ceiling of a number
  - Bitonic Array Maximum
- Mergesort
- Quicksort
- Quickselect
- Countingsort
- O(1) space
  - Majority Element
- Bit Manipulation
  - Two Single Numbers
  - Flip and Invert an Image
- Bitmask
- Top 'K' Elements
- K-way Merge
- Greedy Algorithms
- 0/1 Knapsack (Dynamic Programming)
  - Maximum Product Subarray (important problem, kadane's algorithm)
  - Equal Subset Sum Partition
  - Minimum Subset Sum Difference
  - Rod Cutting
  - Coin Change
- Backtracking
- Fibonacci Numbers
  - Staircase
  - House Thief
- Trie
- Topological Sort
- Palindromic Subsequence
  - Longest Palindromic Subsequence
  - Minimum Deletions in a String to make it a Palindrome
- Longest Common Substring
  - Maximum Sum Increasing Subsequence
  - Edit Distance
- Suffix Array
- Union Find
- Ordered Set
  - Longest Continuous Subarray
  - Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit
- Prefix Sum
  - Find the Middle Index in Array
  - Maximum Size Subarray Sum Equals K
  - Subarray Sum Equals K
- Rolling Hash
- Data Stream
- Game Theory
- Number Theory
- Geometry
- Segment Tree
- Binary Indexed Tree
- Concurrency
- Probability and Statistics
- Bucket Sort
- Minimum Spanning Tree (Kruskal Algorithm)
- Strongly Connected Component
- Eulerian Circuit
- Radix Sort

## 150 questions selected by [NeetCode.io](https://neetcode.io/practice)

### Arrays & Hashing

- Contains Duplicate
- Valid Anagram
- Two Sum
- Group Anagrams
- Top K Frequent Elements
- Encode and Decode Strings
- Product of Array Except Self
- Valid Sudoku
- Longest Consecutive Sequence

### Two Pointers

- Valid Palindrome
- Two Sum II Input Array Is Sorted
- 3Sum
- Container With Most Water
- Trapping Rain Water

### Sliding Window

- Best Time to Buy And Sell Stock
- Longest Substring Without Repeating Characters
- Longest Repeating Character Replacement
- Permutation In String
- Minimum Window Substring
- Sliding Window Maximum

### Stack

- Valid Parentheses
- Min Stack
- Evaluate Reverse Polish Notation
- Generate Parentheses
- Daily Temperatures
- Car Fleet
- Largest Rectangle In Histogram

### Binary Search

- Binary Search
- Search a 2D Matrix
- Koko Eating Bananas
- Find Minimum In Rotated Sorted Array
- Search In Rotated Sorted Array
- Time Based Key Value Store
- Median of Two Sorted Arrays

### Linked List

- Reverse Linked List
- Merge Two Sorted Lists
- Reorder List
- Remove Nth Node From End of List
- Copy List With Random Pointer
- Add Two Numbers
- Linked List Cycle
- Find The Duplicate Number
- LRU Cache
- Merge K Sorted Lists
- Reverse Nodes In K Group

### Trees

- Invert Binary Tree
- Maximum Depth of Binary Tree
- Diameter of Binary Tree
- Balanced Binary Tree
- Same Tree
- Subtree of Another Tree
- Lowest Common Ancestor of a Binary Search Tree
- Binary Tree Level Order Traversal
- Binary Tree Right Side View
- Count Good Nodes In Binary Tree
- Validate Binary Search Tree
- Kth Smallest Element In a Bst
- Construct Binary Tree From Preorder And Inorder Traversal
- Binary Tree Maximum Path Sum
- Serialize And Deserialize Binary Tree

### Heap / Priority Queue

- Kth Largest Element In a Stream
- Last Stone Weight
- K Closest Points to Origin
- Kth Largest Element In An Array
- Task Scheduler
- Design Twitter
- Find Median From Data Stream

### Backtracking

- Subsets
- Combination Sum
- Permutations
- Subsets II
- Combination Sum II
- Word Search
- Palindrome Partitioning
- Letter Combinations of a Phone Number
- N Queens

### Tries

- Implement Trie Prefix Tree
- Design Add And Search Words Data Structure
- Word Search II

### Graphs

- Number of Islands
- Max Area of Island
- Clone Graph
- Walls And Gates
- Rotting Oranges
- Pacific Atlantic Water Flow
- Surrounded Regions
- Course Schedule
- Course Schedule II
- Graph Valid Tree
- Number of Connected Components In An Undirected Graph
- Redundant Connection
- Word Ladder

### Advanced Graphs

- Reconstruct Itinerary
- Min Cost to Connect All Points
- Network Delay Time
- Swim In Rising Water
- Alien Dictionary
- Cheapest Flights Within K Stops

### 1-D Dynamic Programming

- Climbing Stairs
- Min Cost Climbing Stairs
- House Robber
- House Robber II
- Longest Palindromic Substring
- Palindromic Substrings
- Decode Ways
- Coin Change
- Maximum Product Subarray
- Word Break
- Longest Increasing Subsequence
- Partition Equal Subset Sum

### 2-D Dynamic Programming

- Unique Paths
- Longest Common Subsequence
- Best Time to Buy And Sell Stock With Cooldown
- Coin Change II
- Target Sum
- Interleaving String
- Longest Increasing Path In a Matrix
- Distinct Subsequences
- Edit Distance
- Burst Balloons
- Regular Expression Matching

### Greedy

- Maximum Subarray
- Jump Game
- Jump Game II
- Gas Station
- Hand of Straights
- Merge Triplets to Form Target Triplet
- Partition Labels
- Valid Parenthesis String

### Intervals

- Insert Interval
- Merge Intervals
- Non Overlapping Intervals
- Meeting Rooms
- Meeting Rooms II
- Minimum Interval to Include Each Query

### Math & Geometry

- Rotate Image
- Spiral Matrix
- Set Matrix Zeroes
- Happy Number
- Plus One
- Pow(x, n)
- Multiply Strings
- Detect Squares

### Bit Manipulation

- Single Number
- Number of 1 Bits
- Counting Bits
- Reverse Bits
- Missing Number
- Sum of Two Integers
- Reverse Integer

## Problems I did when I was creating a Google Doc for each problem:

> Now I just use comments /\*\*/ in the source files before writing the code

---

String & Tree & Depth-First Search & Breadth-First Search & Design & Binary Tree

HARD https://leetcode.com/problems/serialize-and-deserialize-binary-tree/

---

String & Design

MEDIUM https://leetfree.com/problems/encode-and-decode-strings
<br>
https://docs.google.com/document/d/1y9n2jzpYIeEjF-1bxq2V81_0ZioqLGV22PKLxwqD4Kg/edit

EASY https://leetfree.com/problems/design-compressed-string-iterator
<br>
https://docs.google.com/document/d/1jwyDpqCi3ijegZEHsvwvSA2wWzLknlhm4Tukxu4C83o/edit

---

String & Matching

EASY https://leetfree.com/problems/valid-word-abbreviation
<br>
https://www.lintcode.com/problem/637/description
<br>
https://docs.google.com/document/d/1WnDy1rZC37ftH6gZVdlBUDc5G-avLGezxxRQ4ZQfBGE/edit

---

String & Matching & Join Ranges

MEDIUM https://leetfree.com/problems/add-bold-tag-in-string
<br>
https://docs.google.com/document/d/1BqlWdCYajS5cN1qHszuftx7ltCua9i98lRWt_k1d69A/edit

---

String & Palindrome

EASY https://leetfree.com/problems/palindrome-permutation
<br>
https://docs.google.com/document/d/1F3WCxkR8V7a4W5whUwktMMQGnNAEJdrutdrGRW6y_aU/edit

---

String & Two Pointers

MEDIUM https://leetfree.com/problems/output-contest-matches
<br>
https://docs.google.com/document/d/1bWcXT3AP2KddIPTd0gHTKEB3Jjjas1mZYRK195Oze98/edit

---

String & Bit Manipulation

MEDIUM https://leetfree.com/problems/generalized-abbreviation
<br>
https://www.lintcode.com/problem/779/description
<br>
https://docs.google.com/document/d/1Frfc6LQDHGAS2kXcoKoahQpH857M6UEABCzaKY2dJs4/edit

HARD https://leetfree.com/problems/minimum-unique-word-abbreviation
<br>
https://www.lintcode.com/problem/890/description
<br>
https://docs.google.com/document/d/1wAkDYNuaP_KOa0e8o9Lqemox78auijMX6IQ2wr0iEEI/edit

---

String & Stack

EASY https://leetcode.com/problems/valid-parentheses/

HARD https://leetcode.com/problems/longest-valid-parentheses/

MEDIUM https://leetcode.com/problems/longest-absolute-file-path/
<br>
https://docs.google.com/document/d/1Skfm7D-pZMUC4zf0PWePR3sS0Sa9hBDoiudfmo5ixxE/edit

MEDIUM https://leetcode.com/problems/basic-calculator-ii

HARD https://leetcode.com/problems/basic-calculator

---

String & Hash Table & Math

EASY https://leetcode.com/problems/roman-to-integer

---

String & Hash Table & Backtracking

MEDIUM https://leetcode.com/problems/letter-combinations-of-a-phone-number/

HARD https://leetfree.com/problems/word-squares
<br>
https://docs.google.com/document/d/1IRbXl8eBv4xhVT2z8Qv5kScfl5F7ef7IGJ1c0_GdOv0/edit

---

String & Dynamic Programming & Recursion/Backtracking

MEDIUM https://leetcode.com/problems/longest-palindromic-substring/

HARD https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/

HARD https://leetcode.com/problems/regular-expression-matching/

MEDIUM https://leetcode.com/problems/generate-parentheses/

HARD https://leetfree.com/problems/encode-string-with-shortest-length
<br>
https://docs.google.com/document/d/1kOaG2lJreQoh_Gua7b6ROoHxJuUr7o38b2GekviOMe8/edit

HARD https://leetfree.com/problems/minimum-window-subsequence
<br>
https://www.lintcode.com/problem/857/description
<br>
https://docs.google.com/document/d/1Bg7At3-GnxwVI8P4H5dlkt7gF7kF0lHpjvwJu11lIJ0/edit

---

String & Sliding Window & Hash Table

HARD - Longest Substring with At Most K Distinct Characters - https://www.lintcode.com/problem/386/
<br>
https://docs.google.com/document/d/19agzdcxcQMHX1QJ53RS5rsQFLAR_iJDgothnmcPVgvM/edit

MEDIUM https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

---

String & Array

HARD https://leetcode.com/problems/text-justification/
<br>
https://docs.google.com/document/d/14fN3Iz0xIEodIUXE5hn0zORIv-cIt9u9Zn7zigZEcEo/edit

---

String & Hash Table & Array

HARD https://leetfree.com/problems/group-shifted-strings
<br>
https://www.lintcode.com/problem/922/
<br>
https://docs.google.com/document/d/1OCI2FKwrZYR35j5nulXxm5Cskz29nSseYu16u9hhvp4/edit

HARD https://leetfree.com/problems/word-abbreviation
<br>
https://docs.google.com/document/d/1vMykQsFgVX-7QMXRuU7Lc0xKp1If1xd168g9LSYUZog/edit

---

String & Hash Table & Set

MEDIUM https://leetfree.com/problems/unique-word-abbreviation
<br>
https://docs.google.com/document/d/1Y7r7ufeYOItC3WUp7Jp9tMZEY94I3vbvtucLDB6sYkk/edit

EASY https://leetfree.com/problems/sentence-similarity
<br>
https://docs.google.com/document/d/1iV9xPZ1EdRiCTHY4FGlT44Sw9bLOS08E8U4lyRWmaJo/edit

---

String & Hash Table & Queue & Priority Queue & Heap

HARD https://leetfree.com/problems/rearrange-string-k-distance-apart
<br>
https://www.lintcode.com/problem/907/
<br>
https://docs.google.com/document/d/1D8PxggBxXur2F_j88idudqMeHGlgswZWU9jf4ESWwcQ/edit

---

Matrix

MEDIUM https://leetfree.com/problems/bomb-enemy
<br>
https://docs.google.com/document/d/1tFf3f2j7hcp4wNwxIbYLc5e2rPony_eNHbZSahH8rY8/edit

MEDIUM https://leetfree.com/problems/sentence-screen-fitting
<br>
https://docs.google.com/document/d/1sESwb_asGvDpeqMkJGzku_DTzj7z7DBLhFxF6m_c0bc/edit

MEDIUM https://leetcode.com/problems/game-of-life/
<br>
https://docs.google.com/document/d/1Qq0FKhJHcTy5UnP6dy0rp7eRUMmwPsCCw-6e1mg1Y84/edit

EASY https://leetfree.com/problems/valid-word-square
<br>
https://www.lintcode.com/problem/888/description
<br>
https://docs.google.com/document/d/181nKMHO9HB6k6HBfg3ujYIG4-1xkJVZd7eTI0Tz2u8c/edit

---

Matrix & Hash Table

MEDIUM https://leetfree.com/problems/lonely-pixel-i
<br>
https://docs.google.com/document/d/1BdeZmyG5TpvQQZtbN5ugaWd_dRk7h_Ud3P7dO7YPGt0/edit

MEDIUM https://leetfree.com/problems/lonely-pixel-ii
<br>
https://www.lintcode.com/problem/881/description
<br>
https://docs.google.com/document/d/1BjdZ_Jgt0uNX_x6eSYL-M0Py4OIdlF78wUo6k4CtF_c/edit

---

Matrix & Dynamic Programming

MEDIUM https://leetfree.com/problems/longest-line-of-consecutive-one-in-matrix
<br>
https://docs.google.com/document/d/1beHxEeKpQoh1KNxfFlKUJS6zmMcyknhYRGi77h6mTM4/edit

---

Matrix & DFS & BFS

MEDIUM https://leetcode.com/problems/pacific-atlantic-water-flow/

MEDIUM https://leetfree.com/problems/walls-and-gates
<br>
https://www.lintcode.com/problem/663/description
<br>
https://docs.google.com/document/d/1on90YvY-EHzi0rR4Ff8YKF0Bcg56p23-SupMK1pL9nk/edit

HARD https://leetfree.com/problems/shortest-distance-from-all-buildings
<br>
https://www.lintcode.com/problem/803/description
<br>
https://docs.google.com/document/d/1Wtb-3Vh-28fOQTjkK2UDoOMAnzyDal5gsW2YaKlt8jY/edit

MEDIUM https://leetfree.com/problems/android-unlock-patterns
<br>
https://docs.google.com/document/d/1zDOYPIJSyxBMos7va94Ckj3ts0i7ealz2U9DpLN_Lc0/edit

HARD https://leetfree.com/problems/smallest-rectangle-enclosing-black-pixels
<br>
https://docs.google.com/document/d/1ET7ePcPUOvzbWIqh2YXeviYGDEVWIuE2M3s9Q8MKbWM/edit

MEDIUM https://leetfree.com/problems/the-maze
<br>
https://docs.google.com/document/d/1--2Chf6rpQ-W_INcaTpME-k8WhuZqXSdJ3Gbz1ldRtc/edit

MEDIUM https://leetfree.com/problems/the-maze-ii
<br>
https://docs.google.com/document/d/1tBUfBSAhNu4yff6CKifzNVBRQ7DOBf2o6Crhru8CR08/edit

---

Matrix & DFS & BFS & Union Find

MEDIUM https://leetcode.com/problems/number-of-islands/

HARD https://leetfree.com/problems/number-of-islands-ii
<br>
https://docs.google.com/document/d/1xMv1QhgVOdDNvbQ3S-nInmeSsPqqVGZREGDjaroExtw/edit

---

Matrix & Array & Design

MEDIUM https://leetfree.com/problems/design-tic-tac-toe
<br>
https://docs.google.com/document/d/1s9olgGx6u8uWupYKhD1PiSOUAnDeDnqJgUhhJq1Oa7g/edit

---

Math

MEDIUM https://leetcode.com/problems/reverse-integer/

---

Array

MEDIUM https://leetfree.com/problems/missing-ranges
<br>
https://www.lintcode.com/problem/641/
<br>
https://docs.google.com/document/d/1Ja_IOhCeOFFnQvXZYY6-gHclS3aSrQmm1YZPLlJa_kU/edit

MEDIUM https://leetfree.com/problems/range-addition
<br>
https://docs.google.com/document/d/14RBUkiYomXDZMck06rABbb8ztrZy9SammX5hwM7Tqjs/edit

MEDIUM https://leetfree.com/problems/find-permutation
<br>
https://www.lintcode.com/problem/884/description
<br>
https://docs.google.com/document/d/1bqXz3IeRzOKjcBVQ-pxFR-qVxfoT2pw3Tq63Qwvuj3U/edit

---

Array & Math

MEDIUM https://leetfree.com/problems/sort-transformed-array
<br>
https://docs.google.com/document/d/1dt27fssDRLLJVXbNYUGYcjWFaihMaXSi1knJZycwO3c/edit

---

Array & Math & Set

MEDIUM https://leetfree.com/problems/line-reflection
<br>
https://www.lintcode.com/problem/line-reflection/description
<br>
https://docs.google.com/document/d/1hacMUc89PQd1zgLrD32PWHUdO8ox7wXk1ciR21sqaP8/edit

---

Array & Binary Search & Divide and Conquer

HARD https://leetcode.com/problems/median-of-two-sorted-arrays/

EASY https://leetcode.com/problems/kth-missing-positive-number/

---

Array & Divide and Conquer & Sorting & Quickselect

MEDIUM https://leetfree.com/problems/wiggle-sort.html
<br>
https://www.lintcode.com/problem/508/description
<br>
https://docs.google.com/document/d/1tSkoFmrRP9vuUT4rvenkgP3z7YKwC5_cxlwWLJdtUbg/edit

HARD https://leetcode.com/problems/wiggle-sort-ii/
<br>
https://www.lintcode.com/problem/507/description
<br>
https://docs.google.com/document/d/1a9OjNCOnCiuzHC6hxJq8XRzpcUMwqK-puvA8BjuoPv0/edit

MEDIUM https://leetcode.com/problems/top-k-frequent-elements/

---

Array & Dynamic Programming

EASY https://leetcode.com/problems/maximum-subarray/

MEDIUM https://leetcode.com/problems/maximum-product-subarray/

EASY https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

MEDIUM https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
<br>
https://docs.google.com/document/d/1EHYrfU1PC9Dt-kdXjfgTUCILQgs7I_zrq08UvWiIgMo/edit

HARD (I DID NOT FINISH) https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
<br>
https://docs.google.com/document/d/1TsMAB5kKagC0w5KEmy0EhDOaAh30QhR0q60wEhhHXyU/edit

EASY https://leetcode.com/problems/min-cost-climbing-stairs/

MEDIUM https://leetcode.com/problems/house-robber/

EASY https://leetfree.com/problems/paint-fence
<br>
https://www.lintcode.com/problem/514/description
<br>
https://docs.google.com/document/d/1go8k2uEkaLhj443ZirLInnWY7r6MEu_-Ey2Sv84J67E/edit

MEDIUM https://leetcode.com/problems/partition-equal-subset-sum/

---

Array & Dynamic Programming & Queue & Monotonic Queue

HARD https://leetfree.com/problems/coin-path
<br>
https://www.lintcode.com/problem/866/description
<br>
https://docs.google.com/document/d/1Qs_RaR8uvE8KQ-l4FSIgfqx02LjIRD2E24tM2GSjxmc/edit

---

Array & Sorting & Heap & Greedy

EASY - Meeting Rooms - https://www.lintcode.com/problem/920/

MEDIUM - Meeting Rooms II - https://www.lintcode.com/problem/919/
<br>
https://docs.google.com/document/d/1ZKfmgo2ghLN2Ux3ckRsHvpkNeNzzWNI-KX8KABygbFE/edit

MEDIUM https://leetcode.com/problems/non-overlapping-intervals

---

Array & Prefix Sum

MEDIUM https://leetcode.com/problems/product-of-array-except-self/

MEDIUM https://leetcode.com/problems/range-sum-query-2d-immutable/
<br>
https://docs.google.com/document/d/1Bv3WA9DkvhtXQnBZkuBzusu9-gqe8_ZW5O_lLx_wblU/edit

HARD https://leetcode.com/problems/range-sum-query-2d-mutable/
<br>
https://www.lintcode.com/problem/817/description

---

Array & Hash Table

EASY https://leetcode.com/problems/two-sum/

HARD https://leetcode.com/problems/first-missing-positive/

EASY https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

MEDIUM https://leetcode.com/problems/find-all-duplicates-in-an-array/

---

Array & Hash Table & Monotonic Stack

EASY https://leetcode.com/problems/next-greater-element-i/
<br>
https://docs.google.com/document/d/1f9nHwYBce2_uYJEbnNdGTJkaI7a1uO66_jiR6puizkI/edit

---

Array & Stack & Monotonic Stack

HARD https://leetcode.com/problems/largest-rectangle-in-histogram/
<br>
https://docs.google.com/document/d/1fN5rTiQdkLGQ_jpPZHXB5GYStZPFKUF0cq3VKWxxntI/edit

---

Array & Stack & Monotonic Stack & Dynamic Programming & Two Pointers

HARD https://leetcode.com/problems/trapping-rain-water/
<br>
https://docs.google.com/document/d/1_iPhFiVBxqlxA_I2QCdPJ4H82hogtxK7_GaO0EwPDYE/edit

---

Array & Bit Manipulation

EASY https://leetcode.com/problems/single-number/

---

Array & Sliding Window

HARD https://leetfree.com/problems/k-empty-slots
<br>
https://docs.google.com/document/d/1YwPH2s6M0JJDx-gqkpYMoaMBrHvxXry4Cy7Om4xFTrU/edit

MEDIUM https://leetfree.com/problems/max-consecutive-ones-ii
<br>
https://www.lintcode.com/problem/max-consecutive-ones-ii/description
<br>
https://docs.google.com/document/d/1Nn5ax6wKPqaJfpCI5KgFEOpGiTR4JJthWq__ESGqONA/edit

MEDIUM https://leetcode.com/problems/fruit-into-baskets

---

Array & Sorting & Sliding Window

HARD https://leetfree.com/problems/3sum-smaller
<br>
https://www.lintcode.com/problem/918/description
<br>
https://docs.google.com/document/d/1Hw3qXho9D-MfAWw8ngK6Kgn8_dql7nLHZA7zyXTppe0/edit

---

Array & Sliding Window & Queue & Monotonic Queue & Heap & Prefix Sum

HARD https://leetcode.com/problems/sliding-window-maximum/
<br>
https://docs.google.com/document/d/18Nlp37ypKCI63DTtKaHzyWrkAr5EJTcqvhGD-z4719E/edit

HARD https://leetcode.com/problems/shortest-subarray-with-sum-at-least-k/
<br>
https://docs.google.com/document/d/1kVNgKqIQf2yAExKNjqmAkF9oqWVBdE0fLY_zcsGYSN8/edit

HARD https://leetfree.com/problems/maximum-average-subarray-ii
<br>
https://docs.google.com/document/d/1hgpp4Eid5HkxX7hqZ-0ZD6Zh2_ZpeHRntN2zzJUpi3I/edit

---

Array & Iterator & Design

MEDIUM https://leetfree.com/problems/zigzag-iterator
<br>
https://docs.google.com/document/d/1sObseKpnEVtvNINbs3S7Tmdo2YDUy-65t9kXPC5tJ0Q/edit

MEDIUM https://leetfree.com/problems/flatten-2d-vector
<br>
https://docs.google.com/document/d/1aTroVSknrJ1kwtqs2foNMEK4-rEpPnxhbzW_w6VpGOw/edit

---

Array & Two Pointers & Stack & Greedy & Sorting & Monotonic Stack

MEDIUM https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
<br>
https://docs.google.com/document/d/1MGsfvf91b6JvpmDZ7x2B29TVskJwUa-KmWoK-kD7ESM/edit

---

Array & Design & Hash Table

MEDIUM https://leetfree.com/problems/design-hit-counter
<br>
https://docs.google.com/document/d/1MGsfvf91b6JvpmDZ7x2B29TVskJwUa-KmWoK-kD7ESM/edit

---

Array & Design & Pointer & Buffer

HARD https://leetfree.com/problems/read-n-characters-given-read4-ii-call-multiple-times
<br>
https://docs.google.com/document/d/1lReL7WO6NQxOJShWuT6YswQWTwGDhhbbanzNICazj1M/edit

---

Hash Table & Design

EASY https://leetfree.com/problems/logger-rate-limiter
<br>
https://docs.google.com/document/d/1aejnbmxBG1oHv97JTHeXhJTBxghltwvgXYqk4khIATY/edit

---

Queue & Set & Design

MEDIUM https://leetfree.com/problems/design-snake-game
<br>
https://docs.google.com/document/d/1lpPeoaG1igWP3e7Py6uTtRyPk2WmM-Z_BEFzP9nrRnQ/edit

---

Queue & Stream & Greedy

EASY https://leetfree.com/problems/moving-average-from-data-stream
<br>
https://docs.google.com/document/d/1aISXsuz5hw63kQtA15ToLc94UH0JLZYSViz2nuuxMUw/edit

---

Dynamic Programming

EASY https://leetcode.com/problems/climbing-stairs/

MEDIUM https://leetfree.com/problems/4-keys-keyboard
<br>
https://www.lintcode.com/problem/867/description
<br>
https://docs.google.com/document/d/1wBJXFYNneUSnk2Lkk5mKKXcntORRx_YJpcTY5fNIu1U/edit

---

Heap & Set

MEDIUM https://leetfree.com/problems/design-phone-directory
<br>
https://docs.google.com/document/d/17QdFcANghw2OGdcIynyF-yT5ug_wn76chhIK4EwITho/edit

---

LinkedList & Divide and Conquer & Heap (Priority Queue) & Merge Sort

HARD https://leetcode.com/problems/merge-k-sorted-lists/

---

LinkedList

EASY https://leetcode.com/problems/reverse-linked-list/
<br>
https://docs.google.com/document/d/1lbyKMqF89wIwFdRCe9aUgTeq69dmZ-K1F5VGFw39yGU/edit

HARD https://leetcode.com/problems/reverse-nodes-in-k-group/

MEDIUM https://leetcode.com/problems/rotate-list/description/

MEDIUM https://leetcode.com/problems/add-two-numbers/

EASY https://leetcode.com/problems/intersection-of-two-linked-lists/
<br>
https://docs.google.com/document/d/1Ct5cZD19QqDfHe3UlevcYP2REMHj3tP_wDnSdEBdQEk/edit

MEDIUM https://leetcode.com/problems/remove-nth-node-from-end-of-list/
<br>
https://docs.google.com/document/d/168pYWvRzxLsY_RCbFkDiM-DBP7caEvw2qKMIgXwNwM0/edit

EASY https://leetcode.com/problems/middle-of-the-linked-list

---

Tree & DFS & BFS

EASY https://leetcode.com/problems/minimum-depth-of-binary-tree/

EASY https://leetcode.com/problems/same-tree/

EASY https://leetcode.com/problems/diameter-of-binary-tree/

EASY https://leetcode.com/problems/merge-two-binary-trees/

EASY https://leetcode.com/problems/invert-binary-tree/

MEDIUM https://leetcode.com/problems/binary-tree-level-order-traversal/

MEDIUM https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/

MEDIUM https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

MEDIUM https://leetfree.com/problems/boundary-of-binary-tree
<br>
https://www.lintcode.com/problem/878/description
<br>
https://docs.google.com/document/d/1cD6VKwh6YPFZp3J2lq2ycLx3NxKT_xn7RPpMx5mlF0A/edit

MEDIUM https://leetfree.com/problems/binary-tree-longest-consecutive-sequence
<br>
https://www.lintcode.com/problem/595/
<br>
https://docs.google.com/document/d/12FVRHPxu1ZkRZWx1rAYOo7VYXegUGDztf_c7WnlwMEY/edit

MEDIUM https://leetfree.com/problems/binary-tree-longest-consecutive-sequence-ii
<br>
https://www.lintcode.com/problem/binary-tree-longest-consecutive-sequence-ii/description
<br>
https://docs.google.com/document/d/1oV4VSQE-KJADw-pR7cdj2Ixl-8r9nRyeyZrgvbof_2M/edit

HARD https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
<br>
https://leetfree.com/problems/binary-tree-vertical-order-traversal
<br>
https://docs.google.com/document/d/1AuKyH8VGjEA_pMDQRPWjQ9hQc5qD6in5_VW6RSyVeRs/edit

---

Binary Search Tree

EASY https://leetfree.com/problems/closest-binary-search-tree-value
<br>
https://docs.google.com/document/d/1TBHKfAzAEXXMUzlMoNWJkEc2u44qeYdUCEfWvO4_i-o/edit

HARD https://leetfree.com/problems/closest-binary-search-tree-value-ii
<br>
https://www.lintcode.com/problem/901/description
<br>
https://docs.google.com/document/d/1UnwGthB03KcQR6fdq_buT5ot6mPw55MVueNP4_HSKLw/edit

---

Trie & Hash Table & String & Design

MEDIUM https://leetcode.com/problems/implement-trie-prefix-tree/

HARD https://leetcode.com/problems/design-search-autocomplete-system/
<br>
https://leetcode.ca/all/642.html

---

Graph & DFS

MEDIUM https://leetfree.com/problems/graph-valid-tree
<br>
https://www.lintcode.com/problem/178/description
<br>
https://docs.google.com/document/d/1m2N8KaJwvExYCB2hW6JvySN8ICc-stj6kntYYy-7LVE/edit

MEDIUM https://leetfree.com/problems/number-of-connected-components-in-an-undirected-graph
<br>
https://docs.google.com/document/d/1z45PvOHQFgWFJRY-A4aYN3FRZ_fS8iD6K6S7xqagENs/edit

HARD https://leetfree.com/problems/maximum-vacation-days
<br>
https://www.lintcode.com/problem/874/description
<br>
https://docs.google.com/document/d/1hQU4OmHxtBMVi_n61baYd3CghrsfP8ACxh0k-3QiEhI/edit

HARD https://leetcode.com/problems/reconstruct-itinerary/
<br>
https://docs.google.com/document/d/1LxFSfPXpHg6mQQlb1vn9B7tmpw3bQlvaP1kNDz9nwkk/edit

---

Graph & Adjacency Matrix & Heap

HARD https://leetfree.com/problems/optimal-account-balancing
<br>
https://docs.google.com/document/d/1iHGo0aUm58Tnj3ZPliU0iZp0SispAR3q7IHPQawIW08/edit

---

Graph & DFS & BFS & Topological Sort

MEDIUM https://leetfree.com/problems/sentence-similarity-ii
<br>
https://docs.google.com/document/d/1Q1ztSF2CUdsXE6e5jNiWgxEAG4WHZ8uE5LrRkhRyKgE/edit

MEDIUM https://leetcode.com/problems/course-schedule/

MEDIUM https://leetcode.com/problems/course-schedule-ii/

HARD https://leetfree.com/problems/alien-dictionary
<br>
https://www.lintcode.com/problem/892/
<br>
https://docs.google.com/document/d/1qszcdc5o4eMnMB8F26krRh7XmbRVvq6Uux-wouDboAU/edit

MEDIUM https://leetfree.com/problems/sequence-reconstruction
<br>
https://www.lintcode.com/problem/605/description
<br>
https://docs.google.com/document/d/1IFKcopuk7AOY8M0B7ZdMCPHRHLLHi6rhzvGrqpyp85Q/edit

---

SQL

HARD https://leetfree.com/problems/median-employee-salary
<br>
https://docs.google.com/document/d/1XBQ6wDQWQRTGCKJrYJ4pnZDLHvkpZu9Vc04OHjinQBI/edit
