import java.util.*;

public class MessageRecorder {

	private LinkedList<Message> msgList;
	
	public MessageRecorder() {
		this.msgList = new LinkedList<>();
	}
	
	public void recordMessage(Message message) {
		msgList.add(message);
		System.out.println("Message recorded!");
	}
	
	public Message getNextMessage() {
		if(msgList.isEmpty()) {
			return null;
		}
		
		return msgList.poll();
		
	}
	
	public Message[] getAllMessages() {
		Message[] messages = new Message[msgList.size()];
		int index = 0;
		
		while(!msgList.isEmpty()) {
			messages[index] = msgList.poll();
					index++;
		}
		
		return messages;
	}
	
	public boolean isEmpty() {
		return msgList.isEmpty();
	}
}
