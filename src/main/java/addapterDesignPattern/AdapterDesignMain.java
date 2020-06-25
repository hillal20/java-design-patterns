package addapterDesignPattern;

public class AdapterDesignMain {

    public static void main(String[] args){

        Assignment assignment = new Assignment("java-topic");
        System.out.println("===> " + assignment.write( new PenImplementation() ));


    }
}
