package TDA;

public class PilaDePilas {

    private NodeStack first;


    public void add(DynamicStack a) {
        this.first = new NodeStack(a, this.first);
    }


    public void remove() {
        if(this.first == null) {
            System.out.println("No se puede desapilar una pila vacia");
            return;
        }
        this.first = this.first.getNext();
    }

    public boolean isEmpty() {
        return this.first == null;
    }


    public DynamicStack getTop() {
        if(this.first == null) {
            System.out.println("No se puede obtener el tope una pila vacia");
            return null;
        }
        return this.first.getValue();
    }
}
