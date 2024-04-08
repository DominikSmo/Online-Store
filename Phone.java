package StorewithComputers;

public class Phone {

    String name;
    String model;
    String operationSystem;
     int amount;
     double price;




    public Phone(String name, String model, String operationSystem, int amount, double price) {
        this.name = name;
        this.model = model;
        this.operationSystem = operationSystem;
        this.amount = amount;
        this.price = price;

    }



        @Override
        public String toString() {
            return "Phone{" +
                    "name='" + name + '\'' +
                    ", model='" + model + '\'' +
                    ", operationSystem='" + operationSystem + '\'' +
                    ", amount=" + amount +
                    ", price=" + price +
                    '}';



    }
}
