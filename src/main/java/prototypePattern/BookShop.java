package prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

    private String name;
    private List<Book> listOfBooks = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(List<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public void loadData(){
        for(int i = 0 ; i < 10; i++){
             Book book = new Book();
             book.setId(i);
             book.setName("book-"+i);
            listOfBooks.add(book);
        }
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        // this will only return a shallow copy
       // return super.clone();

        // this will clone the all the books were added to the original bookShop
        BookShop newBookShop = new BookShop();
          for(Book b : this.listOfBooks){
               newBookShop.getListOfBooks().add(b);
          }
          return newBookShop;
    };

    @Override
    public String toString() {
        return "BookShop{" +
                "name='" + name + '\'' +
                ", listOfBooks=" + listOfBooks +
                '}';
    }
}
