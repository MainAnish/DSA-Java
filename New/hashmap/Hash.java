
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) 
        {
            Scanner in = new Scanner(System.in);
            HashMap<Integer,Integer> map=new HashMap<>();
            System.out.print("Enter no.of entries:");
            int n=in.nextInt();
            int key,value;
            for(int i=0;i<n;i++){
                System.out.println("Enter the key:");
                key=in.nextInt();
                System.out.println("Enter the value:");
                value=in.nextInt();
                map.put(key,value);
            }
            System.out.println("Hashmap:"+map);

            System.out.println("Enter the key to search:");
            key=in.nextInt();
            System.out.println("Value:"+map.get(key));

            System.out.println("Enter Key to check:");
            key=in.nextInt();
            System.out.println("Key exists:"+map.containsKey(key));

            System.out.println("Enter key or get Default:");
            key=in.nextInt();
            System.out.println("Reasult:"+map.getOrDefault(key,0));

            System.out.println("Size:"+map.size());
            System.out.println("Is Empty:"+map.isEmpty());

            System.out.println("Keys:"+map.keySet());
            System.out.println("Values:"+map.values());

            System.out.println("All Entries:");
            for(Map.Entry<Integer,Integer> entry :map.entrySet()){
                System.out.println(entry.getKey()+"="+entry.getValue());
            }
            System.out.print("Enter key to remove: ");
            key = in.nextInt();
            map.remove(key);
            System.out.println("After removal: " + map);

            System.out.print("Enter key for putIfAbsent: ");
            key = in.nextInt();
            System.out.print("Enter value: ");
            value = in.nextInt();
            map.putIfAbsent(key, value);
            System.out.println("After putIfAbsent: " + map);

            System.out.print("Enter key to replace: ");
            key = in.nextInt();
            System.out.print("Enter new value: ");
            value = in.nextInt();

            if (map.replace(key, value) != null) {
                System.out.println("Value replaced.");
            } else {
                System.out.println("Key not found.");
            }
            System.out.println(map);

            System.out.print("Clear the HashMap? (true/false): ");
            boolean clear = in.nextBoolean();

            if (clear) {
                map.clear();
            }

            System.out.println("Final HashMap: " + map);
            in.close();
        }
}
