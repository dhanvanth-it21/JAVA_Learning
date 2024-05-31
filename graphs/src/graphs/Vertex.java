package graphs;

import java.util.ArrayList;

public class Vertex {
	private String data;
	private ArrayList<Edge> edge;
	
	public Vertex(String data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.edge = new ArrayList<>();
	}
}
