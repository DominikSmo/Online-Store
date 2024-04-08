package StorewithComputers;

public class Computer {

    String name;
    String model;

    int coreNumbers;
    int Ram;
    double price;

    public Computer(String name, String model, int coreNumbers, int ram, double price) {
        this.name = name;
        this.model = model;
        this.coreNumbers = coreNumbers;
        this.Ram = ram;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", coreNumbers=" + coreNumbers +
                ", Ram=" + Ram +
                ", price=" + price +
                '}';
    }
}
