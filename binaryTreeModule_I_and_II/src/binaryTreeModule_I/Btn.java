package binaryTreeModule_I;

public class Btn<T> {
	
	// a node contains data, it's left subtree, and it's right subtree
	public T data;
	public Btn<T> left;
	public Btn<T> right;
	
	// constructor to create a node
	public Btn(T data){
		this.data = data;
	}
}
