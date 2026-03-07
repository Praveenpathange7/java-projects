import java.util.Scanner;

class Book{
    int BookId;
    String title;
    int IssuedDay;
    int ReturnDay;
    boolean Issuesd;

    static int Idcounter = 1001;
    Book(String title){
        this.title = title;
        this.BookId = Idcounter++;
        this.Issuesd = false;
    }
    int CalFine(){
        int allowedDays = 7;
        int FineperDay = 10;
        int delay = ReturnDay - IssuedDay - allowedDays;
        if(delay>0){
            return delay * FineperDay;
        }else{
            return 0;
        }
    }
}


public class Library_Management_System {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Welcome to Library Management System ---");
        int choice;
        int count =0;
        Book[] books = new Book[20];
        do{
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Books");
            System.out.println("4. Return Books");
            System.out.println("5 . Exit");
            System.out.println("Enter the choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    if(count>=20){
                        System.out.println("Library is Full of books");
                        break;
                    }
                    System.out.print("Enter the Book Title : ");
                    String Title = sc.nextLine();
                    books[count++] = new Book(Title);
                    System.out.println("Book Added Successfully");
                    break;
                case 2:
                    System.out.println(" ---- List of Books ---- ");
                    if(count == 0){
                        System.out.println("No books available");
                    }
                    for(int i=0;i<count;i++){
                        Book b = books[i];
                        System.out.println("Book Id : "+b.BookId+"| Title : "+b.title+"| Issued ");
                    }
                    break;
                case 3:
                    System.out.println("Enter the book id to get issued : ");
                    int issuedId = sc.nextInt();
                    boolean found = false;
                    for (int i=0;i<count;i++) {
                        if (books[i].BookId == issuedId) {
                            found = true;
                            if (books[i].Issuesd) {
                                System.out.println("Book has been already issued");
                            } else {
                                System.out.println("Issue Day (1-30) : ");
                                books[i].IssuedDay = sc.nextInt();
                                books[i].Issuesd = true;
                                System.out.println("Book Issued");
                            }
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Book not found");
                    }
                    break;
                case 4:
                    System.out.println("Enter the Book Id to return : ");
                    int returnId = sc.nextInt();
                    boolean foundReturn = false;
                    for(int i=0;i<count;i++){
                        if(books[i].BookId == returnId){
                            foundReturn = true;
                            if(!books[i].Issuesd){
                                System.out.println("Book is not issued");
                            }else{
                                System.out.println("Enter the return day (1-30) : ");
                                books[i].ReturnDay = sc.nextInt();
                                int fine = books[i].CalFine();
                                System.out.println("Fine Calculator : "+fine);
                                books[i].Issuesd = false;
                            }
                            break;
                        }
                    }
                    if(!foundReturn){
                        System.out.println("Book not found");
      }
                    break;
                case 5:
                    System.out.println("Library System is closed ");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }while(choice!=5);
    }
}
