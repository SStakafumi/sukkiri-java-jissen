package practice3.q3;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        IntPredicate f1 = x -> x%2 == 1;;
        Func2 f2 = (int x, String name) -> {return name + "さんは" + (x > 65 ? "合格" : "不合格");};
        System.out.println(f1.test(15));
        System.out.println(f2.call(10, "takafumi"));
    }
  }