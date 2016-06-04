package dataStructure.tree;
import dataStructure.linearList.LinkStack;
import dataStructure.linearList.LinkQueue;

public class BiTree<E> {
	protected BiTreeNode<E> root; // ���ĸ���� 
	
	// ����һ�ÿ���
	public BiTree () {
		this.root=null;
	}
	
	// ����һ�ø����Ϊroot����
	public BiTree(BiTreeNode<E> root) {
		this.root=root;
	} 

	public BiTreeNode<E> getRoot() {
		return this.root;
	}

	public void setRoot(BiTreeNode<E> root) {
		this.root = root;
	}
	
	//������Ҷ�ڵ�ļ���
	public int countLeaf(BiTreeNode<E> T){
		int num = 0;
		if(T == null){
		 return num;
		}else{
		
		if(T.getLchild() == null & T.getRchild() == null){
			num++;
		}else{
			num += countLeaf(T.getLchild()) + countLeaf(T.getRchild());
		}
		return num;
		}
	}
	//������������ֵ��
	public int datacount(BiTreeNode<E> T){
		int num = 0;
		if(T == null){
			return num;
		}else{
		return num += (int)T.getData() + (int)datacount(T.getLchild()) + (int)datacount(T.getRchild());
		}
	}
	

}
