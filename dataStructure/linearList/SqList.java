package dataStructure.linearList;

public class SqList<E> implements IList<E> {
	protected E[] listElem; 
	protected E[] listElem1;
	protected int curLen; 

	//���췽��������һ������Ϊ0˳���      
    public SqList () { 
		curLen = 0; 
		listElem = null;                   
	}

	//���췽��������һ������ΪmaxSize�Ŀ�˳���      
    public SqList (int maxSize) { 
		curLen = 0; 
		listElem = (E[]) new Object[maxSize];                   
	}

	// ˳����ÿ�
   	public void clear( ) {
		curLen = 0; 
   	}

	// �п�
	public boolean isEmpty( ) {
		return curLen == 0;
	}

	// ��˳�����
    public int length( ) {
		return curLen; 
    }

	// ��ȡ˳�����λ�����Ϊi��Ԫ�ص�����
  	public E get (int i) throws Exception {
		if (i < 0 || i > curLen - 1)
        	throw new Exception("��" + i + "��Ԫ�ز�����"); 
        return listElem[i]; 
  	}

	// �������
	public void insert (int i, E x) throws Exception {
		if (curLen == listElem.length){
			//throw new Exception("˳�������"); 
				listElem1 = (E[]) new Object[curLen];
				for(int j=0; j<curLen; j++){
					listElem1[j]=listElem[j];
				}
				listElem = (E[]) new Object[curLen*2];
				for(int j=0; j<curLen; j++){
					listElem[j] = listElem1[j];
				}
				listElem[i]=x;
			}
 		if (i < 0 || i > curLen)   // i���Ϸ�
            throw new Exception("����λ�ò��Ϸ�");

		for (int j = curLen; j > i; j--)     //����
           listElem[j] = listElem[j - 1];
           
        listElem[i] = x;    //���� 
		curLen++;    //����1  
	}

	// ɾ������
	public void remove (int i) throws Exception {
		if (this.isEmpty())
			throw new Exception("˳����ѿ�");	
		if (i < 0 || i > curLen - 1)
           throw new Exception("ɾ��λ�ò��Ϸ�");

		for (int j = i; j < curLen - 1; j++)     //ǰ��
          listElem[j] = listElem[j + 1];
		
		curLen--;     //����1
	}

	// ���Ҳ���
	public int indexOf (E x) {
		int j = 0;
		
		while (j < curLen && !listElem[j].equals(x))
			j++;
		
		if (j < curLen)
       		return  j;  
 		else
       		return -1; 
	}

	//������Ա������Ԫ��
	public void display() {
		for (int j = 0; j < curLen; j++)
			System.out.println(listElem[j]);
		System.out.println();
	}
}

