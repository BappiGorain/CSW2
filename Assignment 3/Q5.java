
import java.util.HashMap;

class Book {
    int id;
    String name;
    String Auther;
    int quantity;

    public Book(int id, String name, String auther, int quantity) {
        this.id = id;
        this.name = name;
        Auther = auther;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return Auther;
    }

    public void setAuther(String auther) {
        Auther = auther;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

class Library {

    HashMap<Integer, Book> map = new HashMap<>();

    public void addBook(int id, String name, String auther, int quantity) {
        Book b = new Book(id, name, auther, quantity);
        map.put(id, b);
    }

    public void showBooks() {
        for (Book book : map.values()) {
            System.out.println("ID:" + book.getId() + ", Name:" + book.getName() + ", Auther:" + book.getAuther()
                    + ", Quantity:" + book.getQuantity());
        }
    }

    public void cheakBook(String auther) {
        boolean flag = true;
        for (Book book : map.values()) {
            if (book.getAuther().equals(auther)) {
                System.out.println("Book is present");
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Book Not Found:");
        }
    }

    public void removeBook(int id) {
        map.remove(id);
    }

}

class Q5 {
    public static void main(String[] args) {
        Library l = new Library();
        l.addBook(1, "Head First Java", "Kathy Sierra, Bert Bates", 10);
        l.addBook(2, "Java The Complete Reference", " Herbert Schildt", 20);

        l.showBooks();

        l.cheakBook("Kathy Sierra, Bert Bates");

        l.removeBook(1);

        l.showBooks();
    }
}
