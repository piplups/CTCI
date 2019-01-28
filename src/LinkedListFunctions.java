import java.util.ArrayList;

public class LinkedListFunctions {

    // Chapter 2: Linked Lists

    // 2.1 Remove Dups: Write code to remove duplicates from an unsorted linked list
    // brute force method
    public static ArrayList<Integer> removeDup(ArrayList<Integer> list){
        // base case: Empty or 1
        if(list.isEmpty() || list.size() == 1)
            return list;
        // case for > 1
        ArrayList<Integer> buffer = new ArrayList<>();
        buffer.add(list.get(0));
        // iterate through elements after the first
        for(int i = 1; i < list.size(); i++){
            for(int j = 0; j < buffer.size(); j++){
                // checks if elements are the same AND if it's already in the buffer
                if (buffer.get(j) != list.get(i) && !buffer.contains(list.get(i))){
                    buffer.add(list.get(i));
                }
            }
        }
        return buffer;
    }

    public static Node removeDup(Node list){
        // base case: 0 or 1 node
        if(list == null || list.next == null)
            return list;
        // case: 2+ nodes
        ArrayList<Integer> buffer = new ArrayList<>();
        // add first value of list into buffer
        buffer.add(list.data);
        list = list.next;
        // while not at the end of the list
        // check for every value in the buffer
        // if it equals the value in list.next.data
        // and if so, delete that node.
        // Otherwise, add the newly discovered node
        // into the buffer.
        while(list.next != null){
            for(int i : buffer) {
                if (list.data == i) {
                    list.next = list.next.next;
                    break;
                }
                else
                    buffer.add(list.next.data);
            }

            list = list.next;
        }
        return list;
    }


    //brute force method
    public static ArrayList<Integer> returnKthToLastElement(int k, ArrayList<Integer> list){
        int count = 0;

        return list;
    }
}
