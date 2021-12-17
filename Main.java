// Class for Doubly Linked List.
	public class DLL{
	 Node head; //Head of the linked list.
	 /* Doubly Linked List node.*/
	 class Node{
	 int data;
	 Node prev, next;
	 // Constructor to create a new node.
	 // next and prev is by default initialized as NULL.
	 Node(int d){data =d;}
	 }
	 // Adding a node at the front of the list.
	 public void push(int new_data){
	 /* 1. Allocate node.
	 * 2. Put in the data.*/
	 Node new_Node = new Node(new_data);
	 /* 3. Make next of new_Node as head and previous as NULL.*/
	 new_Node.next=head;
	 new_Node.prev=null;
	 /* 4. Make previous of head as new_Node.*/
	  if(head!=null){
	  head.prev=new_Node;
	  }
	  /* 5. Make the new_Node as head.*/
	  head=new_Node;
	  }
	  //This function prints contents of the linked list starting from the given node.
	  public void printlist(Node node){
	  Node last=null;
	  while(node!=null){
	  System.out.println(node.data + " ");
	  last=node;
	  node=node.next;
	  System.out.println();
	  }
	  }
	  // Function to delete a node in a DLL.
	  void deleteNode(Node del){
	  // Base Case
	  if(head==null||del==null){
	  return;
	  }
	  // If node to be deleted is head node.
	  if(head==del){
	  head=del.next;
	  }
	  // Change next only if node to be deleted is not the last node.
	  if(del.next!=null){
	  del.next.prev=del.prev;
	  }
	  // Change previous only if the node to be changed is not the first node.
	  if(del.prev!=null){
	  del.prev.next=del.next;
	  }
	  // Finally, free the memory occupied by del.
	  return;
	  }
	  // Driver code
	  public static void main(String [] args)
	  {
	  // Start with the empty list.
	  DLL dll = new DLL();
	  // Insert '2', so that linked list becomes 2-> NULL.
	  dll.push(2);
	  // Insert '4', so that linked list becomes 4->2->NULL.
	  dll.push(4);
	  // Insert '8', so that linked list becomes 8->4->2->NULL.
	  dll.push(8);
	  // Insert '10', so that linked list becomes 10->8->4->2->NULL.
	  dll.push(10);
	  System.out.println("The Created DLL is : ");
	  dll.printlist(dll.head);
	  // Deleting first node.
	  dll.deleteNode(dll.head);
	  // List after deleting the first node, 8->4->2->NULL. 
	  // Deleting the middle node i.e. '4'.
	  dll.deleteNode(dll.head.next);
	  // List after deleting the middle node, 8->2->NULL.
	  // Deleting the last node i.e. '2'.
	  dll.deleteNode(dll.head.next);
	  // List after deleting the last node, 8->NULL.
	  System.out.println("Modified DLL is : ");
	  dll.printlist(dll.head);
	  }
	  }
