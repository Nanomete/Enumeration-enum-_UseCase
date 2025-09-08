import java.util.Scanner;

enum Size {
    S(30.99),
    M(45.99),
    L(60.99),
    XL(95.99);

    private final double mPrice;

    Size(double price) {
        mPrice = price;
    }
    public double getPrice() {
        return mPrice;
    }
}

public class SizePrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size (S, M, L, XL): ");
        String input = scanner.nextLine().toUpperCase();
        switch (input) {
            case "S" -> System.out.println("Price for size S: $" + Size.S.getPrice()); // lambda expression
            case "M" -> System.out.println("Price for size M: $" + Size.M.getPrice());
            case "L" -> System.out.println("Price for size L: $" + Size.L.getPrice());
            case "XL" -> System.out.println("Price for size XL: $" + Size.XL.getPrice());
            default -> System.out.println("Invalid size entered. Please enter S, M, L, or XL.");
        }
        scanner.close();
    }
}
