package whildhogs;

import java.util.function.UnaryOperator;

public class Opstrings {
    public static String vertMirror (String strng) {
        return strng;
    }
    public static String horMirror (String strng) {
        return strng;
    }
    public static String oper(UnaryOperator<String> operator, String s) {
        return operator.apply(s);
    }
}
