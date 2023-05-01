
import java.util.Random;

public class Identificate {
    private int keyA;
    private String keyB;
    public Identificate() {
        this.keyA = new Random().nextInt(1000);
        this.keyB = getKeyStr();
    }
    private String getKeyStr(){
        String[] a = new String[]{"a","b","c","d","e","f","g","h","j"};
        int rnd = new Random().nextInt(a.length);
        return a[rnd];
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(this.keyA);
        str.append(this.keyB);
        return str.toString();
    }
}
