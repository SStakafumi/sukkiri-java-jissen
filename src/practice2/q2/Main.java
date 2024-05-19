package practice2.q2;

public class Main {
    public static void main(String[] args) {
        StrongBox<String> sb = new StrongBox<>(KeyType.PADLOCK);
        sb.put("鍵が開きました");
        String rock = "";

        for (int i = 0; i < 1024; i++) {
            rock = sb.get();
        }
        if (rock != null) {
            System.out.println(rock);
        } else {
            System.out.println("鍵は開いてません");
        }
    }
}
