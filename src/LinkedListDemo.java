
public class LinkedListDemo {
	int a;  // Declaring variable x
	LinkedListDemo next=null;  // Declaring the class variable
	public LinkedListDemo(int a, LinkedListDemo next) //  Method 
	{
	this.a = a;  //we are taking the reference of a
	this.next = next; //we are taking the reference next
	}

	public static void main(String[] args)
	{
		// Here we are creating  the objects  
		LinkedListDemo a = new LinkedListDemo(10, null); 
		LinkedListDemo b = new LinkedListDemo(20, null);
		LinkedListDemo c = new LinkedListDemo(30, null );
		LinkedListDemo d = new LinkedListDemo(40, null);
		LinkedListDemo e = new LinkedListDemo(50,null);

	 /** Here we are taking the next reference drom the current node and making it current element
     **/
	a.next = b;  
	b.next = c;
	c.next=d; 
	d.next = e;

	System.out.print("Linked list: ");
	//Here by using pointer we refer the address of the next element in the list
	for( LinkedListDemo abc = a; abc!=null; abc=abc.next) 
	{
	System.out.print(abc.a+ " " );
	}
	
	}

	
	}


