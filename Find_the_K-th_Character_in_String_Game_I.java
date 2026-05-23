// Problem: Find the K-th Character in String Game I
// Language: java


class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        int n = word.length();
        while (n < k) {
            n = word.length();
            for (int i = 0; i < n; i++) {
                char ch = word.charAt(i);
                if (ch == 'z') {
                    word.append('a');
                } else {
                    word.append((char)(ch + 1));
                }
            }
        } 
        return word.charAt(k - 1);
    }
}
