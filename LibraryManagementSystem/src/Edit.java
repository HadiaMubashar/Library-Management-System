import java.util.ArrayList;
import java.util.Scanner;

public class Edit {
    Scanner scanner = new Scanner(System.in);

    String[] name = new String[20];
    String[] author = new String[20];
    long[] edition = new long[20];
    int[] pages = new int[20];
    int[] isbn = new int[20];
    String[] status = new String[20];
    String availablilitystatus = "Available";

    int counter = 0;
    int countusers =0;
    int checkout = 0;

    int[] libraryCardnumber = new int[20];
    String[] username= new String[20];
    String[] contract = new String[20];
    int[] bookcheckout = new int[20];


    public void addBook(){
        System.out.println("Enter Book name: ");
        name[counter] = scanner.next();
        System.out.println("Enter author name: ");
        author[counter] = scanner.next();
        System.out.println("Enter Book edition: ");
        edition[counter] = scanner.nextLong();
        System.out.println("Enter Book pages: ");
        pages[counter] = scanner.nextInt();
        status[counter] =availablilitystatus;

        isbn[counter] = counter;
        counter++;
        System.out.println("Book Add Successfully.....");
    }

    public void showBooks(){
        for (int i= 0; i < counter; i++){
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("Book number................ "+ isbn[i]);
            System.out.println("Book name: "+ name[i]);
            System.out.println("Book Author name: "+ author[i]);
            System.out.println("Book edition: "+ edition[i]);
            System.out.println("Book pages: "+ pages[i]);
            System.out.println("Current availability status: "+ status[i]);
        }
        System.out.println("---------------------------------------------------------------------------------");
    }

    public void deleteBook(){

        String[] name1 = new String[counter - 1];
        String[] author1 = new String[counter - 1];
        long[] edition1 = new long[counter - 1];
        int[] pages1 = new int[counter - 1];

        System.out.println("Enter Book name or title: ");
        String title = scanner.next();
        for (int i = 0; i < counter; i++){
            if (title.equals(name[i])){
                System.out.println("Book Found.");
                System.out.println("Do You want to Delete the Book? "+ "Book Name..."+ title);
                System.out.println(" A. Yes ");
                System.out.println(" B. No ");
                String choice = scanner.next();
                if (choice.equals("Á")){
                    System.out.println("Delete Book Successfully");
                }
            }
            else {
                System.out.println("Book not found.");
            }
        }
    }

    public void editBook(){
        System.out.println("Enter Book name: ");
        String bookname = scanner.next();
        System.out.println("Enter author name: ");
        String authorname = scanner.next();
        long bookedition;
        int bookpage;
        int check = 0;
        for (int i = 0; i< counter; i++){
            if (bookname.equals(name[i]) && authorname.equals(author[i])){
                System.out.println("Book Found");
                System.out.println("Enter new name: ");
                bookname = scanner.next();
                System.out.println("Enter new author name: ");
                authorname = scanner.next();
                System.out.println("Enter new book edition: ");
                bookedition = scanner.nextLong();
                System.out.println("Enter new book pages");
                bookpage = scanner.nextInt();

                name[i] = bookname;
                author[i] = authorname;
                edition[i] = bookedition;
                pages[i] = bookpage;
                System.out.println("Updated data!!");
                System.out.println("Book name:  "+ name[i]);
                System.out.println("Book author:  "+ author[i]);
                System.out.println("Book edition:  "+ edition[i]);
                System.out.println("Book pages:  "+ pages[i]);
                check = 1;
                break;
            }
        }
        if (check == 0){
            System.out.println("Book Not Found...");
        }
    }
    public void book_Number(){
        System.out.println("Enter book number: ");
        int booknumber = scanner.nextInt();
        int check = 0;
        for (int i = 0; i < counter; i++){
            if (booknumber == i){
                System.out.println("---------------------------------------------------------------------------------");
                System.out.println("Book number................ "+ isbn[i]);
                System.out.println("Book name: "+ name[i]);
                System.out.println("Book Author name: "+ author[i]);
                System.out.println("Book edition: "+ edition[i]);
                System.out.println("Book pages: "+ pages[i]);
                check = 1;
            }
        }
        System.out.println("---------------------------------------------------------------------------------");
        if (check == 0){
            System.out.println("Book Not Found...");
        }
    }
    public void authorBook(){
        System.out.println("Enter author name: ");
        String authorname = scanner.next();
        int check = 0;

        for (int i = 0; i < counter; i++){
            if (authorname.equals(author[i])){
                System.out.println("---------------------------------------------------------------------------------");
                System.out.println("Book number................ "+ isbn[i]);
                System.out.println("Book name: "+ name[i]);
                System.out.println("Book Author name: "+ author[i]);
                System.out.println("Book edition: "+ edition[i]);
                System.out.println("Book pages: "+ pages[i]);
                System.out.println("---------------------------------------------------------------------------------");
                check = 1;
            }
        }
        if (check == 0){
            System.out.println("Book Not Found...");
        }
    }
    public void addUser(){
        System.out.println("Enter name: ");
        username[countusers] = scanner.next();
        System.out.println("Contact number: ");
        contract[countusers] = scanner.next();
        bookcheckout[countusers] = checkout;
        System.out.println("User add Successfully..");

        libraryCardnumber[countusers] = countusers;
        countusers++;
    }

    public void showUsers(){
        for (int i = 0; i < countusers; i++){
            System.out.println("---------------------------------------------------------------");
            System.out.println("User Library Card Number is: "+ libraryCardnumber[i]);
            System.out.println("Username: "+ username[i]);
            System.out.println("Contact number: "+ contract[i]);
            System.out.println("Checkout Books of User is: "+ bookcheckout[i]);
        }
        System.out.println("---------------------------------------------------------------");
    }


    public void checkOut(){
        System.out.println("Enter username: ");
        String user = scanner.next();
        System.out.println("Enter library card number: ");
        int cardnumber = scanner.nextInt();
        int check1 =0;

        for (int i = 0; i< countusers; i++){
            if (user.equals(username[i]) && cardnumber == libraryCardnumber[i]){
                System.out.println("Enter Book name or Title for checkout: ");
                String bookname = scanner.next();
                int check2 =0;

                for (int j = 0; j < counter; j++){
                    if (bookname.equals(name[i]) && !status[j].equals("Not Available")){
                            System.out.println("Book Found.");
                            System.out.println("Do You want to checkout ?");
                            System.out.println("A. Yes");
                            System.out.println("B. No");
                            String choice = scanner.next();
                            if (choice.equals("A")){
                                status[j] = "Not Available";
                                bookcheckout[i] += 1;
                                System.out.println(bookname+" book Checkout Successfully.");
                            }
                        check2 = 1;
                        break;
                    }
                }
                if (check2 == 0){
                    System.out.println("Book Not Found/Available.");
                }
                check1 = 1;
                break;
            }
        }
        if (check1 == 0){
            System.out.println("User Not Found.");
        }
    }

    public void checkIn(){
        System.out.println("Enter username: ");
        String user = scanner.next();
        System.out.println("Enter library card number: ");
        int cardnumber = scanner.nextInt();
        int check1 =0;

        for (int i = 0; i < countusers; i++){
            if (user.equals(username[i]) && cardnumber == libraryCardnumber[i]){
                System.out.println("Enter Book name or Title for checkIn: ");
                String bookname = scanner.next();
                int check2 =0;

                for (int j = 0; j < counter; j++){
                    if (bookname.equals(name[i])){

                    }
                }
                check1 = 1;
                break;
            }
        }
        if (check1 == 0){
            System.out.println("User Not Found.");
        }
    }
}
