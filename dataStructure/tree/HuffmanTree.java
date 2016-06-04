package dataStructure.tree;

import dataStructure.linearList.PriorityQData;
import dataStructure.linearList.PriorityQueue;

public class HuffmanTree extends BiTree {
	public HuffmanTree(char[] cList, int[] wList) throws Exception {
		
		PriorityQueue pm = new PriorityQueue();
		BiTreeNode btt;
		//将字母转为树节点作为优先队列的Elem，其权值作为优先值
		for(int i = 0; i<wList.length; i++){
			btt = new BiTreeNode(cList[i]);
			PriorityQData pd = new PriorityQData(btt,wList[i]);
			pm.offer(pd);
		}
		//当该优先队列个数大于1，执行
		while(pm.length()>1){
			PriorityQData pd1 = pm.poll();
			PriorityQData pd2 = pm.poll();
			int value = pd1.getPriority()+pd2.getPriority();
			BiTreeNode btp = new BiTreeNode(value);//建立父节点
			btp.setLchild((BiTreeNode) pd1.getElem());
			btp.setRchild((BiTreeNode) pd2.getElem());
			
			PriorityQData pd3 = new PriorityQData(btp,value);
			pm.offer(pd3);//将父节点及其权值（左右子树权值之和）加入优先队
		}
		this.root =(BiTreeNode) pm.peek().getElem() ;
		
	}
	
	//利用深度优先遍历求出huffman树的huffman编码
	public void getHuffmanCode(BiTreeNode T, String code) {
   		if (T.getLchild() == null){
        	System.out.println(T.getData() + ": " + code);
   		}
   		else{
        	getHuffmanCode(T.getLchild(),code.concat("0"));
        	getHuffmanCode(T.getRchild(),code.concat("1"));
   		}
	}

}
