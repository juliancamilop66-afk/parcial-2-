public class NodoAnimal {
    private int codigo;
    private String raza;
    private double peso;
    private int edad;
    private NodoAnimal izquierdo;
    private NodoAnimal derecho;

    public NodoAnimal(int codigo, String raza, double peso, int edad) {
        this.codigo = codigo;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
        this.izquierdo = null;
        this.derecho = null;
    }

    // Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public NodoAnimal getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoAnimal izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoAnimal getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoAnimal derecho) {
        this.derecho = derecho;
    }
}
