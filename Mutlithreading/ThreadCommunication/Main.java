package Mutlithreading.ThreadCommunication;

public class Main {
    public static void main(String[] args) {
        Test test=new Test();
        new Producer(test);
        new Consumer(test);
    }
}
