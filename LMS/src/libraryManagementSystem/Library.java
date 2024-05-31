package libraryManagementSystem;

public class Library {
	
	//--------------------------------------------------------
	//method to add an author
	public void addAuthor(int id, String name) {
		Author.addAuthor(id, name);
	}
	
	//method to add book
	public static void addBook(int id,String name, Author author,int availableCopies) {
		Book.addBook(id, name, author,availableCopies);
	}
	
	//method to register student
	public static void registerStudent(int id, String name, int year, int mobileNo) {
		Student.registerStudent(id, name, year, mobileNo);
	}
	//-------------------------------------------------------------
	
	
	/*
	 * Displying the list of books
	 * and its details
	 * 
	*/
	public static void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : Book.books) {
            if (book.getAvailableCopies() > 0) {
                System.out.println("Book ID: " + book.getId());
                System.out.println("Title: " + book.getName());
                System.out.println("Author: " + book.getAuthorName());
                System.out.println("-----------------------------");
            }
        }
    }
	
	
	/*
	 * Borrowing Functionality
	 * allow users to borrow books
	 * methods to track book availability and handle borrowing.
	 * */
	public static void borrowBook(Student student, Book book) {
		if(book != null && bookAvailable(book)) {
			if (book.getAvailableCopies() > 0) {

                book.setAvailableCopies(book.getAvailableCopies() - 1); // Decrement available copies
                System.out.println(student.getName() + " has borrowed the book: " + book.getName());
            } else {
                System.out.println("All copies of this book are currently borrowed.");
            }
		}
		else {
            System.out.println("Book not available for borrowing.");
        }
	}
	
	private static boolean bookAvailable(Book book) {
		// assumming all books are available
		return book.getAvailableCopies() > 0;
	}
	
	

	
	/*
	 * Return the book
	 * */
	
	public void returnBook(Student student, Book book) {
		if(student != null && book != null) {
			book.setAvailableCopies(book.getAvailableCopies()+1);
			System.out.println(student.getName() + " has returned the book: " + book.getName());
		}
		else {
            System.out.println("Invalid student or book.");
        }
	}
	
	
	/*
	 * to calculate the fine
	 * */
	public double calculateFine(Student student, int daysOverdue) {
		double fineperday = 0.50;
		double fine = fineperday* daysOverdue;
		return fine;
	}
	
	/*
	 * for paying the fine;
	 * 
	 * */
	public void payFine(Student student, double amount) {
		if(student!=null && amount >0) {
			System.out.println(student.getName() + " has paid a fine of $" + amount);
			
		}
		else {
            System.out.println("Invalid student or fine amount.");
        }
	}
	
	
	/*
	 * removing the book 
	 * */
	public void removeBook(Book book) {
		if(book!= null) {
			Book.books.remove(book);
			System.out.println("Book removed successfully: " + book.getName());
		}
		 else {
	            System.out.println("Invalid book.");
	        }
	}
	
	
	/*Update book details
	 * */
	public void updateBookDetails(Book book, String newName, Author newAuthor, int newAvailableCopies) {
        if (book != null) {
            book.setName(newName);
            book.setAuthor(newAuthor);
            book.setAvailableCopies(newAvailableCopies);
            System.out.println("Book details updated successfully: " + book.getName());
        } else {
            System.out.println("Invalid book.");
        }
    }
	
	/*
	 * Display list of students
	 * */
	public static void displayStudents() {
        System.out.println("List of Registered Students:");
        for (Student student : Student.students) {
            System.out.println("Student ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Year: " + student.getYear());
            System.out.println("Mobile No: " + student.getMobileNo());
            System.out.println("-----------------------------");
        }
    }
	
	/*
	 * Remove student 
	 * */
	public void removeStudent(Student student) {
        if (student != null) {
            Student.students.remove(student);
            System.out.println("Student removed successfully: " + student.getName());
        } else {
            System.out.println("Invalid student.");
        }
    }
	
	/*
	 * Update student details
	 * */
	public void updateStudentDetails(Student student, String newName, int newYear, int newMobileNo) {
        if (student != null) {
            student.setName(newName);
            student.setYear(newYear);
            student.setMobileNo(newMobileNo);
            System.out.println("Student details updated successfully: " + student.getName());
        } else {
            System.out.println("Invalid student.");
        }
    }
	
	
	/*
	 * Displaying list of authors
	 * */
	public void displayAuthors() {
        System.out.println("List of Authors:");
        for (Author author : Author.authors) {
            System.out.println("Author ID: " + author.getId());
            System.out.println("Name: " + author.getName());
            System.out.println("-----------------------------");
        }
    }
	
	/*
	 * Remove authors
	 * */
	public void removeAuthor(Author author) {
		if (author != null) {
            Author.authors.remove(author);
            System.out.println("Author removed successfully: " + author.getName());
        } else {
            System.out.println("Invalid author.");
        }
    }
	
	/*
	 * Update author details
	 * */
	public void updateAuthorDetails(Author author, String newName) {
        if (author != null) {
            author.setName(newName);
            System.out.println("Author details updated successfully: " + author.getName());
        } else {
            System.out.println("Invalid author.");
        }
    }
	
	
	
	 
}
