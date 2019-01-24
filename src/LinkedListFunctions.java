import java.util.ArrayList;

public class LinkedListFunctions {

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

    //brute force method
    public static ArrayList<Integer> returnKthToLastElement(int k, ArrayList<Integer> list){
        

        return list;
    }
}
