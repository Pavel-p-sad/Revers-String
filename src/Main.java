
public class Main {

    public static void main(String[] args) {
        String s = "J@va the be$t!123";
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (Character.isLetter(chars[left]) && Character.isLetter(chars[right])) {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            } else if (!Character.isLetter(chars[left]) && Character.isLetter(chars[right])) {
                left++;

            } else if (Character.isLetter(chars[left]) && !Character.isLetter(chars[right])) {
                right--;

            } else if (!Character.isLetter(chars[left]) && !Character.isLetter(chars[right])) {
                left++;
                right--;
            } else {
                System.out.println("КАКАЯ-ТО ОШИБКА, ДУМАЮ ДАЛЬШЕ");
                break;
            }
        }
        System.out.println(s);
        System.out.println(chars);
    }
}
