package BasicLLD.DesignPattern.Behavioral.Iterative;
import java.util.List;
public class MyIteratorImpl implements MyIterator{

    List<User>userList;
    int length;
    int position=0;
    public MyIteratorImpl(List<User> userList) {
        this.userList=userList;
        length=userList.size();
    }

    @Override
    public boolean hasNext() {
        if(position>=length)return false;
        return true;
    }

    @Override
    public Object next() {
        User user=userList.get(position);
        position+=1;
        return user;

    }
}
