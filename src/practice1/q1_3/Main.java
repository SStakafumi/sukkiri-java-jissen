package practice1.q1_3;

import java.util.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args){
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
        ArrayList<Book> bookList = new ArrayList<>();

        Book b1 = new Book();
        b1.setTitle("Java入門");
        b1.setPublishDate(f.parse("2011/10/07"));
        b1.setComment("スッキリわかる");
        bookList.add(b1);
        Book b2 = new Book();
        b2.setTitle("Python入門");
        b2.setPublishDate(f.parse("2019/06/11"));
        b2.setComment("カレーが食べたくなる");
        bookList.add(b2);
        Book b3 = new Book();
        b3.setTitle("C言語入門");
        b3.setPublishDate(f.parse("2018/06/21"));
        b3.setComment("ポインタも自由自在");
        bookList.add(b3);

        Collections.sort(bookList, new TitleComparator());
        // bookList.sort(new TitleComparator());

        for (Book b: bookList){
            System.out.println(
                b.getTitle() + " "
                + f.format(b.getPublishDate()) + " "
                + b.getComment()
            );
        }
    }
}