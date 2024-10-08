package BasicLLD.DesignPattern.Structural.Composite.Solution1;

public class File implements FileSystem{
    String fileName;
    File(String fileName){
        this.fileName=fileName;

    }
    @Override
    public void ls() {
        System.out.print(fileName+"\\");

    }
}
