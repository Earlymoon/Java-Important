package BasicLLD.DesignPattern.Behavioral.Observer;

interface Subject {
    public void subscribe(Observer ob);
    public void unsubscrive(Observer ob);

    public void newVideoUploaded(String title);

}
