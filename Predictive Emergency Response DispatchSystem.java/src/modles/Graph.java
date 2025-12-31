package modles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;  



public class Graph {

    private Map<Node, List<Edge>> adjList; = new HashMap<>(); 
    private Map<String, Node> nodeMap = new HashMap<>();


    public void addNode(Node node) {
        adjacenyList.putIfAbsent(node, new ArrayList<>());
        nodeMap.put(node.getId(), node);
    }

    public void addEdge(Node source, Node destination, double weight) {
        adjacenyList.get(source).add(new Edge(source, destination, weight));
        adjacenyList.get(destination).add(new Edge(destination, source, weight)); // For undirected graph
    }

    public void removeNode(Node node) {
        adjacenyList.values().forEach(edges -> edges.removeIf(edge -> edge.getDestination().equals(node)));
        adjacenyList.remove(node);
        nodeMap.remove(node.getId());
    }

    public Node getNodeById(String id) {
        return nodeMap.get(id);
    }

    public void updateEdgeWeight(Node source, Node destination, double newWeight) {
        removeEdge(source, destination);
        removeEdge(destination, source);
        addEdge(source, destination, newWeight);
    }

    private void removeEdge(Node source, Node destination) {
        List<Edge> edges = adjacenyList.get(source);
        if (edges != null) {
            edges.removeIf(edge -> edge.getDestination().equals(destination));
        }
    }

    public List<Edge> getEdges(Node node) {
        return adjacenyList.get(node);





    
}
