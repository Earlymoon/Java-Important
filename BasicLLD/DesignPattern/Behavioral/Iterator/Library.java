package BasicLLD.DesignPattern.Behavioral.Iterator;

import java.util.*;
public class Library implements Aggregate {
    private List<Book>bookList;

    public Library(List<Book>bookList){
        this.bookList=bookList;
    }


    @Override
    public Iterator createIterator() {
        return new BookIterator(bookList);
    }
}
