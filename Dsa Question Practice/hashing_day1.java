import java.util.*;

public class hashing_day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of operations:");
        int Q = sc.nextInt();
        sc.nextLine(); 
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("\nAvailable Commands:");
        System.out.println("PUT <key> <value>");
        System.out.println("GET <key>");
        System.out.println("CONTAINS <key>");
        System.out.println("REMOVE <key>");
        System.out.println("----------------------------------");
        while (Q-- > 0) {
              System.out.print("Enter command: ");
            String[] input = sc.nextLine().split(" ");
            String operation = input[0];

            switch (operation) {
                case "PUT":
                    int keyPut = Integer.parseInt(input[1]);
                    int value = Integer.parseInt(input[2]);
                    map.put(keyPut, value);
                    break;

                case "GET":
                    int keyGet = Integer.parseInt(input[1]);
                    System.out.println(map.getOrDefault(keyGet, -1));
                    break;

                case "CONTAINS":
                    int keyContains = Integer.parseInt(input[1]);
                    System.out.println(map.containsKey(keyContains));
                    break;

                case "REMOVE":
                    int keyRemove = Integer.parseInt(input[1]);
                    map.remove(keyRemove);
                    break;
            }
        }

        sc.close();
    }
}