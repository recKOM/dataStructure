package dataStructure.linearList;

public class LinkQueue<E> implements IQueue<E> {
	private Node<E> front;     
	private Node<E> rear;     
	private int curLen;

	public LinkQueue(){
		front=null;
		rear= null; 
		curLen = 0;
	}

	// �����ÿպ���
   	public void clear( ) {
		front = rear = null; 
		curLen = 0;
	}

	// �пպ���
	public boolean isEmpty( ) {
		return front== null;
	}

	// ����г��Ⱥ���
	public int length( ) { 
		/*  ���û��curLen��Ա
		Node<E> p = front;
		int length = 0;
	          
		while (p !=null) { 
       		p = p.getNext();    //ָ������
      		++length;      //��������1
		}  
		return length;      
		*/

		return curLen;
	}

	// ȡ����Ԫ�صĺ���
  	public E peek ( ) {
  		if (isEmpty())      // ���зǿ�
  			return null;

		return front.getData( ); // ���ض���Ԫ��
  	}
	
	//��Ӳ���
	public void offer (E x) throws Exception{
		Node<E> p = new Node<E>(x);
 		if (p == null)	// �ڴ�ռ䲻���������쳣
 			throw new Exception("����������"); 

      	if (!isEmpty( )) {         // ���зǿ�
	   		rear.setNext(p);
	   		rear = p;              
        } 
      	else  {		//�ն�ʱ��Ӳ���,�����front��rear
	   		front = rear = p;
       	}
       	curLen++;
	}

	//���Ӳ���
	public E poll( ) {
		if (isEmpty())	//�ն��쳣
		    return  null;

        if (length( )==1) 	//�������ʱ��ֻ��һ����㣬�����rear 
           	rear=null;
		
		E dataOut = front.getData();
	   	front=front.getNext();
		curLen--;

        return dataOut;              
	}
	
	// �������(�Ӷ��׵���β)
	public void display ( ) {  
		Node<E> p=front;
		while( p!=null ) {
			System.out.print(p.getData( ));
			p=p.getNext();
		}
	}
 }
