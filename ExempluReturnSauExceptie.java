public class ExempluReturnSauExceptie {

    // Variante cu return null
    public String cautaUser(String nume) {
        if (nume == null || nume.isEmpty()) {
            return null;
        }
        return "UserGasit:" + nume;
    }

    // Varianta cu exceptie
    public String cautaUserCuExceptie(String nume) throws IllegalArgumentException {
        if (nume == null || nume.isEmpty()) {
            throw new IllegalArgumentException("Numele nu poate fi null sau gol.");
        }
        return "UserGasit:" + nume;
    }

    public static void main(String[] args) {
        ExempluReturnSauExceptie ex = new ExempluReturnSauExceptie();

        // folosind null
        String user = ex.cautaUser("");
        if (user == null) {
            System.out.println("User inexistent");
        }

        // folosind exceptie
        try {
            String user2 = ex.cautaUserCuExceptie("");
        } catch (IllegalArgumentException e) {
            System.out.println("Exceptie prinsa: " + e.getMessage());
        }
    }
}
