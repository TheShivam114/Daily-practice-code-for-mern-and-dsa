/*
Find Itinerary from Tickets

You are given a list of flight tickets represented as pairs of departure city and destination city.
Your task is to find the complete itinerary in the correct order.

It is guaranteed that:

The itinerary forms a valid continuous journey.
There is exactly one starting city that is not a destination of any other city.
Input
"Chennai" -> "Bengaluru"
"Mumbai"  -> "Delhi"
"Goa"     -> "Chennai"
"Delhi"   -> "Goa"
Output
Mumbai -> Delhi -> Goa -> Chennai -> Bengaluru
Explanation
Mumbai is the starting city because it never appears as a destination.
Following the ticket chain:
Mumbai → Delhi
Delhi → Goa
Goa → Chennai
Chennai → Bengaluru

So the complete itinerary is:

Mumbai -> Delhi -> Goa -> Chennai -> Bengaluru
Constraints
Number of tickets 1≤n≤10
5
City names contain only letters and spaces.
Hint

Use a HashMap to store source → destination mappings and another map/set to identify the starting city.
*/
    import java.util.*;
public class hashing_day12{
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> reverseMap = new HashMap<>();
        for (String key : tickets.keySet()) {
            reverseMap.put(tickets.get(key), key);
        }
        for (String key : tickets.keySet()) {
            if (!reverseMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        String start = getStart(tickets);
        while (tickets.containsKey(start)) {
            System.out.print(start + " -> ");
            start = tickets.get(start);
        }

        System.out.println(start);
    }
}

