class StringManipulator {
    // Trim and Cocantanate
    public String trimAndConcat(String strA, String strB) {
        // use String.trim method
        return strA.trim() + strB.trim();
    }

    // Find index of character
    public Integer getIndexOrNull(String inputStr, char letter) {
        // String.indexOf() will return -1 if the substring isn't present
        if (inputStr.indexOf(Character.toString(letter)) == -1) {
            return null;
        } else {
            return inputStr.indexOf(Character.toString(letter));
        }
    }

    // Find index of substring
    public Integer getIndexOrNull(String inputStr, String subStr) {
        // String.indexOf() will return -1 if the substring isn't present
        if (inputStr.indexOf(subStr) == -1) {
            return null;
        } else {
            return inputStr.indexOf(subStr);
        }
    }

    // Concat Substrings
    public String concatSubstring(String strA, int start, int end, String strB) {
        return (strA.substring(start, end) + strB);
    }
}