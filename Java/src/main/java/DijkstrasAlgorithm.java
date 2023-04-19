import java.util.*;

public class DijkstrasAlgorithm {

    static Map<String, Map<String, Double>> graph = new HashMap<String,  Map<String, Double>>();
    static Map<String, Double> graphDistances = new HashMap<String, Double>();

    static Map<String, String> graphParents = new HashMap<String, String>();

    static List<String> processed = new ArrayList<>();

    public static String findLowestCostNode(Map<String, Double> costs) {
        Double lowestCost = Double.POSITIVE_INFINITY;
        String lowestCostnode = null;
        for (Map.Entry<String, Double> cost: costs.entrySet()) {
            if (cost.getValue() < lowestCost && !processed.contains(cost.getKey()) && cost.getKey() != "end") {
                lowestCost = cost.getValue();
                lowestCostnode = cost.getKey();
            }
        }
        return lowestCostnode;
    }

    public static void main(String[] args) {

        // Creating the graph structure.
        // *IMPORTANT* It's necessary to save the neighbor's node and the distance between them.
        // *IMPORTANT* This structure is only for reference, and must NOT be changed.
        graph.put("start", new HashMap<>());
        graph.get("start").put("a", 6.0);  // start is parent of "a" and distance is 6.0
        graph.get("start").put("b", 2.0);  // same.

        graph.put("a", new HashMap<>());
        graph.get("a").put("end", 1.0);

        graph.put("b", new HashMap<>());
        graph.get("b").put("a", 3.0);
        graph.get("b").put("end", 5.0);

        graph.put("end", null);

        // This table will be updated with the minimum distance known to each node.
        graphDistances.put("a", 6.0);
        graphDistances.put("b", 2.0);
        graphDistances.put("end", Double.POSITIVE_INFINITY); // we don't know the distance to "final", so we use infinity.

        // This table will be updated with the new parent of each node.
        graphParents.put("a", "start");
        graphParents.put("b", "start");
        graphParents.put("end", null);

        String lowestCostNode = findLowestCostNode(graphDistances); // It decides which node will be processed by first.
        while (lowestCostNode != null) {
            Double cost = graphDistances.get(lowestCostNode); // it gets the minimum distance known for the node.
            for (Map.Entry<String, Double> neighbor: graph.get(lowestCostNode).entrySet()) { // go through all the neighbors of the node that is being processed.
                Double newDistance = cost + neighbor.getValue();
                // it checks if the distance between processed node and its neighbor is < then the minimum distance known for the neighbor
                if (newDistance < graphDistances.get(neighbor.getKey())) {
                    // saving the new distance and new parent found for the neighbor.
                    graphParents.put(neighbor.getKey(), lowestCostNode);
                    graphDistances.put(neighbor.getKey(), newDistance);
                }
            }
            // once the node is added to "processed", it won't be checked again.
            processed.add(lowestCostNode);
            lowestCostNode = findLowestCostNode(graphDistances);
        }
    }

    public static void printParents() {
        for(Map.Entry<String, String> parent: graphParents.entrySet()) {
            System.out.println(parent.getValue() + " is parent of -> " + parent.getKey());
        }
    }
}
