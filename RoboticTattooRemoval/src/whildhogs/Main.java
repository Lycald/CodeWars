package whildhogs;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[][] example =new String[][]{
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", "X", "X", " ", " ", " ", "X", "X", " ", " "},
                {" ", "X", " ", " ", "X", " ", "X", " ", " ", "X", " "},
                {" ", "X", " ", " ", " ", "X", " ", " ", " ", "X", " "},
                {" ", "X", " ", " ", " ", "X", " ", " ", " ", "X", " "},
                {" ", "X", " ", " ", " ", " ", " ", " ", " ", "X", " "},
                {" ", "X", " ", " ", " ", " ", " ", " ", " ", "X", " "},
                {" ", "X", " ", " ", " ", " ", " ", " ", " ", "X", " "},
                {" ", " ", "X", " ", " ", " ", " ", " ", "X", " ", " "},
                {" ", " ", " ", "X", " ", " ", " ", "X", " ", " ", " "},
                {" ", " ", " ", " ", "X", " ", "X", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", "P", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
        };

        String[][] wynik = robot(example);
        Arrays.stream(example).forEach(s -> System.out.println(Arrays.toString(s)));
        System.out.println("\n");
        Arrays.stream(wynik).forEach(s -> System.out.println(Arrays.toString(s)));

    }
    public static String[][] robot(String[][] skinScan) {
        String[][] result = new String[skinScan.length][skinScan[0].length];
        for (int i = 0; i < skinScan.length; i++) {
            for (int j = 0; j < skinScan[0].length; j++) {
                if (!skinScan[i][j].equals("X")) {
                    result[i][j] = skinScan[i][j];
                } else {
                    result[i][j] = "*";
                }
            }
        }
        return result;
    };
}
