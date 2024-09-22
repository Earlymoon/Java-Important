package Encapsulation;
class Rectangel{
    int legth;
    int breath;

    public Rectangel(int legth, int breath) {
        this.legth = legth;
        this.breath = breath;
    }
    int Area(){
        return legth*breath;
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangel rec=new Rectangel(1,2);
        System.out.println(rec.Area());
    }

}
