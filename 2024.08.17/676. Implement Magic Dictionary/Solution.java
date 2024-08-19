class MagicDictionary {
    private String[] data;

    public void buildDict(String[] dictionary) {
        this.data = dictionary;
    }

    public boolean search(String searchWord) {
        for (String element : data) {
            if (onlyOneCharDifferent(element, searchWord)) {
                return true;
            }
        }

        return false;
    }

    private boolean onlyOneCharDifferent(String element, String searchWord) {
        if (element.length() != searchWord.length()) {
            return false;
        }

        boolean onlyOneCharDifferent = false;

        for (int i = 0; i < element.length(); i++) {
            boolean differentChars = element.charAt(i) != searchWord.charAt(i);

            if (differentChars && !onlyOneCharDifferent) {
                onlyOneCharDifferent = true;
            } else if (differentChars) {
                onlyOneCharDifferent = false;
                break;
            }
        }

        return onlyOneCharDifferent;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */