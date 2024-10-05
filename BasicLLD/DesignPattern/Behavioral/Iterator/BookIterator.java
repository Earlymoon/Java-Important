package BasicLLD.DesignPattern.Behavioral.Iterator;

import java.util.List;

public class BookIterator implements Iterator{
    private int index=0;
    private List<Book>bookList;

    BookIterator(List<Book>bookList){
      this.bookList=bookList;
    }
    @Override
    public boolean hasNext() {
        return index<bookList.size();
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return bookList.get(index++);
        }
        return null;
    }
}
