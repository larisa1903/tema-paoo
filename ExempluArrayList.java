import java.util.ArrayList;
public class ExempluArrayList {
    public static void main(String[] args) {
        ArrayList<String> fructe = new ArrayList<>();
        fructe.add("Mar");
        fructe.add("Banana");
        fructe.add("Pere");

        // Acces prin index
        System.out.println("Primul fruct: " + fructe.get(0));

        // Parcurgere
        for (String fruct : fructe) {
            System.out.println("Fruct: " + fruct);
        }
    }
}
