package oberverPattern;

public class Subscriber implements SubscriberInterface {

 private String name;
private  Chanel  chanel;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(){
    System.out.println(" hey " + this.name + "??? uploaded video =====>"+ this.chanel.videoTitle);
}

@Override
public void subscribedInChanel(Chanel ch){
    this.chanel = ch;
}

}
