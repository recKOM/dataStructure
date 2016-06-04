package dataStructure;
import dataStructure.linearList.IList;
import dataStructure.linearList.LinkList;
//import dataStructure.linearList.SqList;
import java.util.Scanner;

public class PersonListSystem {
	public static void main (String[] args) throws Exception {
	   	IList list1 = new LinkList<Person>();
	   	//IList list1 = new SqList<Person>(20);
	
	   	String option = "";
        Scanner sc = new Scanner(System.in);
	   	while (!option.equals("q") && !option.equals("q"))
	    {
	        option = menu();
	        if (option.equals("a") || option.equals("A")) {
	            System.out.print("\n�����������˵���Ϣ�����������䣩��");
	            Person p1 = new Person(sc.next(),sc.nextInt());
				list1.insert(list1.length(),p1);
                System.out.println(p1.getName() + "--  �ѱ��������Ա�");
			}else if (option.equals("d") || option.equals("D")) {
	            if (list1.isEmpty()) {
	            	System.out.println("\n���Ա�Ŀǰ�ǿձ����ܽ���ɾ��������");	            	
	            	continue;
	            }	
	            System.out.print("\n�����뱻ɾ���˵���Ϣ�����������䣩��");
	            Person p1 = new Person(sc.next(),sc.nextInt());
	            int i = list1.indexOf(p1);
	            
	            if (i == -1)
	            	System.out.print("\n��ɾ����" + p1.getName() + "������!");
	            else{
		            list1.remove(i);
		            System.out.println(p1.getName() + "--  �Ѵ����Ա����Ƴ���");
	            }
			}else if (option.equals("p") || option.equals("P")) {
	  				System.out.println("����\t����");
	  				System.out.println("----------------");
	                list1.display();
	        }
	        System.out.println();
	   }
	   list1.clear();
	   System.out.println("ллʹ�ñ�ϵͳ���ټ�������");
	}


	public static String menu() {
		boolean valid;
		String choice = "";
		System.out.print("\n---����---\n");
		System.out.print("\n");
		System.out.print("A: ��������\n");
		System.out.print("D: ɾ������\n");
		System.out.print("P: ��ʾ�б�\n");
		System.out.print("Q: �˳�ϵͳ\n");
		System.out.print("\n");
		valid = false;
		while (valid == false)
		{
			System.out.print("���������ѡ��<A, D, P, Q>: ");
		    choice = new Scanner(System.in).next();
		    System.out.println();
		    if ("AaDdPpQq".indexOf(choice) != -1)
		    	valid = true;
		    else
		    	System.out.print("\n����ѡ�����");
		}
		return choice;
	}
}