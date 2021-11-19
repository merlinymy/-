package Y2021.M11.Mengyu.temp.Questions;

public class RemoveSpace {
    //S1:    keep the space after the word
    // you_get_offer_ffer___
    //               s
    //
    public String removeSpaces(String s) {
        char[] sChar = s.toCharArray();
        int slow = 0;
        int fast;
        for (fast = 0; fast < s.length(); fast++) {
            if (!(sChar[fast] == ' ' && (fast == 0 || sChar[fast - 1] == ' '))) {
                sChar[slow++] = sChar[fast];
            }
        }
        if (sChar[fast - 1] == ' ') {
            return new String(sChar, 0, slow - 1);
        }// abcs
        return new String(sChar, 0, slow);
    }
    //S2: keep the space before the word
    // ___you___get___offer___
    // s
    //   f
    public String removeSpaces2(String s) {
        char[] sChar = s.toCharArray();
        int slow = 0;
        int fast;
        for (fast = 0; fast < s.length(); fast++) {
            if (!(sChar[fast] == ' ' && (fast == 0 || sChar[fast - 1] == ' '))) {
                sChar[slow++] = sChar[fast];
            }
        }
        if (sChar[fast - 1] == ' ') {
            return new String(sChar, 0, slow - 1);
        }
        return new String(sChar, 0, slow);
    }

    public static void main(String[] args) {
        RemoveSpace test = new RemoveSpace();
        String testString = "   I  will    get  an  offer    ";
        System.out.println(test.removeSpaces(testString));
    }
}
