package practice3.q4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("菅原拓真");
        names.add("湊祐輔");
        names.add("朝香あゆみ");
        names.add("大江岳人");

        names.stream().forEach(h -> {
            if (h.length() <= 4) System.out.println(h + "です");
        });
    }
}
