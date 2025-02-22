package paquete;

public class Principal {
    public static void main(String[] args) {
        // Crear un objeto apartir de una clase- Instanciar

        String nom_var = "texto";

        Gelatina g1 = new Gelatina();
        g1.setsabor("fresa");
        g1.setcolor("rojo");

        g1.mostrarInfo();

        Gelatina g2 = new Gelatina();
        g2.setsabor("limón");
        g2.setcolor("verde");

        g2.mostrarInfo();
    }

}
