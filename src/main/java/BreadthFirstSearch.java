import java.util.*;

public class BreadthFirstSearch {
    public static Map<String, List<String>> graph = new HashMap<String, List<String>>();
    static Queue<String> queue = new LinkedList<String>();
    static Map<String, Boolean> verifiedNames = new HashMap();

    public static void main(String[] args) {
        populateGraph();
        mountSearchQueue();
        findSeller();
    }

    public static void populateGraph() {
        graph.put("You", new ArrayList<String>(Arrays.asList("Alice", "Bob", "Claire")));
        graph.put("Bob",  new ArrayList<String>(Arrays.asList("Alice", "Anuj", "Peggy")));
        graph.put("Claire",  new ArrayList<String>(Arrays.asList(  "Thom", "Jonny")));
        graph.put("Alice",  new ArrayList<String>(Arrays.asList("Peggy")));
        graph.put("Anuj",  new ArrayList<String>());
        graph.put("Peggy",  new ArrayList<String>());
        graph.put("Jonny",  new ArrayList<String>());
        graph.put("Tom",  new ArrayList<String>());
    }

    public static void mountSearchQueue() {
        for (String name: graph.get("You")) {
            queue.add(name);
        }
    }

    public static boolean findSeller() {
        int count = 0;
        while (!queue.isEmpty()) {
            String name = queue.peek();
            queue.remove();
            if (!verifiedNames.getOrDefault(name, false)) {
                if (name.endsWith("m")) { // true quando encontrou o destino
                    System.out.println("Steps: " + count);
                    return true;
                }
                List<String> neighbors = graph.get(name);
                for (String neighborName: neighbors) {
                    queue.add(neighborName);
                }
            }
            verifiedNames.put(name, true);
            count++;
        }
        System.out.println("Steps: " + count);
        return false;
    }
}
