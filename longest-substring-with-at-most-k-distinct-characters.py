def longest_substr_with_at_most_k_distinct_characters(k, s):
	i = 0
	j = 0
	cache = {}
	distinct_count = 0
	longest = 0
	while j < len(s):
		if s[j] in cache:
			cache[s[j]] += 1
		else:
			cache[s[j]] = 1
			distinct_count = len(cache)

			while distinct_count > k:
				cache[s[i]] -= 1
				if cache[s[i]] == 0: del cache[s[i]]
				i += 1
				distinct_count = len(cache)

		longest = max(longest, j - i + 1)
		j += 1
	return longest

assert longest_substr_with_at_most_k_distinct_characters(0, "") == 0
assert longest_substr_with_at_most_k_distinct_characters(1, "") == 0
assert longest_substr_with_at_most_k_distinct_characters(1, "a") == 1
assert longest_substr_with_at_most_k_distinct_characters(2, "ab") == 2
assert longest_substr_with_at_most_k_distinct_characters(2, "aab") == 3
assert longest_substr_with_at_most_k_distinct_characters(2, "abcb") == 3
assert longest_substr_with_at_most_k_distinct_characters(2, "abbcab") == 3
assert longest_substr_with_at_most_k_distinct_characters(3, "abbcab") == 6
assert longest_substr_with_at_most_k_distinct_characters(3, "aabcbcdbca") == 7
