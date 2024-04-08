package StorewithComputers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    public static void main(String[] args) {


        List<Computer> storage = new ArrayList<>();

        Computer laptop = new Computer("ASUS", "B15", 4, 8, 3200.68);
        Computer laptop1 = new Computer("Lenovo", "Ideapad", 2, 16, 4000.10 );
        Computer laptop2 = new Computer("Acer", "Aspire3", 4, 16, 3699.99);

        storage.add(laptop);
        storage.add(laptop1);
        storage.add(laptop2);

        System.out.println(Arrays.toString(new List[]{storage}));

        List<Oven> storage1 = new ArrayList<>();

        Oven oven = new Oven("Gorenje", "Classico", 30, 3089.00);
        Oven oven1 = new Oven("Amica", "Family", 56, 2499.00);
        Oven oven2 = new Oven("Whirlpool", "FFB", 34, 3504.94);

        storage1.add(oven);
        storage1.add(oven1);
        storage1.add(oven2);

        System.out.println(storage1);

        List<Phone> storage2 = new ArrayList<>();

        Phone phone = new Phone("Samsung", "SS720", "Android", 500, 899.91);
        Phone phone1 = new Phone("Xiaomi", "X8", "Android", 384, 1000.91);
        Phone phone2 = new Phone("Nokia", "NN18", "Producent", 48, 1209.90 );

        storage2.add(phone);
        storage2.add(phone1);
        storage2.add(phone2);

        System.out.println(storage2);




    }
}
