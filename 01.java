import java.util.Scanner;

class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        username = username.trim().toLowerCase();
        System.out.println(username);
    }
}
