package dataStructure;
import java.util.Scanner;
import dataStructure.linearList.SqStack;

public class TenChangeTwo {
	public static void main(String[] args) throws Exception {
		int ten,ten1;
		int digits = 1;//��ʾ����ʮ��������λ����һ����ʽ���ٵ�Ϊԭλ����
		int space = 1;//��ʾջ����ռ䣨2��λ���η���
		System.out.println("������һ��ʮ��������");
		Scanner sc = new Scanner(System.in);
		ten = sc.nextInt();
		ten1 = ten;
		//�������ʮ��������λ����һ
		while(ten1!=0){
			ten1/=10;
			digits++;
		}
		//���ջ����ռ�
		while(digits!=0){
			space*=2;
			digits--;
		}
		SqStack<Integer> two = new SqStack<Integer>(space);
		while(ten!=0){
			int i = ten%2;
			ten/=2;
			two.push(i);
		}
		while(!two.isEmpty()){
			System.out.print(two.pop());
		}
	}

}
