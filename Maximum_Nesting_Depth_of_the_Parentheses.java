// Problem: Maximum Nesting Depth of the Parentheses
// Language: java

class Solution {
    public int maxDepth(String s) {
        int cur = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                cur++;
                if (cur > max) max = cur;
            } else if (ch == ')') {
                cur--;
            }
        }
        return max;
    }
}
