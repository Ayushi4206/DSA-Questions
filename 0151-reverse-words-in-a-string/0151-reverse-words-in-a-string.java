class Solution {
    public String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");

        String[] names = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            names[words.length - i - 1] = words[i];
        }

        return String.join(" ", names);
    }
}