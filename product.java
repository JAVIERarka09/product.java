public class product{
 
     int number ;
     String name ;
     int quantity ;
     double price ;

    public product (){
        name = "";
        number = 0;
        quantity = 0;
        price = 0.0;
    }

    public product (int number, String name, int quantity, double price){
        this.name = name;
        this.number = number;
        this.quantity = quantity;
        this.price = price;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getquantity() {
        return this.quantity;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void print(){
        System.out.println("Number/t:" + number);
        System.out.println("Name/t:" + name);
        System.out.println("Quantitiy/t:" + quantity);
        System.out.println("Price/t:" + price);
    }

    

}
