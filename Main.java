public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Transporte Multimodal ===");
        
        System.out.println("\n-- Automovil --");
        Automovil auto = new Automovil("Toyota", "Corolla", 2022, 180.0, 4, false);
        System.out.println(auto);
        
        System.out.println();
        auto.setAnio(1800);
        auto.setNumPuertas(10);
        
        System.out.println("\n-- Avion --");
        Avion avion = new Avion("Boeing", "737", 2019, 850.0, 2, 12500.0);
        System.out.println(avion);
        
        System.out.println("\n-- Barco --");
        Barco barco = new Barco("Ferretti", "550", 2020, 45.0, 6, 25.5);
        System.out.println(barco);
    }
}