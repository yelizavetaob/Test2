import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Test.txt");
        FileInputStream inputStream = new FileInputStream(file);

        inputStream.read();
        inputStream.close();

        String[] str = new String().trim().split("\\s+");
        int[] array = new int[str.length];

        Set set = new HashSet();
            for(int i = 0; i < str.length; i++) {
                set.add(array[i]);
            }
        System.out.println(set);

            List list = new LinkedList();
        for(int i = 0; i < str.length; i++) {
            if(array[i] % 2 == 0){
                list.add(array[i]);
            }
        }

        System.out.println(list);

        Map map = new TreeMap();
        for(int i:  array){
            for(i = 0; i < str.length; i++){
                    map.put(array[i], i);
            }
        }
        System.out.println(map);
    }
}
