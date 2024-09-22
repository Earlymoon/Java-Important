package BasicLLD.DesignPattern.Creational.Sigleton;

import java.awt.dnd.DropTarget;

public class Database {
//    make the constructor private
    private Database(){

    }

    private static Database database=null;

    public static Database getDatabase(){

        if(database==null){
            synchronized (Database.class){
                if(database==null){
                    database=new Database();
                }
            }

        }
        return database;

    }
}
