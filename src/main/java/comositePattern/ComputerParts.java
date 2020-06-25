package comositePattern;

import java.util.ArrayList;
import java.util.List;



interface Component{
     void showPrice();
}

class Leaf implements Component{

    private int price;
    private String name;

    public Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public void showPrice(){
         System.out.println("==> leaf Name : "+ name + " &&  price  : " + price);
     }
}



class Composites implements Component{

    private String name;
    private List<Component> componentsList = new ArrayList<>();


    public Composites(String name) {
        this.name = name;
    }

    public void addComponent(Component component){
         componentsList.add(component);
   }

    public void showPrice(){
        System.out.println("***  composite Name : " + name + " **** ");
        for(Component c : componentsList){
             c.showPrice();
        }
    }
}