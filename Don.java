import java.util.Scanner;

public class Don {

    public static void donate() {
        Scanner sc = new Scanner(System.in);
        MedicationDAO dao = new MedicationDAO();

        System.out.print("Nom du médicament : ");
        String name = sc.nextLine();

        System.out.print("Catégorie : ");
        String category = sc.nextLine();

        System.out.print("Date d'expiration (YYYY-MM-DD): ");
        String exp = sc.nextLine();

        System.out.print("Localisation : ");
        String location = sc.nextLine();

        try {
            dao.addMedication(new Medication(name, category, exp, location));
            System.out.println(" Médicament ajouté !");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erreur lors de l'ajout.");
        }
    }
}
