package dataStructure.tree;
import dataStructure.linearList.LinkStack;
import dataStructure.linearList.LinkQueue;

public class BiTree<E> {
	protected BiTreeNode<E> root; // 树的根结点 
	
	// 构造一棵空树
	public BiTree () {
		this.root=null;
	}
	
	// 构造一棵根结点为root的树
	public BiTree(BiTreeNode<E> root) {
		this.root=root;
	} 

	public BiTreeNode<E> getRoot() {
		return this.root;
	}

	public void setRoot(BiTreeNode<E> root) {
		this.root = root;
	}
	
	//二叉树叶节点的计数
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
	//二叉树各项数值和
	public int datacount(BiTreeNode<E> T){
		int num = 0;
		if(T == null){
			return num;
		}else{
		return num += (int)T.getData() + (int)datacount(T.getLchild()) + (int)datacount(T.getRchild());
		}
	}
	

}
