package Y2021.M11.Mengyu.temp.Questions;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        //"  I Love   A'Lester  "
        char[] sChar = s.toCharArray();
        char[] temp = removeExtraSpace (sChar);
        int left = 0;
        int right = temp.length - 1;
        reverse(temp, left, right);
        return reverseSingleWord(temp);
    }
    private char[] removeExtraSpace (char[] sChar) {
        int slow = 0;
        for (int fast = 0; fast < sChar.length; fast++) {
            if (!(sChar[fast] == ' ' && (fast == 0 || sChar[fast - 1] == ' '))) {
                sChar[slow++] = sChar[fast];
            }
        }
        if (sChar[slow - 1] == ' ') {
            String temp = new String(sChar, 0, slow - 1);
            return temp.toCharArray();
        }
        String temp = new String(sChar, 0, slow);
        return temp.toCharArray();
    }
    private void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
    }
    private String reverseSingleWord(char[] chars) {
        int slow = 0;
        for (int fast = 0; fast < chars.length; fast++) {
            if (chars[fast] != ' ') {
                //"  abc def  "
                slow = fast;
                while (fast < chars.length && chars[fast] != ' ') {
                    fast++;
                }
                reverse(chars, slow, fast - 1);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        ReverseWordsInString test = new ReverseWordsInString();
        String testString = "  I love   Alester";
        System.out.println(test.reverseWords(testString));
    }
}
