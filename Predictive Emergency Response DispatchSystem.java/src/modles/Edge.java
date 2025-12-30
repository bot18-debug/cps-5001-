package modles;

import org.w3c.dom.Node;

public class Edge {
    private Node source;
    private Node destination;
    private double weight;

    public Edge(Node source, Node destination, double weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public Node getSource() {
        return source;
    }

    public Node getDestination() {
        return destination;
    }

    public double getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return "Edge{" +
                "source=" + source.getName() +
                ", destination=" + destination.getName() +
                ", weight=" + weight +
                '}';

    
}
}
