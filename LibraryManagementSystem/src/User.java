import java.util.Scanner;

public class User extends Edit{
    public static void main(String[] args) {
        User user = new User();

        int end= 0;
        while (end != 1){
            System.out.println(" 1) Show All Books ");
            System.out.println(" 2) Search Book by Book number ");
            System.out.println(" 3) Find Author Book ");
            System.out.println(" 4) Exit ");
            System.out.println("Enter your choice:  ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    user.showBooks();
                break;
                case 2:
                    user.book_Number();
                break;
                case 3:
                    user.authorBook();
                break;
                case 4:
                    end = 1;
                break;
                default:
                    System.out.println("Invalid choice.");
                break;
            }
        }
    }
}
