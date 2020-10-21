import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		Message msg1 = new Message("Text1");
		Message msg2 = new Message("Text2");
		Message msg3 = new Message("Text3");
		MessageRecorder recorder = new MessageRecorder();
		
		recorder.recordMessage(msg1);
		recorder.recordMessage(msg2);
		recorder.recordMessage(msg3);	
	}
	
	public static void printMessages(String message) {
		LinkedList list  = new LinkedList<>();
		
		list.push(message);
		
		System.out.println(list.toString());
	} 

}
