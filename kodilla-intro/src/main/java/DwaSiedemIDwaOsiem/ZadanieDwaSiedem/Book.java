package DwaSiedemIDwaOsiem.ZadanieDwaSiedem;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Book {
    private String author;
    private String title;

    @Contract(pure = true)
    public static @NotNull Book of (String author, String title){
        Book book=new Book();
        return book;

    }

}
