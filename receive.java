import java.sql.SQLException;
import java.util.List;

public class receive{

    public static void receive() {
        MedicationDAO dao = new MedicationDAO();

        try {
            List<Medication> meds = dao.getAll();
            System.out.println("\n--- Médicaments disponibles ---\n");

            for (Medication m : meds) {
                System.out.println("Nom : " + m.getName());
                System.out.println("Catégorie : " + m.getCategory());
                System.out.println("Expiration : " + m.getExpirationDate());
                System.out.println("Localisation : " + m.getLocation());
                System.out.println("-------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
