public class PrePositionResult {
    private final ResponseUnit unit;
    private final Node node;

    public PrePositionResult(ResponseUnit unit, Node node) {
        this.unit = unit;
        this.node = node;
    }

    public ResponseUnit getUnit() {
        return unit;
    }

    public Node getNode() {
        return node;
    }
}
