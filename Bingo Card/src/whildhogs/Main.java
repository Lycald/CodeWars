package whildhogs;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(getCard());

    }


    public static String[] getCard() {
        List<String> cards = new ArrayList<>();

        cards.addAll(getColumn(1, 5, "B"));
        cards.addAll(getColumn(16, 5, "I"));
        cards.addAll(getColumn(31, 4, "N"));
        cards.addAll(getColumn(46, 5, "G"));
        cards.addAll(getColumn(61, 5, "O"));
        Arrays.stream(cards.toArray()).forEach(System.out::println);

        return cards.toArray(new String[0]);
    }

    private static List<String> getColumn(int startValue, int length, String name) {
        Set<String> valuesSet = new HashSet<>();
        do {
            valuesSet.add(name + (int)(Math.random() * 15 + startValue));
        } while (valuesSet.size() != length);
        List<String> valuesList = new ArrayList<>(valuesSet);
        Collections.shuffle(valuesList);

        return valuesList;
    }


}
