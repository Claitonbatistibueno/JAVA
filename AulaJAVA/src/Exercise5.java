import com.sun.security.jgss.InquireType;

public class Exercise5 {
    public static void main(String[] args) {
        //Abertura
        Product obj1;
        obj1 = new Product ("Rise", 5, 380);
        obj1.displayInfo();
    }
}
//Atributos
class Product {
    String name;
    int preci;
    int quantity;
    //Construct
    public Product(String inName, int inPreci, int inQuantity) {
    name = inName;
    preci = inPreci;
    quantity = inQuantity;

    }
    //DisplayInfo
    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Preci : " + preci);
        System.out.println("Quantity : " + quantity);
    //Condicional
        if (quantity > 10) {
            System.out.println("Highest stock");
        } else  {
            System.out.println("Low stock");
        }
    }
}
