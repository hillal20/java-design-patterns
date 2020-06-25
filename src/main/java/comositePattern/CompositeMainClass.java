package comositePattern;

import java.awt.*;

public class CompositeMainClass {
    public static void main(String[] args){

   Component hardDrive = new Leaf(499, "hard-drive");
   Component fun = new Leaf(400, "fun");
   Component speaker = new Leaf(199, "speaker");
   Component battery = new Leaf(350, "battery");
   Component mouse  = new Leaf(35, "mouse");
   Component wires = new Leaf(20, "wires");


   Composites screen = new Composites("screen");
   Composites motherBoard= new Composites("motherBoard");
   Composites cabinet = new Composites("cabinet");
   Composites ph = new Composites("ph");
   Composites computer = new Composites("computer");

   ph.addComponent(mouse);
   ph.addComponent(speaker);

   cabinet.addComponent(hardDrive);
   cabinet.addComponent(battery);
   cabinet.addComponent(fun);
   cabinet.addComponent(motherBoard);

   motherBoard.addComponent(wires);
   screen.addComponent(speaker);

   computer.addComponent(motherBoard);
   computer.addComponent(cabinet);
   computer.addComponent(screen);
   computer.addComponent(ph);


   computer.showPrice();

    }
}
