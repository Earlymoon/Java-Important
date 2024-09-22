package ArrayList;

public class Main {
    public static void main(String[] args) {
        CpArrayList list=new CpArrayList(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(0));
        System.out.println(list.remove(3));

    }
}
