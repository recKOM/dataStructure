package dataStructure;
import dataStructure.linearList.IList;
import dataStructure.linearList.LinkList;
import dataStructure.linearList.Node;

//import dataStructure.linearList.SqList;
import java.util.Scanner;

public class StudentListSystem {
	public static void main (String[] args) throws Exception {
	   	IList list1 = new LinkList<Student>();
	   	//IList list1 = new SqList<Person>(20);
	   	//public Node head = new Node();
	   	//Node p = head.next;
	   	String option = "";
        Scanner sc = new Scanner(System.in);
	   	while (!option.equals("q") && !option.equals("q"))
	    {
	        option = menu();
	        if (option.equals("a") || option.equals("A")) {
	            System.out.print("\n�����������˵���Ϣ�����������䡢ѧ�ż�רҵ����");
	            Student p1 = new Student(sc.next(),sc.nextInt(),sc.next(),sc.next());
				list1.insert(list1.length(),p1);
                System.out.println(p1.getName() + "--  �ѱ��������Ա�");
			}else if (option.equals("d") || option.equals("D")) {
	            if (list1.isEmpty()) {
	            	System.out.println("\n���Ա�Ŀǰ�ǿձ����ܽ���ɾ��������");	            	
	            	continue;
	            }	
	            System.out.print("\n�����뱻ɾ���˵���Ϣ��ѧ�ţ���");
	            String num = sc.next();
	            for(int i = 0; i<list1.length(); i++){
	            	if((((Student)list1.get(i)).getNumber()).equals(num)){
	            		Student p2 = new Student();
	            		p2.setName(((Student)list1.get(i)).getName());
	            		p2.setAge(((Student)list1.get(i)).getAge());
	            		p2.setNumber(((Student)list1.get(i)).getNumber());
	            		p2.setSpeciality(((Student)list1.get(i)).getSpeciality());
	            		
	            		
	            		 int x = list1.indexOf(p2);
	            		 
	            		  if (x == -1)
	      	            	System.out.print("\n��ɾ����" + p2.getName() + "������!");
	      	            else{
	      		            list1.remove(i);
	      		            System.out.println(p2.getName() + "--  �Ѵ����Ա����Ƴ���");
	      	            }
	            	}
	            }
			}else if (option.equals("p") || option.equals("P")) {
	  				System.out.println("����\t����\tѧ��\tרҵ");
	  				System.out.println("----------------------------------");
	                list1.display();
	        }else if (option.equals("i") || option.equals("I")) {
	        	if (list1.isEmpty()) {
	            	System.out.println("\n���Ա�Ŀǰ�ǿձ����ܽ��в�ѯ������");	            	
	            	continue;
	            }
	        	System.out.print("\n�����뱻��ѯ�˵���Ϣ��ѧ�ţ���");
	        	String num = sc.next();
	        	for(int i = 0; i<list1.length(); i++){
	        		if((((Student)list1.get(i)).getNumber()).equals(num)){
	        			System.out.println("����\t����\tѧ��\tרҵ");
	  					System.out.println("----------------------------------");
	        			System.out.print(((Student) list1.get(i)).getName()+"\t"+((Student) list1.get(i)).getAge()+"\t"+((Student) list1.get(i)).getNumber()+"\t"+((Student) list1.get(i)).getSpeciality());
	        		}else
	        			System.out.println("���޴��ˣ���");
	        	}
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
		System.out.print("I����Ϣ��ѯ\n");
		System.out.print("Q: �˳�ϵͳ\n");
		System.out.print("\n");
		valid = false;
		while (valid == false)
		{
			System.out.print("���������ѡ��<A, D, P, Q, I>: ");
		    choice = new Scanner(System.in).next();
		    System.out.println();
		    if ("AaDdPpIiQq".indexOf(choice) != -1)
		    	valid = true;
		    else
		    	System.out.print("\n����ѡ�����");
		}
		return choice;
	}
}