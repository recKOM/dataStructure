package dataStructure.linearList;

public class LinkList<E> implements IList<E> {
	private Node<E> head; // �������ͷָ��
	private int curLen;
	
	//���췽��������һ��ֻ��ͷ���Ŀյ�����     
	public LinkList( ) {  
		head = new Node<E>(); // ��ʼ��ͷ��㣨�ƽ�㣩
	    curLen = 0;   
	}

	// ��ȡ�������ͷָ��
	public Node<E> getHead(){
		return head;
	}	 
	
	// �����ÿ�
	public void clear( ) {
		head.setNext(null);
		curLen = 0;
	}
	 
	//�п�
	public boolean isEmpty() {   
		return head.getNext() == null; 
	}
	 
	//������ĳ���
	public int length( )  {   
		return curLen;
	}
	 
	// ��ȡ��������λ�����Ϊi��Ԫ�ص�����
	public E get (int i) throws Exception{
		if (i < 0 || i > curLen - 1)
			throw new Exception("λ�����Ϊ" + i + "������Ԫ�ز�����");

		Node<E> p = head.getNext(); 
		int j = 0;
		while (p != null && j < i){
	         p = p.getNext();
	         ++j;
		}
		return p.getData();  
	}
	
	// �������
	public void insert (int i, E x) throws Exception{
 		if (i < 0 || i > curLen)   // i���Ϸ�
            throw new Exception("����λ�ò��Ϸ�");
 
 		Node<E> s = new Node<E>(x);	//������������½��s
 		if (s == null)	// �ڴ�ռ䲻��
 			throw new Exception("��������"); 
 			
 		Node<E> p = head; 
		int j = -1;
		while (p != null && j<i-1 ) {
			p = p.getNext(); 
			++j;    
		}
		
		s.setNext(p.getNext()); 
		p.setNext(s);
		curLen++; 
	}
	
	// ɾ������
	public void remove (int i) throws Exception{
		if (this.isEmpty())
		   throw new Exception("�����ѿ�");	
		if (i < 0 || i > curLen - 1)
           throw new Exception("ɾ��λ�ò��Ϸ�");
   
   		Node<E> p = head; 
		int j = -1;
		while (p.getNext()!= null && j<i-1 ) {
			p = p.getNext(); 
			++j;    
		}
		p.setNext(p.getNext().getNext()); 
		curLen--;
	}
	
	// ���Ҳ���
	public int indexOf (E x){
		Node<E> p = head.getNext(); 
		int j = 0;
		while (p != null && !p.getData().equals(x) ) {
			p = p.getNext(); 
			++j;    
		}

		if (p != null) 
		      return j;
		else 
		      return -1;

	}
	
	//��������������Ԫ��
	public void display( ) {
		Node<E> node = head.getNext(); 
      	while (node != null) {
			System.out.println(node.getData( ));
			node = node.getNext();    // ȡ��һ�����
       }
		System.out.println();
	}
}