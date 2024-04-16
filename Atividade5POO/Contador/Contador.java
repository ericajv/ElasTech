package Contador;

public class Contador {
    private int item;

    public Contador(int item) {
        this.item = item;
    }
    public void setItem(int item) {
        this.item = item;
    }

    public int getItem() {
        return item;
    }
    public void zerar(){
        this.item = 0;
    }
    public void incrementar(){
        this.item++;
    }
}
