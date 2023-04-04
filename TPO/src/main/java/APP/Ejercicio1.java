package APP;


import TDA.ColaDePilas;
import TDA.DynamicStack;
import TDA.PilaDePilas;


public class Ejercicio1 {

    private ColaDePilas cola;
    private int tam;

    public Ejercicio1(ColaDePilas cola){
        this.cola = cola;
    }

    private void invertirCola(){
        PilaDePilas pilaPila = new PilaDePilas();
        this.tam = 0;
        while(!this.cola.isEmpty()){
            pilaPila.add(this.cola.getFirst());
            this.cola.remove();
            this.tam++;
        }
        while(!pilaPila.isEmpty()){
            this.cola.add(pilaPila.getTop());
            pilaPila.remove();
        }
    }

    public void trazarMatriz(){
        invertirCola();
        int suma = 0;
        while (!this.cola.isEmpty()) {
            for (int i = 0; i < tam - 1; i++) {//Desapila
                this.cola.getFirst().remove();
            }
            System.out.println(this.cola.getFirst().getTop());
            suma += this.cola.getFirst().getTop();
            this.cola.remove();
            tam--;
        }
        System.out.println(suma);
    }
}


