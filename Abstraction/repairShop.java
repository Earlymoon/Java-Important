package Abstraction;

import java.util.Scanner;

public class repairShop {
    public static void repairCar(Car car){
        System.out.println("car is repaired");
    }


    public static void main(String[] args) {
        Audi audi=new Audi();
        Maruti maruti=new Maruti();
        repairCar(audi);
        repairCar(maruti);
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

    }
}
