package oberverPattern;

public interface ChanelInterface {
    void subscribe(Subscriber sub);

    void notifySubscriber();

    void  unSubscribe(Subscriber sub);

    void upload(String videoTitle);
}
