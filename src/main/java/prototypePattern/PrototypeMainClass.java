package prototypePattern;

public class PrototypeMainClass  {


    public static void main(String[] args ) throws CloneNotSupportedException{

        BookShop bookShop1 = new BookShop();
        bookShop1.setName("bournsNobles-1");
        bookShop1.loadData();




        BookShop bookShop2 =  bookShop1.clone();
        bookShop2.setName("bournsNobles-2");

        // bookShop2 will never get affected from the remove because it is an independent obj since the clone is not shallow
        bookShop1.getListOfBooks().remove(2);
        System.out.println("  bookShop-1 ===> "+ bookShop1);
        System.out.println(" bookShop-2 ===> "+ bookShop2);



    }
}
