package Y2021.M11.Mengyu.temp.Questions;

public class LC42069 {
    public int maximum69Number (int num) {
        int max = num;
        char[] numChar = String.valueOf(num).toCharArray();
        // 9 6 6 6
        for (int i = 0; i < numChar.length; i++) {
            if (numChar[i] == '6') {
                numChar[i] = '9';
            }
            int newNum = Integer.parseInt(new String(numChar));
            max = Math.max(newNum, max);
            numChar = String.valueOf(num).toCharArray();
        }
        return max;
    }

    public static void main(String[] args) {
        LC42069 test = new LC42069();
        System.out.println(test.maximum69Number(6666));
    }
}
