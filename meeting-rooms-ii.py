def get_minimum_num_of_rooms1(intervals):
    minimum_num_of_rooms = 0
    curr_num_of_rooms = 0
    starts = sorted([start for start, _ in intervals])
    ends = sorted([end for _, end in intervals])
    i_start, i_end = 0, 0

    while i_start < len(starts):
        if starts[i_start] < ends[i_end]:
            i_start += 1
            curr_num_of_rooms += 1
        else:
            i_end += 1
            curr_num_of_rooms -= 1
        minimum_num_of_rooms = max(minimum_num_of_rooms, curr_num_of_rooms)

    return minimum_num_of_rooms

assert get_minimum_num_of_rooms1([]) == 0
assert get_minimum_num_of_rooms1([[0,1]]) == 1
assert get_minimum_num_of_rooms1([[0,1],[0,1]]) == 2
assert get_minimum_num_of_rooms1([[0,1],[1,2]]) == 1


import heapq

def get_minimum_num_of_rooms2(intervals):
    if len(intervals) == 0: return 0
    intervals.sort()  # time = O(nlogn), worst-space = O(n)
    heap = [intervals[0][1]]
    for i in range(1, len(intervals)):  # O(n)
        if heap[0] <= intervals[i][0]:  # if smallest_end <= smallest_start
            heapq.heappop(heap)  # O(logn)
        heapq.heappush(heap, intervals[i][1])  # O(logn)
    return len(heap)

assert get_minimum_num_of_rooms2([]) == 0
assert get_minimum_num_of_rooms2([[0,1]]) == 1
assert get_minimum_num_of_rooms2([[0,1],[0,1]]) == 2
assert get_minimum_num_of_rooms2([[0,1],[1,2]]) == 1
