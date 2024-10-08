package BasicLLD.DesignPattern.Structural.Composite.ProblemStatement;

public class Main {
    public static void main(String[] args) {
        Directory directory=new Directory("Movie");
        File file=new File("Border");
        directory.add(file);

        Directory comedyMovies=new Directory("Comedy");
        File comedyMovie=new File("Hungama");
        File comedyMovie2=new File("Hulchul");
        File comedyMovie3=new File("hera pheri");
        comedyMovies.add(comedyMovie);
        comedyMovies.add(comedyMovie2);
        comedyMovies.add(comedyMovie3);

        directory.add(comedyMovies);

        directory.ls();

    }
}
