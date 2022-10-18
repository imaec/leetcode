class Solution {
    fun isValid(s: String): Boolean {
        val starts = mapOf(0 to '(', 1 to '[', 2 to '{')
        val ends = mapOf(0 to ')', 1 to ']', 2 to '}')
        val keyStack = mutableListOf<Int>()
        s.forEach {
            if (starts.containsValue(it)) {
                var key = -1
                starts.keys.forEach { key1 ->
                    if (starts[key1] == it) {
                        key = key1
                    }
                }
                keyStack.add(key)
            } else if (ends.containsValue(it)) {
                if (keyStack.isEmpty()) return false
                var key = -1
                ends.keys.forEach { key1 ->
                    if (ends[key1] == it) {
                        key = key1
                    }
                }

                if (keyStack.last() == key) {
                    keyStack.removeAt(keyStack.size - 1)
                } else {
                    return false
                }
            }
        }

        if (keyStack.isNotEmpty()) return false

        return true
    }
}