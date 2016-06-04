package dataStructure.linearList;

public class Node<E> {
	private E data;    // ��Ž��ֵ
	private Node<E> next;     // ��̽�������	

	public Node( ) {  // �޲���ʱ�Ĺ��캯��
		this(null, null);
	}
	
	public Node(E data) { //��һ������ʱ�Ĺ��캯��
		this(data, null);
	}
	
	public Node(E data, Node<E> next) { //����������ʱ�Ĺ��캯��   
		this.data = data;
	    this.next = next;
	}
	
	public E getData( ) {
		return data;
	}
	
	public Node<E> getNext() {
	    return next;
	}
	
	public void setData(E data) {
		this.data = data;
	}
	
	public void setNext(Node<E> next) {
	    this.next = next;
	}	
}
