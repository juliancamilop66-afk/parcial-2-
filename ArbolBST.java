  public class ArbolBST {
    private NodoAnimal raiz;

    public ArbolBST() {
        this.raiz = null;
    }

    // ==================== INSERTAR ====================
    public void insertar(int codigo, String raza, double peso, int edad) {
        NodoAnimal nuevo = new NodoAnimal(codigo, raza, peso, edad);
        raiz = insertarRec(raiz, nuevo);
    }

    private NodoAnimal insertarRec(NodoAnimal nodo, NodoAnimal nuevo) {
        if (nodo == null) {
            return nuevo;
        }
        if (nuevo.getCodigo() < nodo.getCodigo()) {
            nodo.setIzquierdo(insertarRec(nodo.getIzquierdo(), nuevo));
        } else if (nuevo.getCodigo() > nodo.getCodigo()) {
            nodo.setDerecho(insertarRec(nodo.getDerecho(), nuevo));
        }
        return nodo;
    }

    // ==================== BUSCAR Y MODIFICAR (AQUÍ VA TU CÓDIGO)
    // ====================
    public NodoAnimal buscar(int codigo) {
        return buscarRec(raiz, codigo);
    }

    private NodoAnimal buscarRec(NodoAnimal nodo, int codigo) {
        if (nodo == null || nodo.getCodigo() == codigo) {
            return nodo;
        }
        if (codigo < nodo.getCodigo()) {
            return buscarRec(nodo.getIzquierdo(), codigo);
        } else {
            return buscarRec(nodo.getDerecho(), codigo);
        }
    }

    public boolean modificar(int codigo, double nuevoPeso, int nuevaEdad) {
        NodoAnimal nodo = buscar(codigo);
        if (nodo != null) {
            nodo.setPeso(nuevoPeso);
            nodo.setEdad(nuevaEdad);
            return true;
        }
        return false;
    }

    // ==================== RECORRIDO INORDEN ====================
    public void recorrerInorden() {
        inordenRec(raiz);
    }

    private void inordenRec(NodoAnimal n) {
        if (n != null) {
            inordenRec(n.getIzquierdo());
            System.out.println("Código: " + n.getCodigo() +
                    ", Raza: " + n.getRaza() +
                    ", Peso: " + n.getPeso() +
                    ", Edad: " + n.getEdad() + " meses");
            inordenRec(n.getDerecho());
        }
    }
}
