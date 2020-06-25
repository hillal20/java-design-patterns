package oberverPattern;

import java.util.ArrayList;
import java.util.List;

public class Chanel implements ChanelInterface {

  private   List<Subscriber> subscribers = new ArrayList<>();
  public String videoTitle;

  @Override
  public void subscribe(Subscriber sub){
      subscribers.add(sub);

  }
  @Override
  public void notifySubscriber(){
      for (Subscriber sub : subscribers){
          sub.update();
      }
  }

  @Override
  public void  unSubscribe(Subscriber sub){
      subscribers.remove(sub);
  }

@Override
public void upload(String videoTitle){
      this.videoTitle = videoTitle;
      this.notifySubscriber();
}
}
