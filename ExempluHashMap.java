import java.util.HashMap;

public class ExempluHashMap {
    public static void main(String[] args) {
        HashMap<String, String> tariCapitala = new HashMap<>();
        tariCapitala.put("Romania", "Bucuresti");
        tariCapitala.put("Franta", "Paris");
        tariCapitala.put("Italia", "Roma");

        // Accesare prin cheie
        System.out.println("Capitala Frantei este: " + tariCapitala.get("Franta"));

        // Parcurgere
        for (String tara : tariCapitala.keySet()) {
            System.out.println(tara + " - " + tariCapitala.get(tara));
        }
    }
}
