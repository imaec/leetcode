class Solution {
    fun romanToInt(s: String): Int {
        var nums = s
        var sum = 0
        val romanNums = mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
        val exceptionalRomanNums = mapOf("IV" to 4, "IX" to 9, "XL" to 40, "XC" to 90, "CD" to 400, "CM" to 900)

        exceptionalRomanNums.keys.forEach {
            if (nums.contains(it)) {
                sum += exceptionalRomanNums[it] ?: 0
                nums = nums.replace(it, "")
            }
        }
        nums.forEach {
            sum += romanNums[it] ?: 0
        }

        return sum
    }
}