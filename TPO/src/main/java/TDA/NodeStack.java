package TDA;

public class NodeStack {

    private DynamicStack value;
    private NodeStack next;

    public NodeStack(DynamicStack value, NodeStack next) {
        this.value = value;
        this.next = next;
    }

    public DynamicStack getValue() {
        return value;
    }

    public void setValue(DynamicStack value) {
        this.value = value;
    }

    public NodeStack getNext() {
        return next;
    }

    public void setNext(NodeStack next) {
        this.next = next;
    }
}
