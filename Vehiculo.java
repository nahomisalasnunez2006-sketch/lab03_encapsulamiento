public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    protected double velocidadMax;

    public Vehiculo(String marca, String modelo, int anio, double velocidadMax) {
        this.marca = marca;
        this.modelo = modelo;
        setAnio(anio);
        setVelocidadMax(velocidadMax);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setAnio(int anio) {
        if (anio >= 1885 && anio <= 2100) {
            this.anio = anio;
        } else {
            System.out.println("Error: ano no valido");
        }
    }

    public void setVelocidadMax(double vel) {
        if (vel > 0) {
            this.velocidadMax = vel;
        } else {
            System.out.println("Error: velocidad no valida");
        }
    }

    public void describir() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Anio: " + anio + " | Vel. Max: " + velocidadMax + " km/h");
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " | Modelo: " + modelo + " | Anio: " + anio + " | Vel. Max: " + velocidadMax + " km/h";
    }
}
