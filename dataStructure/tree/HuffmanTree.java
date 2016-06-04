package dataStructure.tree;

import dataStructure.linearList.PriorityQData;
import dataStructure.linearList.PriorityQueue;

public class HuffmanTree extends BiTree {
	public HuffmanTree(char[] cList, int[] wList) throws Exception {
		
		PriorityQueue pm = new PriorityQueue();
		BiTreeNode btt;
		//����ĸתΪ���ڵ���Ϊ���ȶ��е�Elem����Ȩֵ��Ϊ����ֵ
		for(int i = 0; i<wList.length; i++){
			btt = new BiTreeNode(cList[i]);
			PriorityQData pd = new PriorityQData(btt,wList[i]);
			pm.offer(pd);
		}
		//�������ȶ��и�������1��ִ��
		while(pm.length()>1){
			PriorityQData pd1 = pm.poll();
			PriorityQData pd2 = pm.poll();
			int value = pd1.getPriority()+pd2.getPriority();
			BiTreeNode btp = new BiTreeNode(value);//�������ڵ�
			btp.setLchild((BiTreeNode) pd1.getElem());
			btp.setRchild((BiTreeNode) pd2.getElem());
			
			PriorityQData pd3 = new PriorityQData(btp,value);
			pm.offer(pd3);//�����ڵ㼰��Ȩֵ����������Ȩֵ֮�ͣ��������ȶ�
		}
		this.root =(BiTreeNode) pm.peek().getElem() ;
		
	}
	
	//����������ȱ������huffman����huffman����
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
