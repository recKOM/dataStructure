package dataStructure;

import dataStructure.linearList.LinkStack;

public class EightQueen{
	public int x,y;
	public EightQueen(int x,int y){
		this.x = x;
		this.y = y;
	}
public EightQueen(EightQueen que){
		x = que.x;
		y = que.y;
	}
public static int value(EightQueen que1, EightQueen que2){
		
			if(que1.y == que2.y || Math.abs(que1.x-que2.x) == Math.abs(que1.y-que2.y)){
				return 0;
			}
				return 1;
	}
public String toString(){
	return "(" + x + "," + y +") ";
}
	
public static void main(String args[]) throws Exception{
		EightQueen que = new EightQueen(0,0);
		LinkStack<EightQueen> front = new LinkStack();
		LinkStack<EightQueen> back = new LinkStack();
		front.push(que);
		que = new EightQueen(que.x+1,0);
		while(que.x<8){
			if(que.y>7){
				que = new EightQueen(front.pop());
				que.y++;
			}
			int i;
			int j = 0;
			int length = front.length();
			for(i=0;i<length;i++){
				if(value(que,front.peek())==0){
					j++;
				}
				back.push(front.pop());
			}
			
			while(!back.isEmpty()){
				front.push(back.pop());
			}
			
			if(j != 0){
				que.y++;
				if(que.y>7 || front.length()>8){
					que = new EightQueen(front.pop());
					que.y++;
				}
			}else{
				front.push(que);
				que = new EightQueen(que.x+1,0);
			}
			
		}
		front.display();
	}
}