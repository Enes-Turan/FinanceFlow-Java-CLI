import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FinanceManager manager = new FinanceManager();
        Scanner scanner = new Scanner(System.in);

        manager.addTransaction(new Income(15000, "Maas", LocalDate.now()));
        manager.addTransaction(new Expense(2500, "Kira", LocalDate.now()));

        while (true) {
            System.out.println("\n--- FinanceFlow CLI ---");
            System.out.println("1. Islem Listele");
            System.out.println("2. Toplam Bakiye");
            System.out.println("3. Kategori Analizi");
            System.out.println("4. Cikis");
            System.out.print("Secim: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                manager.getTransactions().forEach(System.out::println);
            } else if (choice == 2) {
                System.out.println("Guncel Bakiye: " + manager.calculateBalance() + " TL");
            } else if (choice == 3) {
                manager.getCategoryBreakdown().forEach((cat, amt) ->
                        System.out.println(cat + ": " + amt + " TL"));
            } else if (choice == 4) {
                break;
            }
        }
        scanner.close();
    }
}