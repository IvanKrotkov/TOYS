import java.io.IOException;
import java.util.Scanner;

public class Presenter implements View,GetToys,GetToyInFile{
    private ListToys<Toy> toys = getToys();

    @Override
    public void getData() throws IOException {
        System.out.println("Выберите опцию: " +
                "\nДобавить игрушку в розыгрыш - add " +
                "\nИзменить вероятность выпадения игрушки - prob" +
                "\nПровести розыгрыш - draw" +
                "\nПоказать список игрушек - check" +
                "\nВыйти - esc: ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        switch (option) {
            case "add":
                System.out.println("Введите имя игрушки: ");
                String name = scanner.nextLine();
                System.out.println("Введите количество данных игрушек: ");
                int amount = scanner.nextInt();
                toys.addToy(new Toy(name, amount));
                getData();
                break;
            case "prob":
                System.out.println(toys);
                System.out.println("Выберите игрушку: ");
                name = scanner.nextLine();
                Double rarity = scanner.nextDouble();
                toys.setProbably(name, rarity);
                getData();
                break;
            case "draw":
                if (toys.isEmpty()) {
                    System.out.println(toys.toString());
                    scanner.close();
                    break;
                }
                write(toys.getToy());
                getData();
                break;
            case "check":
                System.out.println(toys.toString());
                getData();
                break;
            case "esc":
                scanner.close();
                break;
        }
    }
}
