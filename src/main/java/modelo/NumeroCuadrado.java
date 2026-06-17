package modelo;

public class NumeroCuadrado {

    private int numero;
    private long cuadrado;

    public NumeroCuadrado() {

    }

    public NumeroCuadrado(int numero, long cuadrado) {
        this.numero = numero;
        this.cuadrado = cuadrado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public long getCuadrado() {
        return cuadrado;
    }

    public void setCuadrado(long cuadrado) {
        this.cuadrado = cuadrado;
    }
}
