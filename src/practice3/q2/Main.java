package practice3.q2;
public class Main {
    public static void main(String[] args) {
        Func1 f1 = (int x) -> {return (x%2 == 1);};
        Func2 f2 = (int x, String name) -> {return name + "さんは" + (x > 65 ? "合格" : "不合格");};
        System.out.println(f1.call(15));
        System.out.println(f2.call(10, "takafumi"));
    }
  }