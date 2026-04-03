//question no 5

import java.util.Scanner;

class FileExtensionExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept file name
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        // Find position of dot
        int index = fileName.lastIndexOf(".");

        // Extract extension using substring()
        if (index != -1 && index != fileName.length() - 1) {
            String extension = fileName.substring(index + 1);
            System.out.println("File Extension: " + extension);
        } else {
            System.out.println("No file extension found.");
        }

        sc.close();
    }
}
