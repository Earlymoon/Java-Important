package Singleton;

public class AppConfig {
    String name;

//    make its default constructor private
    private AppConfig(){
        name="my name is chandra";

    }

//    create a object of this class
    public static AppConfig obj=null;

    public static AppConfig getInstance(){
        if(obj==null){
            obj=new AppConfig();
        }
        return obj;
    }


}
