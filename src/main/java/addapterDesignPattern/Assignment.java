package addapterDesignPattern;

public class Assignment {
     public  String message;

    public Assignment(String message) {
        this.message = message;
    }

    public String write(Pen pen){
        return " i am writing "+ this.message + "via the pen " + pen.write("that I love");
    }
}
