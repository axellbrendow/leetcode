def find_greatest_unsorted_subarray_from(start, nums):  # 11, [1, 2, 9, 8, 7, 7, 11, 12, 4, 5, 6]*
	subarray_start = -1  # -1
	subarray_end = -2  # -2
	while start < len(nums) and nums[start] > nums[start - 1]:
		start += 1
	if start < len(nums):
		subarray_start = start - 1  # 7
		subarray_end = start  # 10
		while start < len(nums) and nums[start] <= nums[subarray_start]:
			start += 1
			subarray_end = start
		subarray_end -= 1
	return subarray_start, subarray_end

def find_greatest_unsorted_subarray1(nums):  # [1, 2, 9, 8, 7, 7, 11, 12, 4, *5, 6]
	start = 1  # 11
	# 2, 10
	subarray_start, subarray_end = find_greatest_unsorted_subarray_from(start, nums)
	start = subarray_end + 1  # 6
	while start > 0 and start < len(nums):
		_, new_subarray_end = find_greatest_unsorted_subarray_from(start, nums)
		if new_subarray_end == -2: break
		subarray_end = new_subarray_end
		start = subarray_end + 1
	return subarray_end - subarray_start + 1  # 10 - 2 + 1 = 9

assert find_greatest_unsorted_subarray1([1, 2, 9, 8, 7, 7, 11, 12, 4, 5, 6]) == 9
assert find_greatest_unsorted_subarray1([1, 2, 3]) == 0
# assert find_greatest_unsorted_subarray1([1, 2, 3, 3, 3]) == 0
# assert find_greatest_unsorted_subarray1([2, 1, 3, 3]) == 2
assert find_greatest_unsorted_subarray1([3, 3, 1, 4]) == 3
assert find_greatest_unsorted_subarray1([1, 3, 2]) == 2
assert find_greatest_unsorted_subarray1([3, 2, 1]) == 3

def find_greatest_unsorted_subarray2(nums):
	n, beg, end, minimum, maximum = len(nums), -1, -2, nums[-1], nums[0]
	for i in range(n):
		right = n - 1 - i
		maximum = max(maximum, nums[i])
		minimum = min(minimum, nums[right])
		if nums[i] < maximum: end = i
		if nums[right] > minimum: beg = right
	return end - beg + 1

assert find_greatest_unsorted_subarray2([1, 2, 9, 8, 7, 7, 11, 12, 4, 5, 6]) == 9
assert find_greatest_unsorted_subarray2([1, 2, 3]) == 0
assert find_greatest_unsorted_subarray2([1, 2, 3, 3, 3]) == 0
assert find_greatest_unsorted_subarray2([2, 1, 3, 3]) == 2
assert find_greatest_unsorted_subarray2([3, 3, 1, 4]) == 3
assert find_greatest_unsorted_subarray2([1, 3, 2]) == 2
assert find_greatest_unsorted_subarray2([3, 2, 1]) == 3
