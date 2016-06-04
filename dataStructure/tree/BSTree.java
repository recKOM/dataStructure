package dataStructure.tree;
import dataStructure.linearList.RecordNode;
//import java.util.Scanner;

public class BSTree<E> extends BiTree<RecordNode<E>> {
	
	//�ڶ����������в��ҹؼ���ֵΪkey�Ľ�㣬�����ҳɹ����򷵻���ֵ�����򷵻�null
	public RecordNode<E> searchBST(BiTreeNode<RecordNode<E>> T, Comparable key)	{
  		if (T != null) {
       		if (key.compareTo(T.getData().getKey()) == 0) //���ҳɹ�
              	return T.getData();
        	else if (key.compareTo(T.getData().getKey()) < 0)
              	return searchBST(T.getLchild(), key);     
     		else 
        		return searchBST(T.getRchild(), key);    
      	}
      	
      	return null;
	}
	
    //�ڶ����������в���Keyֵ���Ľ�㣬�����ҳɹ����򷵻���ֵ�����򷵻�null
    public RecordNode<E> getLargest(BiTreeNode<RecordNode<E>> T) {
    	if (T == null) return null;
    	
    	if (T.getRchild() == null) 
    		return T.getData();
    	else
    		return getLargest(T.getRchild());
    }

	//�ڶ�������������ӹؼ���ֵΪkey������ΪtheElement���½��
	public boolean insertBST(Comparable key,E theElement) {
    	if (key == null || theElement == null)  return false;

        if (root == null)
        	root = new BiTreeNode(new RecordNode(theElement, key)); //���������
        else
        	insertBST(root,key,theElement);

        return true;
    }
	private void insertBST(BiTreeNode<RecordNode<E>> p, Comparable key,E theElement) {
       	if (key.compareTo(p.getData().getKey()) < 0)
			if (p.getLchild() == null)
				p.setLchild(new BiTreeNode(new RecordNode(theElement, key)));
			else
        		insertBST(p.getLchild(), key, theElement);
       	else
			if (p.getRchild() == null)
				p.setRchild(new BiTreeNode(new RecordNode(theElement, key)));
			else
        		insertBST(p.getRchild(), key, theElement);
    }
    
	//�ڶ�����������ɾ���ؼ���ֵΪkey�Ľ�㣬���ر�ɾ����ֵ
	public RecordNode<E> removeBST(Comparable key) {
    	if (key == null || root == null)  return null;

		return removeBST(root, key, null);
    }
	private RecordNode<E> removeBST(BiTreeNode<RecordNode<E>> p, Comparable key, BiTreeNode<RecordNode<E>> parent) {
       	if (key.compareTo(p.getData().getKey()) < 0)
       		return removeBST(p.getLchild(), key, p);
       	else if (key.compareTo(p.getData().getKey()) > 0)
       		return removeBST(p.getRchild(), key, p);
       	else {	//key == p.getData().getKey()
			RecordNode<E> del = p.getData();
       		if (p.getLchild() != null && p.getRchild() != null){	//ɾ��������������Ϊ�յĽ��
       			RecordNode<E> leftLargest = getLargest(p.getLchild());
       			p.setData(leftLargest);
       			removeBST(p.getLchild(), leftLargest.getKey(), p);
       		}
			else {
	 			if (parent == null)  //ɾ��ԭ���Ķ�Ϊ0��1�ĸ�
	 				if (p.getLchild() != null)
	 					root = p.getLchild();
	 				else
	 					root = p.getRchild();
	       		else if (p == parent.getLchild())	//ɾ����Ϊ1��0��������˫�׽������ӵĽ��
		       		if (p.getLchild() != null) 
		       			parent.setLchild(p.getLchild());
		       		else
		       			parent.setLchild(p.getRchild());
		       	else if (p == parent.getRchild())	//ɾ����Ϊ1��0��������˫�׽����Һ��ӵĽ��
		       		if (p.getLchild() != null) 
		       			parent.setRchild(p.getLchild());
		       		else
		       			parent.setRchild(p.getRchild());
 			} 
			return del;
       	}
    }
	
}
