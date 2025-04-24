import java.io.*;

public class ExempluExceptii {

    // Checked Exception - trebuie tratată sau declarată cu throws
    public void citesteFisier(String numeFisier) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(numeFisier));
        System.out.println(reader.readLine());
        reader.close();
    }

    // Unchecked Exception - poate apărea la runtime, nu e necesar să fie declarată
    public int imparte(int a, int b) {
        return a / b; // poate arunca ArithmeticException (unchecked)
    }

    public static void main(String[] args) {
        ExempluExceptii ex = new ExempluExceptii();

        try {
            ex.citesteFisier("test.txt");
        } catch (IOException e) {
            System.out.println("Eroare la citirea fișierului: " + e.getMessage());
        }

        System.out.println("Rezultat: " + ex.imparte(10, 2));
    }
}
