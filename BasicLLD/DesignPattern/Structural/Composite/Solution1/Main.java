package BasicLLD.DesignPattern.Structural.Composite.Solution1;

public class Main {
    public static void main(String[] args) {
        Directory directory=new Directory("Movie");
        Directory movieType1=new Directory("Comedy");
        Directory movieType2=new Directory("Action");
        directory.add(movieType1);
        directory.add(movieType2);
//        directory.ls();
        movieType2.add(new File("singham"));
        movieType1.add(new File("hungama"));
        directory.ls();

    }
}
