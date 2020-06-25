package oberverPattern;

public class ObserverMain {



    public static void main(String[] args){
       Chanel chanel1 = new Chanel();

        Subscriber subscriber1 = new Subscriber("subscriber1");
        Subscriber subscriber2 = new Subscriber("subscriber2");
        Subscriber subscriber3 = new Subscriber("subscriber3");
        Subscriber subscriber4 = new Subscriber("subscriber4");

        chanel1.subscribe(subscriber1);
        chanel1.subscribe(subscriber2);
        chanel1.subscribe(subscriber3);
        chanel1.subscribe(subscriber4);

        subscriber1.subscribedInChanel(chanel1);
        subscriber2.subscribedInChanel(chanel1);
        subscriber3.subscribedInChanel(chanel1);
        subscriber4.subscribedInChanel(chanel1);


        chanel1.upload("video-1");
    }
}
