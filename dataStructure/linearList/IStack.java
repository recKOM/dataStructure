package dataStructure.linearList;

public interface IStack<E>{
	public void clear();
	public boolean isEmpty();
	public int length();
	public E peek(); 
	public void push(E x) throws Exception; //��ջ
	public E pop();  //��ջ
}
