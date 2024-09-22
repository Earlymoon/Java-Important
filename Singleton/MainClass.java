package Singleton;

public class MainClass {
    public static void main(String[] args) {
        AppConfig obj1=AppConfig.getInstance();
        AppConfig obj2=AppConfig.getInstance();
        AppConfig obj3=AppConfig.getInstance();
        AppConfig obj4=AppConfig.getInstance();

//        now we call 4 object pointing to tha single time object creation
//        for this we use the haxvalue of each object

        System.out.println("hex value of obj1 is "+obj1.hashCode());
        System.out.println("hex value of obj2 is "+obj2.hashCode());
        System.out.println("hex value of obj3 is "+obj3.hashCode());
        System.out.println("hex value of obj4 is "+obj4.hashCode());
       if(obj1==obj2&&obj2==obj3&&obj3==obj4){
           System.out.println("all obj pints to single obj");
       }
       else{
           System.out.println("not same");
       }



    }
}
