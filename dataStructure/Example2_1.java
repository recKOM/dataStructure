package dataStructure;
import dataStructure.linearList.SqList;

public class Example2_1 {
	public static void main (String[] args) throws Exception {
      SqList<Character> L = new SqList(10); 
      L.insert(0, 'a'); 
      L.insert(1, 'z');
      L.insert(2, 'd');
      L.insert(3, 'm');
      L.insert(4, 'z');
      L.insert(5, 'b');
      L.insert(6, 'x');
      L.insert(7, 't');
      L.insert(8, 'y');
      L.insert(9, 'z');
      L.insert(10, 'z');
      int a = L.length();
      System.out.println(a);
     // int order = L.indexOf('b');
    /*  if (order != -1)
	  	 System.out.println("˳����е�һ�γ��ֵ�ֵΪ'b'������Ԫ�ص�λ��Ϊ��" + order);
      else
		 System.out.println("��˳����в�����ֵΪ'b'������Ԫ�أ�");*/
	}
}
