package priorityQueueCBT;

public class Element<T> {
	// each element will have the ""Value"" and ""Priority""
	T value;
	int priority;
	
	public Element(T value , int priority) {
		this.value = value;
		this.priority = priority;
	}
}
