package BasicLLD.DesignPattern.Creational.PrototypeDeepCopy;
import java.util.ArrayList;
import java.util.*;
public class NetworkConnection implements Cloneable {
    private String ip;
    private String importantData;

//    lets a create an object type which stores references
    private List<String>domains=new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public String toString(){
        return this.ip+" "+this.importantData+" :"+this.domains;
    }

    public void loadImportantData() throws InterruptedException {
        Thread.sleep(5000);
        this.importantData="Very important data is loading";
        this.domains.add("www.gooogle.com");
        this.domains.add("www.yt.com");
        this.domains.add("lld discussion.com");
    }
    protected Object clone() throws CloneNotSupportedException{
//    here before returing clone of the network connection we return a new network coonection
//        after coping domains sepearately
        NetworkConnection networkConnection=new NetworkConnection();
        networkConnection.setIp(this.ip);
        networkConnection.setImportantData(this.importantData);
        for(String domain:this.domains){
            networkConnection.getDomains().add(domain);
        }

//        return super.clone();
        return networkConnection;
    }
}
