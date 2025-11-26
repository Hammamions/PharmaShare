import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MedicationDAO dao = new MedicationDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== PharmaShare ===");
            System.out.println("1. Donner un médicament");
            System.out.println("2. Recevoir un médicament");
            System.out.println("3. Quitter");
            System.out.print("Choix : ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> Don.donate();
                case 2 -> receive.receive();
                case 3 -> System.exit(0);
                default -> System.out.println("Choix invalide");
            }
        }
    }
}

