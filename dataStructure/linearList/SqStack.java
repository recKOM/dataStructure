package dataStructure.linearList;

public class SqStack<E> implements IStack<E> {
	private E[] stackElem; 
	private int top; 

    //����һ������ΪmaxSize�Ŀ�ջ
    public SqStack (int maxSize) { 
		stackElem = (E[]) new Object[maxSize];
		top = 0;
    }
    
	// ջ�ÿ�
   	public void clear( ) {
		top= 0;
   	}

    // ջ�п�
	public boolean isEmpty( ) {
		return  top== 0;
	}

	// ��ջ����Ԫ�ظ�������
    public int length( ) {
		return top;
    }

  	// ȡջ��Ԫ�صĺ���
  	public E peek ( ) {
		if (!isEmpty())      // ջ�ǿ�
			return stackElem[top-1]; // ջ��Ԫ��
		else
		return null;
  	}	

	//��ջ
	public void push (E x) throws Exception {
		if (top == stackElem.length) 
			throw new Exception("ջ����");
		else
		    stackElem[top++] = x; 
	}  

	//��ջ
	public E pop () {
		if (isEmpty() ) 
			return null;
		else
			return stackElem[--top];
	}  
	
	// �������(��ջ����ջ��)
	public void display ()   {  
		for (int i = top - 1; i >= 0; i--)
			System.out.println(stackElem[i]);
	}
}
