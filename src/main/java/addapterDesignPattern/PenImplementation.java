package addapterDesignPattern;

public class PenImplementation implements Pen {


    public PenImplementation() {
    }

    public String write(String message){
        RedPen rp = new RedPen();
       return  rp.writeRed(message);
    }

}
