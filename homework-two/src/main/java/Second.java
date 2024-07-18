import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Second {
    public static void printStringReverse(String string) {
        if (string == null || string.isBlank()) {
            System.out.println("Wrong string");
        }
        StringBuilder builder = new StringBuilder(string);
        System.out.println(builder.reverse());
    }

    public static boolean isPhoneNumber(String phone) {
        if (phone == null || phone.isBlank()) {
            System.out.println("Wrong string");
        }
        return phone.matches("8\\d{10}");
    }

    public static void printSubStringReverse(String string, int start, int finish) {
        if (string == null || string.isBlank() || string.isEmpty() ||
                start < 0 || finish > string.length() || start > finish) {
            System.out.println("Wrong args");
            return;
        }
        String subString = string.substring(start, finish + 1);
        StringBuilder stringBuilder = new StringBuilder(subString).reverse();
        System.out.println(string.replaceFirst(subString, stringBuilder.toString()));
    }


    public static String getWordsReverse(String string) {
        if (string == null || string.isBlank()) {
            return null;
        }
        String[] strings = string.split(" ");
//        List<String> stringList = Arrays.asList(strings);
//        Collections.reverse(stringList);
//        return stringList.toString();

//        return IntStream.range(0, strings.length)
//                .mapToObj(i -> strings[strings.length - i - 1])
//                .collect(Collectors.joining(" "));
        return String.join(" ", Arrays.asList(string.split(" ")).reversed());
    }

    public static void printWordsReverseInColumn(String str) {
        if (str == null || str.isBlank()) {
            System.out.println("Wrong string");
        }
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder reversed = stringBuilder.reverse();
        String replaced = reversed.toString().replace(" ", "\n");
//        String[] strings = replaced.split("\n");
//        List<String> stringList = Arrays.asList(strings);
//        Collections.reverse(stringList);
//        System.out.println(replaced);
        String reversedString = Arrays.asList(str.split(" "))
                .stream()
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .collect(Collectors.joining("\n"));
        System.out.println(reversedString);
    }

    public static int maxCharIndex(String string) {
        Map<Character, Integer> map = new HashMap<>();
        string.chars().boxed().map(Character::highSurrogate)
                .forEach(character -> map.merge(character, 1, Integer::sum));
//        char[] chars = string.toCharArray();
//        for (char aChar : chars) {
////            if (map.containsKey(aChar)) {
////                Integer i = map.get(aChar);
////                map.put(aChar, i + 1);
////            } else {
////                map.put(aChar, 1);
////            }
//            map.merge(aChar, 1, Integer::sum);
//        }
        int indexMax = map.values().stream().max(Comparator.naturalOrder()).orElseThrow();
        Character key = map.entrySet().stream()
                .filter(entry -> entry.getValue() == indexMax)
                .findFirst()
                .orElseThrow()
                .getKey();
        return string.indexOf(key);

    }


}
