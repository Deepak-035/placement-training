package com;

public class Queue {
	private int SIZE =5;
	private int[] items = new int[SIZE];
	private int front =-1;
	private int rear = -1;
	public boolean isFull()
	{
		return front == 0 && rear ==SIZE-1;
	}
	public boolean isEmpty()
	{
		return front==-1 && rear==-1;
	}
	
	public void enQueue(int element)
	{
		if(isFull())
		{
			System.out.println("The Queue is full");
		}
		else
		{
			if(front == -1) front=0;
			rear++;
			items[rear]=element;
			System.out.println("Inserted "+element);
		}
	}
	public void deQueue() 
	{
	    if (isEmpty())
	    {
	        System.out.println("The Queue is empty");
	    } 
	    else
	    {
	        int element = items[front];
	        System.out.println(element + " Removed from the Queue");
	        front++;  
	        if (front > rear)
	        {
	            front = rear = -1;
	        }
	    }
	}
	public static void main(String[] args)
	{
		Queue q = new Queue();
		System.out.println("Queue operation");
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(6);
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		
		
	}

}
