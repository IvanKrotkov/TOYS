import java.util.Random;

public interface GetToys {
    default ListToys<Toy> getToys() {
        ListToys<Toy> toys = new ListToys<>();
        String[] names = new String[]{"Car", "Cat", "Doll"};
        for (int i = 0; i < names.length; i++) {
            Toy toy = new Toy(names[i], new Random().nextInt(10));
            toys.addToy(toy);
        }
        return toys;
    }
}
