class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            for (j in 1 until nums.size) {
                if (i != j) {
                    val sum = nums[i] + nums[j]
                    if (sum == target) {
                        return intArrayOf(i, j)
                    }
                }
            }
        }
        
        return intArrayOf()
    }
}