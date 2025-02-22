package paquete;

public class Gelatina {
    // Atributos
    String sabor;
    String color;

    // Métodos getter
   public String getcolor() {
       return this.color;
   }
   public String getsabor() {
       return this.sabor;
   }

    // Métodos setter
    public void setcolor(String c) {
        this.color = c;
    }

    public void setsabor(String s) {
        this.sabor = s;
    }

    // Método para obtener la info de la gelatina
    public void mostrarInfo() {
        System.out.println("la información de la gelatina es:");
        System.out.println("Sabor: " + getsabor());
        System.out.println("Color: " + getcolor());
    }
}

