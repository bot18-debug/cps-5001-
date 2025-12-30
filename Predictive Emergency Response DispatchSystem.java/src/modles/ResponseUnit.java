package modles;

public class ResponseUnit {
    private String id;
    private Node location;
    private ResourceType type;
    private boolean available;


    
    public String getId() {
        return id;
    }

    public Node getLocation() {
        return location;
    }

    public void setLocation(Node location) {
        this.location = location;
    }

    public ResourceType getType() {
        return type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "ResponseUnit{" +
                "id='" + id + '\'' +
                ", location=" + location.getName() +
                ", type='" + type + '\'' +
                ", available=" + available +
                '}';
    }




    
    
}
