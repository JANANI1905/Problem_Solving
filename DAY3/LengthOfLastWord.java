class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] word = s.trim().split("\\s+");
        String last = word[word.length -1];
        return last.length();
    }
}