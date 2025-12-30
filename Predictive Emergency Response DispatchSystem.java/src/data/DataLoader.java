package data;
// neeed to add imports 
import java.util.List;
import java.util.ArrayList;
import modles.ResponseUnit;

public class DataLoader {
    public static void initializeGraph(Graph graph, List<ResponseUnit> units) {
        Node london = new Node("london", "London", 100, 100);
        Node paris = new Node("paris", "Paris", 300, 300);
        Node newYork = new Node("newyork", "New York", 500, 200);

        graph.addNode(london);
        graph.addNode(paris);
        graph.addNode(newYork);

        graph.addEdge(london, paris, 2.5);
        graph.addEdge(paris, newYork, 8);
        graph.addEdge(london, newYork, 10);

        units.add(new ResponseUnit("unit1", london, ResourceType.AMBULANCE));
        units.add(new ResponseUnit("unit2", paris, ResourceType.FIRE_TRUCK));
        units.add(new ResponseUnit("unit3", newYork, ResourceType.POLICE_CAR));
        units.add(new ResponseUnit("unit4", london, ResourceType.AMBULANCE));
    }
    
}
