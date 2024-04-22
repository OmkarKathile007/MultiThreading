package MultiThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public class Practice_Set {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(87);
        ar.add(98);
        ar.add(76);
        ar.add(12);
        System.out.println(ar);

        // Use To sort the arraylist in Ascending order
        Collections.sort(ar);
        System.out.println(ar);

        // It can Store Only String Type of the data.....
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Omkar");
        arr.add("123");
        arr.add("Kathile");
        System.out.println(arr);

        for (int i = 0; i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        for (String st:arr) {
            System.out.println(arr);
        }
        Iterator itr = arr.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        arr.remove(0);
        System.out.println(arr);




    }
}
