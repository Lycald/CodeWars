package whildhogs;

import javax.sound.midi.SysexMessage;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}

public class Main {

    static private class OddCountReduce implements IntBinaryOperator {
        private boolean found = false;
        private int value = 0;
        private int count = 0;

        @Override
        public int applyAsInt(int left, int right) {
            if (!found) {
                if (right != value) {
                    if (count % 2 != 0) {
                        found = true;
                    } else {
                        value = right;
                        count = 1;
                    }
                } else {
                    count++;
                }
            }
            return value;
        }
    }

//    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
//
//    }

    public static void main(String[] args) {

        System.out.println("Fixed Tests vertMirror");
        String s = "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu";
        String r = "QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw";
        System.out.println("First");
        System.out.println(Opstrings.oper(Opstrings::vertMirror, s));
        System.out.println("Second");
        System.out.println(Opstrings.oper(str -> str, r));

        int[] array = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {

        }

//        System.out.println(score);


        Ghost ghost = new Ghost();
        System.out.println(ghost.getColor());

        System.out.println(rowSumOddNumbers(3));

    }


    public static int rowSumOddNumbers(int n) {

        int k = n * (n -1) +1;
        int score = k;
        if (n>1) {
            for (int i = 1; i < n; i++) {
                k = k + 2;
                score += k;
            }
        }
        return score;
    }

}




