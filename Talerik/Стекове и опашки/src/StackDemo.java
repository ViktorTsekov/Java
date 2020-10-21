import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	      String text = "(1+2)) * (2+1)";
          System.out.println(checkBrackets(text));
	}

	public static boolean checkBrackets(String text) {
	     Stack stack = new Stack<>();
	     int index = 0;
	     
	     for (int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == '(') {
				stack.push(text.charAt(i));
			} else if(text.charAt(i) == ')') {
				
				if(stack.isEmpty()) {
					return false;
				}
				
				stack.pop();
			}
			
		 }
	     
	     if(stack.isEmpty()) {
	    	 return true;
	     } 
	     
	     return false;
	}
	
}
