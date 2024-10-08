package BasicLLD.DesignPattern.Structural.Composite.ProblemStatement;

import This.Obj;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String directoryName;
    List<Object> objectList;

    public Directory(String directoryName){
        this.directoryName=directoryName;
        objectList=new ArrayList<>();
    }
    public void add(Object object){
        objectList.add(object);
    }

    public void ls(){
        System.out.println("Directory name "+directoryName);
        for(Object object:objectList){
            if(object instanceof Directory){
               ((Directory) object).ls();
            }
            else ((File)object).ls();
        }
//here lots of if else checks are there
    }

}
