package test.java;

public class Main {
    private static String s = "J@va the be$t!123";

    public static void main(String[] args) {
        check(s);
    }

    public static void check(String s) {
        if (s == null || s.isEmpty()) {
            return;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
        }
        System.out.println(s);
        System.out.println(new String(chars));
    }
}
