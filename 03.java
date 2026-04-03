import java.util.Scanner;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        if (name1.equals(name2)) {
            System.out.println("Case-sensitive: Names are equal");
        } else {
            System.out.println("Case-sensitive: Names are not equal");
        }

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Case-insensitive: Names are equal");
        } else {
            System.out.println("Case-insensitive: Names are not equal");
        }
    }
}
