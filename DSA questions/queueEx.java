/* Create a class Queue and implement the following operations to create a Queue from scratch 

Enqueue
Dequeue
is_empty
get_first_element - element present in the front of the the Queue.
*/

import java.util.*;
public class QueueEx
{ 
	public static void main(String args[])
	{
		Queue q1= new Queue(); // created an object of class Queue
		q1.enqueue(1);
		q1.enqueue(67);
		q1.enqueue(98);
		System.out.println(q1.q);
		q1.dequeue();
		q1.dequeue();
		System.out.println(q1.front);
		System.out.println(q1.rear);
		q1.isempty();
		int first=q1.get_first_element();
		System.out.println("First Element:"+ first);
		
	}
}
class Queue
{
	ArrayList<Integer> q;  //creating arraylist
	int front, rear;       // declaring variable;
	
	Queue() //creating a constructor
	{
		q= new ArrayList<>();
		this.front=-1;
		this.rear=-1; 
		
	}
	
	void enqueue(int ele)
	{
		if (this.front==-1)
		{
			this.front=this.front+1;
			this.rear=this.rear+1;
		}
		else
		{
			this.rear=this.rear+1;
		}
		this.q.add(rear, ele);
	}
	
	void dequeue()
	{
		if(this.front==this.rear) //check whether the queue is empty
		{
			this.front=-1;
			this.rear=-1;
		}
		
		else
		{
			this.front=this.front+1;
		}
		
		
	}
	
	void isempty()
		{
			if(front==-1 & rear==-1) // to check whether queue is empty;
			{
				System.out.println("Queue is empty");
			}
		}
	
	int get_first_element()
	{
		if(this.front==-1)
		{
			return-1;  //queue is empty
		}
		
		return this.q.get(this.front);
		
	}
	
}
