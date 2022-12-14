import java.util.Scanner;
import java.lang.String;
public class LinkedList{
	node head;
	int size=0;
	class node{
		String data;
		node next;
		node(String data)
		{
			this.data=data;
			this.next=null;		
		}
	}
	
	public void addfirst(String data)
	{
		node newnode=new node(data);
		size++;
		if(head==null)
		{
			head=newnode;
			return;
		}
		newnode.next=head;
		head=newnode;
	}
	
	public void addlast(String data)
	{
		node newnode=new node(data);
		size++;
		if(head==null)
		{
			head=newnode;
			return;
		}
		node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=newnode;
	}
	public void insert(String data,int index)
	{
		if(head==null)
		{
			node newnode=new node(data);
			head=newnode;
			size++;
			return;
		}
		if(index<=size)
		{
			node newnode=new node(data);
			size++;
			if(index==0)
			{
				newnode.next=head;
				head=newnode;
				return;
			}
			node temp=head;
			for(int i=0;i<index-1;i++)
			{
				temp=temp.next;
			}
			newnode.next=temp.next;
			temp.next=newnode;
		}
		else
		{
			System.out.println("index invalid");
		}
	}
	
	public int getsize(){
		return size;
	}
	
	public void print(){
		if(head==null)
		{
			System.out.println("empty list");
			return;
		}
		node curr=head;
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	
	public void deletefirst(){
		if(head==null)
		{
			System.out.println("empty list");
			return;
		}
		size--;
		head=head.next;		
	}
	
	public void deletelast()
	{
		if(head==null)
		{
			System.out.println("empty list");
			return;
		}
		size--;
		node last=head.next;
		node secondlast=head;
		while(last.next!=null){
			last=last.next;
			secondlast=secondlast.next;
		}
		secondlast.next=null;
	}
	
	public void remove(int index){
		if(head==null)
		{
			System.out.println("empty list");
			return;
		}
		if(index<size)
		{
			size--;
			if(index==0)
			{
				head=head.next;
				return;
			}
			node last=head.next;
			node secondlast=head;
			for(int i=0;i<index-1;i++)
			{
				last=last.next;
				secondlast=secondlast.next;
			}
			secondlast.next=last.next;
		}
		else
		{
			System.out.println("invalid index");
		}
	}
	
	public void search(){
		System.out.println("enter the string to search");
		Scanner sc=new Scanner(System.in);
		String key=sc.next();
		node curr=head;
		for(int i=0;i<size;i++)
		{
			if(key.compareTo(curr.data)==0)
			{
				System.out.println("found at "+i);
				return;
			}
			else
			{
				curr=curr.next;
			}
		}
		System.out.println("Not found");
	}
	
	public void deleteoccurrences(){
		System.out.println("enter the string whose occurrences are to be deleted");
		Scanner sc=new Scanner(System.in);
		String key=sc.next();
		node curr=head;
		for(int i=0;i<size;)
		{
			if(key.compareTo(curr.data)==0)
			{
				remove(i);
			}
			else
			{
			i++;
			}
			curr=curr.next;
		}
	}
		public void middle(){
			int mid=size/2;
			System.out.println(get(mid));
		}
		
		public String get(int index){
			node curr=head;
			for(int i=0;i<size;i++)
			{
				if(i==index)
					return curr.data;
				else
					curr=curr.next;
			}
			return "Wrong input";
		}
	
	public static void main(String args[]){
		LinkedList linkedlist=new LinkedList();
		linkedlist.addfirst("d");
		linkedlist.addfirst("b");
		linkedlist.addfirst("a");
		linkedlist.insert("c",2);
//		linkedlist.addlast("e");
//		linkedlist.deletelast();
//		linkedlist.remove(3);
//		linkedlist.print();
//		System.out.println("\nsize="+linkedlist.getsize());
//		linkedlist.search();
//		linkedlist.insert("b",3);
//		linkedlist.insert("b",4);
//		linkedlist.print();
//		linkedlist.deleteoccurrences();
		linkedlist.print();
		linkedlist.middle();
		linkedlist.reverse();
	}
}
