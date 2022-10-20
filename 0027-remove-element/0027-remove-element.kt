class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
       var count = 0
        nums.forEachIndexed { index, i ->
            if (i == `val`) {
                nums[index] = 101
            } else {
                count++
            }
        }
        nums.sort()
        return count
    }
}