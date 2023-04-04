package TDA;

public class ColaDePilas{
    private NodeStack first;

    public void add(DynamicStack pila) {
        NodeStack node = new NodeStack(pila, null);
        if(this.first == null) {
            this.first = node;
            return;
        }
        NodeStack candidate = this.first;
        while(candidate.getNext() != null) {
            candidate = candidate.getNext();
        }
        candidate.setNext(node);
    }

    public void remove() {
        if(this.first == null) {
            System.out.println("No se puede desacolar una cola vacia");
            return;
        }
        this.first = this.first.getNext();

    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public DynamicStack getFirst() {
        if(this.first == null) {
            System.out.println("No se puede obtener el primero una cola vacia");
            return null;
        }
        return this.first.getValue();
    }
}
