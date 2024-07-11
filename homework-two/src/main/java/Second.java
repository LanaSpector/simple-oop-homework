import org.w3c.dom.ls.LSOutput;

public class Second {
    public static void printStringReverse(String string) {
        if (string == null || string.isBlank()) {
            System.out.println("Wrong string");
        }
        StringBuilder builder = new StringBuilder(string);
        System.out.println(builder.reverse());
    }

    public static boolean isTelephoneNumber(String number) {
        if (number == null || number.isBlank()) {
            System.out.println("Wrong string");
        }
        return number.matches("0\\d{9}");
    }

    public static void printSubStringReverse(String string, int start, int finish) {
        if (string == null || string.isBlank()) {
            System.out.println("Wrong string");
        }
        String substring = string.substring(start, finish + 1);
        StringBuilder reversedSubString = new StringBuilder(string.substring(start, finish + 1));
        System.out.println(string.replaceAll(substring, reversedSubString.toString()));

    }


}
