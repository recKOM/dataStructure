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
	            System.out.print("\n请输入新增人的信息（姓名、年龄、学号及专业）：");
	            Student p1 = new Student(sc.next(),sc.nextInt(),sc.next(),sc.next());
				list1.insert(list1.length(),p1);
                System.out.println(p1.getName() + "--  已被加入线性表！");
			}else if (option.equals("d") || option.equals("D")) {
	            if (list1.isEmpty()) {
	            	System.out.println("\n线性表目前是空表，不能进行删除操作！");	            	
	            	continue;
	            }	
	            System.out.print("\n请输入被删除人的信息（学号）：");
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
	      	            	System.out.print("\n被删除人" + p2.getName() + "不存在!");
	      	            else{
	      		            list1.remove(i);
	      		            System.out.println(p2.getName() + "--  已从线性表中移除！");
	      	            }
	            	}
	            }
			}else if (option.equals("p") || option.equals("P")) {
	  				System.out.println("姓名\t年龄\t学号\t专业");
	  				System.out.println("----------------------------------");
	                list1.display();
	        }else if (option.equals("i") || option.equals("I")) {
	        	if (list1.isEmpty()) {
	            	System.out.println("\n线性表目前是空表，不能进行查询操作！");	            	
	            	continue;
	            }
	        	System.out.print("\n请输入被查询人的信息（学号）：");
	        	String num = sc.next();
	        	for(int i = 0; i<list1.length(); i++){
	        		if((((Student)list1.get(i)).getNumber()).equals(num)){
	        			System.out.println("姓名\t年龄\t学号\t专业");
	  					System.out.println("----------------------------------");
	        			System.out.print(((Student) list1.get(i)).getName()+"\t"+((Student) list1.get(i)).getAge()+"\t"+((Student) list1.get(i)).getNumber()+"\t"+((Student) list1.get(i)).getSpeciality());
	        		}else
	        			System.out.println("查无此人！！");
	        	}
	        }
	        System.out.println();
	   }
	   list1.clear();
	   System.out.println("谢谢使用本系统，再见。。。");
	}


	public static String menu() {
		boolean valid;
		String choice = "";
		System.out.print("\n---操作---\n");
		System.out.print("\n");
		System.out.print("A: 增加新人\n");
		System.out.print("D: 删除老人\n");
		System.out.print("P: 显示列表\n");
		System.out.print("I：信息查询\n");
		System.out.print("Q: 退出系统\n");
		System.out.print("\n");
		valid = false;
		while (valid == false)
		{
			System.out.print("请输入你的选择<A, D, P, Q, I>: ");
		    choice = new Scanner(System.in).next();
		    System.out.println();
		    if ("AaDdPpIiQq".indexOf(choice) != -1)
		    	valid = true;
		    else
		    	System.out.print("\n操作选择错误！");
		}
		return choice;
	}
}