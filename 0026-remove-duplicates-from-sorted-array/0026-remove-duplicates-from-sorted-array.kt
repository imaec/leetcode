class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        nums.forEachIndexed { index, i ->
            if (index < nums.size - 1) {
                var nextIndex = index + 1
                while (nextIndex < nums.size && i == nums[nextIndex]) {
                    nums[nextIndex] = 101
                    nextIndex++
                }
            }
        }
        nums.sort()
        return nums.filter { it <= 100 }.size
    }
}