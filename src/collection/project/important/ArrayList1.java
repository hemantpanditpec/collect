package collection.project.important;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Scanner;		
public class ArrayList1 {
		
	
	 static public int add(int a) {
		a=a+1;
		
		return a;
	}
	
	
	public static void main(String[] args) {
		
//-------------List---------------------		
	
		Scanner s1=new Scanner(System.in);
//		
		int d1=s1.nextInt();
		System.out.println("Please Enter value ::"+d1);
		
		System.out.println("Enter value ::");
		ArrayList<Integer> arraylist1=new ArrayList<Integer>();
		arraylist1.add(8);
		arraylist1.add(8);
		arraylist1.add(7);
		arraylist1.add(6);
		arraylist1.add(5);
		arraylist1.add(4);
		arraylist1.add(3);
		arraylist1.add(2);
		arraylist1.add(1);
	System.out.println("ArrayList ::"+arraylist1);
	
	int b=ArrayList1.add(2);
	System.out.println(b);
	
		
		
		LinkedList<Integer> linkedlist1=new LinkedList<Integer>();
		linkedlist1.add(8);
		linkedlist1.add(8);
		linkedlist1.add(7);
		linkedlist1.add(6);
		linkedlist1.add(5);
		linkedlist1.add(4);
		linkedlist1.add(3);
		linkedlist1.add(2);
		linkedlist1.add(1);
	System.out.println("LinkedList ::"+linkedlist1);	
		
		Vector<Integer> vector=new Vector<Integer>();
		vector.add(8);
		vector.add(8);
		vector.add(7);
		vector.add(6);
		vector.add(5);
		vector.add(4);
		vector.add(3);
		vector.add(2);
		vector.add(1);
	System.out.println("Vector ::"+vector);	
		
		Stack<Integer> stack=new Stack<Integer>();
		stack.add(8);
		stack.add(8);
		stack.add(7);
		stack.add(6);
		stack.add(5);
		stack.add(4);
		stack.add(3);
		stack.add(2);
		stack.add(1);
	System.out.println("Stack ::"+stack);

	//------------Set------------------------
	
	HashSet<Integer> hashset=new HashSet<Integer>();
		hashset.add(8);
		hashset.add(8);
		hashset.add(7);
		hashset.add(6);
		hashset.add(5);
		hashset.add(4);
		hashset.add(3);
		hashset.add(2);
		hashset.add(1);
	System.out.println("Set ::"+hashset);
	
	LinkedHashSet<Integer> linkedhashset=new LinkedHashSet<Integer>();
		linkedhashset.add(8);
		linkedhashset.add(8);
		linkedhashset.add(7);
		linkedhashset.add(6);
		linkedhashset.add(5);
		linkedhashset.add(4);
		linkedhashset.add(3);
		linkedhashset.add(2);
		linkedhashset.add(1);
	System.out.println("LinkedHashSet ::"+linkedhashset);	
	
	TreeSet<Integer> treeset=new TreeSet<Integer>();
		treeset.add(8);
		treeset.add(8);
		treeset.add(7);
		treeset.add(6);
		treeset.add(5);
		treeset.add(4);
		treeset.add(3);
		treeset.add(2);
		treeset.add(1);
	System.out.println("treeset :: "+treeset);	
	//------------Queue----------------------
	
	PriorityQueue<Integer> priorityqueue=new PriorityQueue<Integer>();
		priorityqueue.add(8);
		priorityqueue.add(8);
		priorityqueue.add(7);
		priorityqueue.add(6);
		priorityqueue.add(5);
		priorityqueue.add(4);
		priorityqueue.add(3);
		priorityqueue.add(2);
		priorityqueue.add(1);
System.out.println("PriorityQueue ::"+priorityqueue);
	LinkedList<Integer> linkedlist=new LinkedList<Integer>();
	
	linkedlist.add(8);
	linkedlist.add(8);
	linkedlist.add(7);
	linkedlist.add(6);
	linkedlist.add(5);
	linkedlist.add(4);
	linkedlist.add(3);
	linkedlist.add(2);
	linkedlist.add(1);
System.out.println("linkedlist :: "+linkedlist);
	
	ArrayDeque<Integer> arrayqueue=new ArrayDeque<Integer>();
	arrayqueue.add(8);
	arrayqueue.add(8);
	arrayqueue.add(7);
	arrayqueue.add(6);
	arrayqueue.add(5);
	arrayqueue.add(4);
	arrayqueue.add(3);
	arrayqueue.add(2);
	arrayqueue.add(1);
System.out.println("ArrayQueue :: "+arrayqueue );
	
	}	
			
		
		
}			
		