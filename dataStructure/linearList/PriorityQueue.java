package dataStructure.linearList;

public class PriorityQueue implements IQueue<PriorityQData> {
	private Node<PriorityQData> front;     
	private Node<PriorityQData> rear;     
	private int curLen;

	public PriorityQueue(){
		front=null;
		rear= null; 
		curLen = 0;
	}

	// �����ÿպ���
   	public void clear( ) {
		front=rear= null; 
		curLen = 0;
	}

	// �пպ���
	public boolean isEmpty( ) {
		return front== null;
	}

	// ����г��Ⱥ���
	public int length( ) { 
		/*  ���û��curLen��Ա
		Node p = front;
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
  	public PriorityQData peek ( ) {
  		if (isEmpty())      // ���зǿ�
  			return null;

		return front.getData( ); // ���ض���Ԫ��
  	}
	
	//��Ӳ���
	public void offer (PriorityQData x) throws Exception{
		Node s = new Node(x);
 		if (s == null)	// �ڴ�ռ䲻���������쳣
 			throw new Exception("��������"); 

      	if (!isEmpty( )) {         // ���зǿ�
			Node<PriorityQData> p = front, q = null;
			while (p != null && x.getPriority() >= p.getData().getPriority()) {
				q = p;
				p = p.getNext();
			}

			if (p == null) {	//p��ָ������β֮�⣬qָ���β���
				rear.setNext(s);
				rear = s;
			}
			else if (p == front) {	//�ڶ��ײ����½��
				s.setNext(front);
				front = s;
			}
			else{
				q.setNext(s);
				s.setNext(p);
			}
        } 
      	else  {		//�ն�ʱ��Ӳ���,�����front��rear
	   		front = rear = s;
       	}
       	
       	curLen++;
	}

	//���Ӳ���
	public PriorityQData poll( ) {
		if (isEmpty())	//�ն��쳣
		    return  null;

        if (length( )==1) 	//�������ʱ��ֻ��һ����㣬�����rear 
           	rear=null;
		
		PriorityQData dataOut = front.getData();
	   	front=front.getNext();
		curLen--;

        return dataOut;              
	}
	
	// �������(�Ӷ��׵���β)
	public void display ( ) {  
		Node p=front;
		while( p!=null ) {
			System.out.println(p.getData( ));
			p=p.getNext();
		}
	}
 }
