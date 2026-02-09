package bankManagementSystem1;

import java.io.*;
import java.util.List;

public class FileUtil {

    private static final String FILE_NAME = "bank_data.dat";

    public static void saveAccounts(List<Account> accounts) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(accounts);
        } catch (IOException e) {
            System.out.println("Error saving data");
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Account> loadAccounts() {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return new java.util.ArrayList<>();
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Account>) ois.readObject();
        } catch (Exception e) {
            System.out.println("Error loading data");
            return new java.util.ArrayList<>();
        }
    }
}
