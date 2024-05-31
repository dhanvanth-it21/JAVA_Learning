package libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;


public class Author {
	
	private int id;
	private String name;
	
//	list of authors
	static List<Author> authors= new ArrayList<>();
	
	public Author(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	/*
	 * create the author object 
	 * and add it to the authors list
	 * with the success notification 
	*/
	public static void addAuthor(int id, String name) {
		// TODO Auto-generated method stub
		Author author  = new Author(id, name);
		authors.add(author);
		System.out.println("Author added successfully!!!");
	}

	public String getName() {
		return name;
	}
	public int getId() {
        return id;
    }
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
        this.id = id;
    }
}
