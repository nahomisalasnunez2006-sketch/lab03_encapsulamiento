public class Automovil extends Vehiculo {
    private int numPuertas;
    private boolean esElectrico;

    public Automovil(String marca, String modelo, int anio, double velocidadMax, int numPuertas, boolean esElectrico) {
        super(marca, modelo, anio, velocidadMax);
        setNumPuertas(numPuertas);
        this.esElectrico = esElectrico;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public boolean isElectrico() {
        return esElectrico;
    }

    public void setNumPuertas(int n) {
        if (n >= 2 && n <= 6) {
            this.numPuertas = n;
        } else {
            System.out.println("Error: numero de puertas no valido");
        }
    }

    @Override
    public String toString() {
        String electricoStr = esElectrico ? "Si" : "No";
        return super.toString() + "\nPuertas: " + numPuertas + " | Electrico: " + electricoStr;
    }
}