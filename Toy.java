
public class Toy {
    private Identificate id;
    private String name;
    private int amount;
    private double rarityDefault;
    private double rarity;

    public Toy(String name, int amount){
        this.name = name;
        this.amount = amount;
        this.id = new Identificate();
    }
    public Identificate getId() {
        return this.id;
    }
    public void setRarityDefault(int size){
        this.rarityDefault = (double) 1/size;
    }

    public double getRarityDefault() {
        return this.rarityDefault;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setRarity(double rarity) {
        if (rarity >= 1 | rarity < 0){
            throw new RuntimeException("Вероятность не может быть больше 1 или меньше 0");
        }
        this.rarity = rarity;
    }

    public double getRarity() {
        return this.rarity;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }
}




