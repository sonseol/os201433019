package FIFO;

import java.util.*;

public class FIFO{
	public static void main(String[] args) {
		Queue<String> q=new LinkedList<String>();
		
		q.offer("1");
		q.offer("2");
		q.offer("3");
		q.offer("4");
	
		while(q.peek()!=null)
		{
			System.out.printf("%s ",q.poll());
		}
		System.out.println();
	}
}

