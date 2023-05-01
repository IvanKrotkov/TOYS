import java.util.ArrayList;
import java.util.Random;


public class ListToys<T extends Toy> {
    private ArrayList<T> toys;
    private int amountToys;

    public ListToys() {
        this.toys = new ArrayList<>();
    }

    public void addToy(T toy) {
        this.toys.add(toy);
        this.amountToys += toy.getAmount();
        if (toy.getRarity() == 0) {
            if (!this.toys.isEmpty()) {
                for (T tos : this.toys) {
                    tos.setRarityDefault(this.amountToys);
                }
            } else {
                toy.setRarityDefault(1);
                this.amountToys = toy.getAmount();
            }
        } else {
            if (!this.toys.isEmpty()) {
                setRarityToys(toy);
            }
        }
    }

    public int getAmountToys() {
        return this.amountToys;
    }
    public Toy getToy() {
        ArrayList<String> names = probably();
        if (names.isEmpty()) return null;
        int rnd = new Random().nextInt(names.size());
        String nameToy = names.get(rnd);
        for (Toy t : this.toys) {
            if (t.getName() == nameToy) {
                this.toys.remove(t);
                return t;
            }
        }
        return null;
    }
    public void setProbably(String name,double rarity){
        for (Toy toy: this.toys) {
            if (toy.getName()==name){
                toy.setRarity(rarity);
                setRarityToys(toy);
                return;
            }else System.out.println("Игрушка не найдена");
        }
    }
    private void setRarityToys(Toy toy){
        double prob = toy.getRarity();
        for (T tos : this.toys) {
            tos.setRarity((1 - prob) / (this.amountToys - toy.getAmount()));
        }
    }
    private ArrayList<String> probably() {
        ArrayList<String> nameToys = new ArrayList<>();
        for (Toy t : this.toys) {
            if (t.getRarity() != 0) {
                for (int i = 0; i < (int) Math.round(t.getRarity() * this.amountToys); i++) {
                    nameToys.add(t.getName());
                }
            } else {
                for (int i = 0; i < t.getAmount(); i++) {
                    nameToys.add(t.getName());
                }
            }
        }
        return nameToys;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Toy t : this.toys) {
            sb.append(t);
            sb.append("\n");
        }
        if (this.toys.isEmpty()) return "Игрушек больше нет";
        return sb.toString();
    }
    public boolean isEmpty(){
        return this.toys.isEmpty();
    }
}
