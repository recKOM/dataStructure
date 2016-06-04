package dataStructure;
import dataStructure.linearList.LinkStack;
import java.util.Scanner;

public class Example3_3 {

	public static void main(String[] args) throws Exception {  
		Example3_3 p = new Example3_3();
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入中缀表达式："); 
		String inFix = sc.nextLine();
		LinkStack<String> x =p.createLinkstack(inFix);
		System.out.println();
		System.out.println("\n表达式运算结果为：" + p.numberCalculate(x));
	} 

	public int priority(char operator)
	{
		switch(operator)
		{
			case '^': return 3;

		    case '%': 
	        case '*':
	        case '/': return 2;

		    case '+':
		    case '-': return 1;
		}
		return 0;
	}
	
	public LinkStack<String> createLinkstack(String inFix) throws Exception{
		
		LinkStack<String> num = new LinkStack();
		if ("".equals(inFix) || inFix == null)
		throw new Exception("错误：算术表达式不能为空");// 抛出异常

	LinkStack<Character> stack = new LinkStack();
	String postFix = "";
	char token=' ',topToken=' ';
	
	for (int i = 0; inFix != null && i < inFix.length(); i++) {
		token = inFix.charAt(i);
	    if (token == '(') {
       		stack.push(token);
	    } 
	    else if (token == ')') {
	        topToken = stack.pop();
	        while (topToken != '(') {
	        	postFix = postFix.concat(String.valueOf(topToken));
	        	num.push(String.valueOf(topToken));
	            topToken = stack.pop();
	        }
	    } 
	    else if (isOperator(token)) {
	    	if(!stack.isEmpty())	topToken = stack.peek();
	        while (!stack.isEmpty() && (priority(token) <= priority(topToken))) {
            	topToken = stack.pop();
                postFix = postFix.concat(String.valueOf(topToken));
            	num.push(String.valueOf(topToken));
                if(!stack.isEmpty())	topToken = stack.peek();
            }
            stack.push(token);
	    } 
	    else{
            String str = String.valueOf(inFix.charAt(i));
            
            if(i !=(inFix.length()-1) && !isOperator(inFix.charAt(i+1)) && inFix.charAt(i+1) != '(' && inFix.charAt(i+1) != ')'){
            	int j=i;
            	while(!isOperator(inFix.charAt(j+1)) && inFix.charAt(j+1) != '(' && inFix.charAt(j+1) != ')'){
            		str = str.concat(String.valueOf(inFix.charAt(j+1)));
            		j++;
            	}
            	i=j;
            	num.push(String.valueOf(str));
            	postFix = postFix.concat(str);
            }
            else if (i !=(inFix.length()-1) && (isOperator(inFix.charAt(i+1)) || inFix.charAt(i+1) == '(' || inFix.charAt(i+1) == ')') && (isOperator(inFix.charAt(i-1)) || inFix.charAt(i-1) == '(' || inFix.charAt(i-1) == ')')){
            	num.push(String.valueOf(str));
            	postFix = postFix.concat(str);
            }
            else if(i == (inFix.length()-1) && !isOperator(inFix.charAt(i)) && inFix.charAt(i) != '(' && inFix.charAt(i) != ')'){
            
            	num.push(String.valueOf(str));
            	postFix = postFix.concat(str);
            }
            
           
	    }
	}
	
		while (!stack.isEmpty()) {
			token = stack.pop();
		    postFix = postFix.concat(String.valueOf(token));
		    num.push(String.valueOf(token));
	    }
		//System.out.println("\n后缀表达式为：" + postFix);
		return num;
	}
	
	public double numberCalculate(LinkStack<String> x) throws Exception{
		LinkStack<String> temp = new LinkStack();
		while(!x.isEmpty()){
			temp.push(x.peek());
			x.pop();
		}
		
		//temp.display();
		String[] str = new String[temp.length()];
		LinkStack<String> back = new LinkStack();
		int i = 0;
		while(!temp.isEmpty()){
			str[i] = temp.peek();
			back.push(temp.pop());
			i++;
		}
		System.out.print("后缀表达式为：");
		for(int j = 0; j < str.length; j++){
			System.out.print(str[j]);
		}
		System.out.println();
		while(!back.isEmpty()){
			temp.push(back.pop());
		}
		//temp.display();
		LinkStack<Double> stack = new LinkStack();
			while(!temp.isEmpty()){
			String token = temp.pop();
			if (isOperator(token.charAt(0))){
				Double d2 = stack.pop();
				Double d1 = stack.pop();
				double result = 0;
				
				if (token.charAt(0) == '+')	result = d1 + d2;
				if (token.charAt(0) == '-')	result = d1 - d2;
				if (token.charAt(0) == '*')	result = d1 * d2;
				if (token.charAt(0) == '^')	result = Math.pow(d1,d2);
				if (token.charAt(0) == '/' && d2 != 0)	result = d1 / d2;
				if (token.charAt(0) == '%' && d2 != 0)	result = d1 % d2;
				
				stack.push(result);
			}else {
					stack.push(Double.parseDouble(token));
			}
		}
		return stack.pop();
	}
	


	public boolean isOperator(char c){
		return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '%' );
	}
}

