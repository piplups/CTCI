import java.util.ArrayList;
public class Driver {
    public static void main(String args[]){

        Node linkedList = new Node(1);
        linkedList.appendToTail(2);
        linkedList.appendToTail(1);
        linkedList.appendToTail(3);
        linkedList.appendToTail(3);
        linkedList.appendToTail(4);
        linkedList.appendToTail(5);
        linkedList.appendToTail(6);

        //LinkedListFunctions.removeDup(list);
        System.out.println("Finished making linked list");
    }


}