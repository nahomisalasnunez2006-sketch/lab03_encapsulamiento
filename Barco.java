public class Barco extends Vehiculo {
    private int numTripulantes;
    private double tonelajeMaximo;

    public Barco(String marca, String modelo, int anio, double velocidadMax, int numTripulantes, double tonelajeMaximo) {
        super(marca, modelo, anio, velocidadMax);
        setNumTripulantes(numTripulantes);
        setTonelajeMaximo(tonelajeMaximo);
    }

    public int getNumTripulantes() {
        return numTripulantes;
    }

    public double getTonelajeMaximo() {
        return tonelajeMaximo;
    }

    public void setNumTripulantes(int numTripulantes) {
        if (numTripulantes > 0) {
            this.numTripulantes = numTripulantes;
        } else {
            System.out.println("Error: numero de tripulantes no valido");
        }
    }

    public void setTonelajeMaximo(double tonelajeMaximo) {
        if (tonelajeMaximo > 0) {
            this.tonelajeMaximo = tonelajeMaximo;
        } else {
            System.out.println("Error: tonelaje maximo no valido");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nTripulantes: " + numTripulantes + " | Tonelaje Maximo: " + tonelajeMaximo + " ton";
    }
}