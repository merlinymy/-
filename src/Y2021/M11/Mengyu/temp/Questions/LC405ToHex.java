package Y2021.M11.Mengyu.temp.Questions;

public class LC405ToHex {
    public String toHex(int num) {
        if (num == -1) return "ffffffff";
        char[] Hex = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        String res = "";
        int original = num;
        if (num < 0) {
            num *= -1;
        }
        while (num != 0) {
            res = res + Hex[num % 16];
            num /= 16;
        }
        res = new StringBuilder(res).reverse().toString();
        if (original < 0) {
            return "-" + res;
        } else {
            return res;
        }
    }

    public static void main(String[] args) {
        LC405ToHex test = new LC405ToHex();
        System.out.println(test.toHex(-3));
    }
}
