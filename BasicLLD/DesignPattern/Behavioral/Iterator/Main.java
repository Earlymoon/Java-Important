package BasicLLD.DesignPattern.Behavioral.Iterator;
import java.util.*;


public class Main {
    public static void main(String[] args) {
         List<Book>bookList=Arrays.asList(new Book("science",100),
                 new Book("Maths",200),
                 new Book("hindi",300));

         Library library=new Library(bookList);
        Iterator iterator= library.createIterator();

        while (iterator.hasNext()){
            Book book=(Book) iterator.next();
            System.out.println(book.getName());
        }


    }
}
