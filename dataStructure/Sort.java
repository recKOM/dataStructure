package dataStructure;

import java.util.Scanner;

import dataStructure.linearList.LinkQueue;

public class Sort {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("����һ�����У����ּ����ÿո�ָ���");
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		LinkQueue Q1 = new LinkQueue();
		LinkQueue Q2 = new LinkQueue();
		LinkQueue Q3 = new LinkQueue();
		for(int i = 0; i<str.length; i++){
			int num = Integer.parseInt(str[i]);
			if(num < 10&&num > 0){
				Q1.offer(num+" ");
			}else if(num < 100){
				Q2.offer(num+" ");
			}else if(num < 1000){
				Q3.offer(num+" ");
			}
		}
		System.out.println("�������˳���ǣ�");
		Q1.display();Q2.display();Q3.display();
	}

}
