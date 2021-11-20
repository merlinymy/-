package Y2021.M11.Mengyu.temp.Questions;

public class LC796 {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        search:
        for (int i = 0; i < s.length(); ++i) {
            for (int j = 0; j < s.length(); ++j) {
                if (s.charAt((i+j) % s.length()) != goal.charAt(j))
                    continue search;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LC796 test = new LC796();
        System.out.println(test.rotateString("abcde","cdeab"));
    }
}
