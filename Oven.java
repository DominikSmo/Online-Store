package StorewithComputers;

public class Oven {

    String name;
    String model;
    int amount;
    double price;




    public Oven(String name, String model,  int amount, double price) {
        this.name = name;
        this.model = model;
        this.amount = amount;
        this.price = price;

    }


    @Override
    public String toString() {
        return "Oven{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}



