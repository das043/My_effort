package linkedlist;
import java.util.Random;
public class Linkedlist {
    
    public static Node head = null;
    public static Node tail = null;
    public static Random random = new Random();
    
    /* add element in linked list  */
    public void add_element_in_linked_list(int element){
        if (head == null){
               head = new Node(element);
               tail=head;
        }
        else{
            Node temp = new Node(element);
            tail.next=temp;
            tail=temp;
        }
    }
    
    /* print linked list of given node  */
    public void print_element_of_linked_list(Node temp){
        while (temp!= null) { 
            System.out.print(temp.data + " ");  
            temp = temp.next; 
        }
        System.out.println();
    }
     
    /* add element in linked list using recursion  */ 
    public void insert_element_in_linked_list_using_recursion(int start_number , int num_of_element){
        if (num_of_element>0){
            int temp_count = num_of_element-1;
            add_element_in_linked_list(start_number);
            int element = start_number+1;
            insert_element_in_linked_list_using_recursion(element,temp_count);
        }
        return;
    }

    
    
   public static void main(String[] args) {
        Linkedlist linked_list = new Linkedlist();
        int num_of_element = random.nextInt(50);
        int start_number = 1;
        linked_list.insert_element_in_linked_list_using_recursion(start_number,num_of_element);
        linked_list.print_element_of_linked_list(head);
  
    }
    
}
