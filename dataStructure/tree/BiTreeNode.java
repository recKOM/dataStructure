package dataStructure.tree;

public class BiTreeNode<E> {
	private E data; // ����������
	private BiTreeNode<E> lchild, rchild; // ���Һ�����
	
	// ����һ������������Һ����򶼲�Ϊ�յĽ��
	public BiTreeNode(E data, BiTreeNode<E> lchild, BiTreeNode<E> rchild) {
    	this.data = data;
	  	this.lchild = lchild;
	  	this.rchild = rchild;
	} 
	
	// ����һ�����Һ�����Ϊ�յĽ��
	public BiTreeNode(E data) {
		this(data, null, null);
	} 
	
	// ����һ���ս��
	public BiTreeNode() {
		this(null);
	}

	public E getData(){
		return this.data;
	}	

	public BiTreeNode<E> getLchild(){
		return this.lchild;
	}	

	public BiTreeNode<E> getRchild(){
		return this.rchild;
	}	

	public void setData(E data){
		this.data = data;
	}	

	public void setLchild(BiTreeNode<E> lchild){
		this.lchild = lchild;
	}	

	public void setRchild(BiTreeNode<E> rchild){
		this.rchild = rchild;
	}
	
	public String toString() {
		return "" + data;
	}	
}
