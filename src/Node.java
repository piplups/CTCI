public class Node {
    Node next = null;
    int data;

    public Node(int d){
        data = d;
    }

    // returns true if the list is empty, false otherwise
    void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }
    public boolean isEmpty(){
        if(this == null)
            return true;
        else
            return false;
    }

    // returns the number of items in the list
    public int size(){
        Node n = this;
        int size = 0;
        if(n != null) {
            size = 1;
            while(n.next != null){
                size++;
                n = n.next;
            }
        }
        return size;
    }

    // adds an item to the list at the given index
    // precondition: none
    // postcondition: item is added at the given index;
    // the indices of following items are increased by 1.
    public void add(int index, Node node){
        int i = 0;
        Node n = this;
        while(i < index-1){
            i++;
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }

    public void remove(int index){}
    // removes the item from the list that has the given index
    // precondition: none
    // postcondition: removes the first item in the list whose equl method
    // matches that of the given item
    public void remove(Object item){}
    // removes an item from the list
    // precondition: none
    // postcondition: removes the first item in the list whose equal method
    // matches that of the given item; the indices of the following items are
    // decreased by 1
    public Node duplicate(){
        return this;
    }
    // creates a duplicate of the list
    // precondition: none
    // postcondition: returns a copy of the linked list
    public Node duplicateReversed(){
        return this;
    }
    // creates a duplicate of the list with the nodes in reverse order
    // precondition: none
    // postcondition: returns a copy of the linked list with the nodes in
    // reverse order
}
