package modles;

import org.w3c.dom.Node;

public class Incident {
     private String id;
    private Node location;
    private int severity;
    private ResourceType type;
    private long creationTime;
    private long resolutionTime;

    public Incident(String id, Node location, int severity, ResourceType type) {
        this.id = id;
        this.location = location;
        this.severity = severity;
        this.type = type;
        this.creationTime = System.currentTimeMillis();
    }


    public long getCreationTime() {
        return creationTime;
    }

    public void setResolutionTime(long resolutionTime) {
        this.resolutionTime = resolutionTime;
    }

    public long getResponseTime() {
        return resolutionTime - creationTime;
    }

    public String getId() {
        return id;
    }

    public Node getLocation() {
        return location;
    }

    public int getSeverity() {
        return severity;
    }

    public ResourceType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Incident{" +
                "id='" + id + '\'' +
                ", location=" + location.getName() +
                ", severity=" + severity +
                ", type='" + type + '\'' +
                '}';
    }





    
}
