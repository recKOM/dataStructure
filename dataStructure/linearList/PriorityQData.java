package dataStructure.linearList;

public class PriorityQData<E> {
	private E elem;
	private int priority;	//ֵԽС�����ȼ�Խ��

	//���캯��
	public PriorityQData(E elem, int priority) {
		this.elem = elem;
		this.priority = priority;
	}

	public E getElem( ) {
		return elem;
	}

	public int getPriority( ) {
		return priority;
	}
	
	public void setElem(E elem) {
		this.elem = elem;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String toString( ) {
		return elem.toString();
	}
}
