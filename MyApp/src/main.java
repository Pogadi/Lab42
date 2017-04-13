

public class main {
 public static void main(String[] args) {
 Product product = new Product("Edam", 3.3, 120);
 product.changePrice(5); // Testing new price method;
 product.changeBalance(1000); // Testing new balance method;
 System.out.println("Product value is " + product.countValue());
 product.printProduct();
 }
}
class Product {
private String name;
private double price;
private int amount; //Amount in storage
public Product(String name, double price, int amount) {
this.name = name;
this.price = price;
this.amount = amount;
}
//Adding method for branch b1.
public int changeBalance(int newvalue){
this.amount = newvalue;
return amount;
}
//Adding method for branch b2
public double changePrice(double newprice){
this.price = newprice;
return price;
}

public double countValue() {
return(amount * price);
}
public void printProduct() {
System.out.printf("Product %s, price %4.1f and balance %d pcs",
name,price,amount);
}
}