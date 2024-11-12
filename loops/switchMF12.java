package loops;
import java.util.Scanner;
public class switchMF12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter M or F: ");
        char gender = scanner.next().charAt(0);

        switch (gender) {
            case 'M':
            case 'm':
                System.out.println("Gender: Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Gender: Female");
                break;
            default:
                System.out.println("Invalid input");
        }

        scanner.close();
    }
}

    

