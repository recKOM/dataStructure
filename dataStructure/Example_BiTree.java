package dataStructure;
import dataStructure.tree.BiTreeNode;
import dataStructure.tree.BiTree;

class Example_BiTree {
	public static void main(String arg[]) throws Exception {
	
		BiTreeNode<Integer> nodeA = new BiTreeNode(49);
		BiTreeNode<Integer> nodeB = new BiTreeNode(12);
		BiTreeNode<Integer> nodeC = new BiTreeNode(65);
		BiTreeNode<Integer> nodeD = new BiTreeNode(8);
		BiTreeNode<Integer> nodeE = new BiTreeNode(35);
		BiTreeNode<Integer> nodeF = new BiTreeNode(88);
		BiTreeNode<Integer> nodeG = new BiTreeNode(5);
		BiTreeNode<Integer> nodeH = new BiTreeNode(10);
		BiTreeNode<Integer> nodeI = new BiTreeNode(15);
		BiTreeNode<Integer> nodeJ = new BiTreeNode(68);
		
		
		BiTree<Integer> T = new BiTree(nodeA);
		nodeA.setLchild(nodeB);
		nodeA.setRchild(nodeC);
		nodeB.setLchild(nodeD);
		nodeB.setRchild(nodeE);
		nodeD.setLchild(nodeG);
		nodeD.setRchild(nodeH);
		nodeE.setLchild(nodeI);
		nodeC.setRchild(nodeF);
		nodeF.setLchild(nodeJ);
		
		System.out.println("叶节点计数：");
		System.out.println(T.countLeaf(T.getRoot()));
		
		System.out.println("各节点的和：");
		System.out.println(T.datacount(T.getRoot()));
	}
}