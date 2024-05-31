package libraryManagementSystem;
import java.util.ArrayList;
import java.util.List;
public class Book {
	
	private int id;
	private String name;
	private Author author;
	private int availableCopies;
	
	//list og books 
	static List<Book> books = new ArrayList<>();
	
	// constructor
	public Book(int id, String name, Author author,int availableCopies) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.availableCopies = availableCopies; 
	}
	
	// Getter method for book ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}





	// Getter method for book title
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}





	// Getter method for author's name
	public String getAuthorName() {
        return author.getName();
    }
	public void setAuthor(Author author) {
		this.author = author;
	}

	// Getter and setter methods for available copies
    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

	
	
	
	
	
	/*
	 * create the book object 
	 * and add it to the books list
	 * with the success notification 
	*/
	public static void addBook(int id, String name, Author author,int availableCopies) {
		Book book = new Book(id,name,author,availableCopies);
		books.add(book);
		System.out.println("Book added successfully!!!");
	}
	
	
	
	/*
	 * Display the books fromt the array list: 
	 * 
	 * */
	






	
	
	
	
	
	

}
