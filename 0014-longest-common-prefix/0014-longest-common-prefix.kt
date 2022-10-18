class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var commonPrefix = strs[0]
        for (i in strs.indices) {
            if (i + 1 < strs.size) {
                commonPrefix = commonPrefix.commonPrefixWith(strs[i + 1])
            }
        }
        
        return commonPrefix
    }
}