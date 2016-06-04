package dataStructure.linearList;

public class LinkStack<E> implements IStack<E> {
	private Node<E> top;
	private int curLen; 

	public LinkStack(){
		top = null;
		curLen = 0;
	}
	
	// ջ�ÿ�
   	public void clear( ) {
		top = null;
		curLen = 0;
   	}

    // ջ�п�
	public boolean isEmpty( ) {
		return  top== null;
	}

	// ��ջ����Ԫ�ظ�������
    public int length( ) {
		return curLen;
    }

  	// ȡջ��Ԫ�صĺ���
  	public E peek ( ) {
		if (!isEmpty())      // ջ�ǿ�
		      return top.getData( ); // ջ��Ԫ��
		else
		      return null;	 //ջ��
  	}	

	//��ջ
	public void push (E x) throws Exception {
		Node<E> p = new Node<E>(x); 
 		if (p == null)	// �ڴ�ռ䲻��
 			throw new Exception("��ջ����"); 

 		p.setNext(top); 
		top = p;
		curLen++; 
	}  

	//��ջ
	public E pop () {
		if (isEmpty())
		    return  null;
		
		Node<E> p = top; 
		top=top.getNext( );
		curLen--; 
		return p.getData( ); 
	}  
	
	// �������(��ջ����ջ��)
	public void display () {  
		Node<E> p = top; 
      	while (p != null) {
			System.out.println(p.getData( ));
			p = p.getNext();    // ȡ��һ�����
       	}
		System.out.println();
	}


 }
