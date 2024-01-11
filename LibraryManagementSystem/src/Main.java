import java.util.Scanner;

public class Main extends Edit{
    public static void main(String[] args) {
        Main main = new Main();
        int end = 0;
        while (end!= 1){
            System.out.println(" 1)Add new book ");
            System.out.println(" 2)Show All Books ");
            System.out.println(" 3)Delete book or book by category or title ");
            System.out.println(" 4)Edit book information ");
            System.out.println(" 5)Search Book by Book Number ");
            System.out.println(" 6)Find author books ");
            System.out.println(" 7)Add User ");
            System.out.println(" 8)Show All Users ");
            System.out.println(" 9)Checkout Book ");
            System.out.println(" 10)Return the Book.");
            System.out.println(" 11)Exit ");
            System.out.println("Enter your choice:  ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    main.addBook();
                 break;
                case 2:
                    main.showBooks();
                 break;
                case 3:
                    main.deleteBook();
                 break;
                case 4:
                    main.editBook();
                 break;
                case 5:
                    main.book_Number();
                 break;
                case 6:
                    main.authorBook();
                 break;
                case 7:
                    main.addUser();
                 break;
                case 8:
                    main.showUsers();
                 break;
                case 9:
                    main.checkOut();
                 break;
                case 10:
                    main.checkIn();
                 break;
                case 11:
                    end = 1;
                 break;
                default:
                    System.out.println("Invalid Choice...");
                 break;
            }
        }
    }
}
