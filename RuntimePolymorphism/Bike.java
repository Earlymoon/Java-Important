package RuntimePolymorphism;

import java.util.List;

public class Bike {
//    Bike(){
//        System.out.println("Bike constructor");
//    }
    int check=50;
    void run(){
        System.out.println(Integer.valueOf(5));
    }
}
class Splendor extends Bike{
    void run(){
        System.out.println("Splendor bike is running");
    }
    int check=100;
    void milleage(){
        System.out.println("splendor mileage is 90km/l");
    }
}
class MoutainBike extends Bike{
    void run(){
        System.out.println("Mountain bike is running!");
    }
}
class main{
    public static void main(String[] args) {
//        Bike b=new Splendor();
        Splendor s=new Splendor();
        System.out.println(s.check);
//        s.milleage();s.run();
        List<Bike>bike= List.of(
            new Bike(),
                    new Splendor(),
            new MoutainBike()

        );
        for(Bike b:bike){
            b.run();
            System.out.println(b.check);
        }


    }
}