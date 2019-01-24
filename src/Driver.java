import java.util.ArrayList;
public class Driver {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        LinkedListFunctions.removeDup(list);
        System.out.println("Finished making linked list");
    }


}