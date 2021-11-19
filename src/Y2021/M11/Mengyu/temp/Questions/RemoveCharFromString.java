package Y2021.M11.Mengyu.temp.Questions;

public class RemoveCharFromString {
    public String removeChar (String word) {
        //remove 'o' and 'f'
        char[] wordChar = word.toCharArray();
        int j = 0;
        for (int i = 0; i < wordChar.length; i++) {
            if (wordChar[i] != 'o' && wordChar[i] != 'f') {
                wordChar[j] = wordChar[i];
                j++;
            }
        }
        return new String(wordChar, 0, j);
    }

    public static void main(String[] args) {
        RemoveCharFromString test = new RemoveCharFromString();
        System.out.println(test.removeChar("fuck off"));
    }
}
