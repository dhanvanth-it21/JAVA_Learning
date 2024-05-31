package libraryManagementSystem;
import java.util.Scanner;

public class LibraryManagementSystemUI {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to the Library Management System!");

        // Prompt user to choose between student or admin
        
        boolean appOpen = true;
        while(appOpen) {
        	System.out.println("Are you a Student or an Admin?");
            System.out.println("Enter '1' for Student");
            System.out.println("Enter '2' for Admin");
            System.out.println("Enter '13' to Exit the App");
            System.out.println("-------------------------------");
        	// Read user input
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            System.out.println("------------------------------");

            // Process user choice
            if (choice == 13) {
                // Student functionalities
            	System.out.println("Thank you for using the App");
                break;
            }
            else if (choice == 1) {
                // Student functionalities
                studentFunctionalities();
            } else if (choice == 2) {
                // Admin functionalities
            	System.out.println("Enter the id:");
            	int id = scanner.nextInt();
            	System.out.println("Enter the password:");
            	String pass = scanner.next();
            	boolean auth = Admin.authentication(id,pass);
            	if(auth)
            		adminFunctionalities();
            	else System.out.println("Invalid Admin");
            } else {
                System.out.println("Invalid choice. Please enter '1' for Student or '2' for Admin.");
            }
        }
        
    }
//----------------------------------------------------------------------------------
                     // Method to handle student functionalities
//-------------------------------------------------------------------------------------
    public static void studentFunctionalities() {
        System.out.println("-----------You selected Student functionalities.-----------");
        boolean whilePass = true;
        while(whilePass) {
        	int caseId = displayStudentCaseId();
        	switch(caseId) {
        	case 1:
            	Library.displayAvailableBooks();
              break;
            case 2:
            	borrowBookUI();
              break;
            case 13:
            	whilePass = false;
            	System.out.println("Exited Successfully!!!");
            	break;
            default:
              System.out.println("Please enter a valid number");
          }
        }
        
    }
    
    
    
    
    private static int displayStudentCaseId() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("-------------------------------");
    	System.out.println("Enter 1 : To display available books");
    	System.out.println("Enter 2 : To borrow a book");
    	System.out.println("Enter 13 : To Exit Application");
    	System.out.println("-------------------------------");
    	return scanner.nextInt();
	}
//--------------------------------------------------------------------------------------
	                   // Method to handle admin functionalities
//-------------------------------------------------------------------------------------
    public static void adminFunctionalities() {
        System.out.println("-----------You selected Admin functionalities.-----------");
        boolean whilePass = true;
        while(whilePass) {
        	int caseId = displayAdminCaseId();
        	switch(caseId) {
            case 1:
            	addStudentUI();
            	break;
            case 2:
            	addBookUI();
            	break;
            case 3:
            	Library.displayStudents();
            	break;
            case 13:
            	whilePass = false;
            	System.out.println("Exited Successfully!!!");
            	break;
            default:
              System.out.println("Please enter a valid number");
          }
        }
    }
    
    
    
    
    private static int displayAdminCaseId() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("-------------------------------");
    	System.out.println("Enter 1 : To register Student");
    	System.out.println("Enter 2 : Add book");
    	System.out.println("Enter 3 : To display Students");
    	System.out.println("Enter 13 : To exit the Admin Portal");
    	System.out.println("-------------------------------");
    	return scanner.nextInt();
	}
//---------------------------------------------------------------------------------------   
    
   
    
    
    	
    
    
    
    
    
    
    /*
     * to borrow a book
     * */
    private static void borrowBookUI() {
    	// TODO Auto-generated method stub
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter Student id : ");
    	int studentId = scanner.nextInt();
    	Student student = null;
    	for(Student stu : Student.students) {
    		if(stu.getId() == studentId);{
    			student = stu;
    			break;
    		}	
    	}
    	System.out.println("Enter book id : ");
    	Book book = null;
    	int bookId = scanner.nextInt();
    	for(Book buk : Book.books) {
    		if(buk.getId() == bookId);{
    			book = buk;
    			break;
    		}	
    	}
    	Library.borrowBook(student,book);
    	
    	
    }
    
    
    /*
     * To register the student
     * */
    private static void addBookUI() {
    	int id;
    	String name;
    	Author author;
    	int availableCopies;
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter Book id : ");
    	id = scanner.nextInt();
    	System.out.println("Enter Book Name : ");
    	name = scanner.next();
//    	System.out.println("Enter Student author : ");
    	author = null;
    	System.out.println("Enter  available copies of the book: ");
    	availableCopies= scanner.nextInt();
    	Library.addBook(id, name, author, availableCopies);

	}
    
    
    
    
    /*
     * To add the book
     * */
    private static void addStudentUI() {
    	int id;
    	String name;
    	int year;
    	int mobileNo;
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter Student id : ");
    	id = scanner.nextInt();
    	System.out.println("Enter Student Name : ");
    	name = scanner.next();
    	System.out.println("Enter Student Year : ");
    	year = scanner.nextInt();;
    	System.out.println("Enter Student mobileNo : ");
    	mobileNo= scanner.nextInt();
    	Library.registerStudent(id, name, year, mobileNo);

	}
    
    
    
    
    
  }

  
    

