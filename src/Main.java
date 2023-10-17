import com.google.common.primitives.Longs;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        long arr[] = { 1, 2, 3, 4, 5 };
        List<Long> myList = Longs.asList(arr);
        System.out.println(myList);


        long arr2[] = { 3, 5, 7 };
        List<Long> myList2 = Longs.asList(arr2);
        System.out.println(myList2);
    }
}