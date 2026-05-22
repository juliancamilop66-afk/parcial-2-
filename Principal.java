import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArbolBST inventario = new ArbolBST();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===========================================");
            System.out.println("GanaderosCasanare S.A.S. -- Inventario BST");
            System.out.println("===========================================");
            System.out.println("1. Insertar un nuevo animal");
            System.out.println("2. Modificar datos de un animal existente");
            System.out.println("3. Consultar datos de un animal (por código)");
            System.out.println("4. Listar inventario completo (recorrido inorden)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Código: ");
                    int cod = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Raza: ");
                    String raza = sc.nextLine();
                    System.out.print("Peso (kg): ");
                    double peso = sc.nextDouble();
                    System.out.print("Edad (meses): ");
                    int edad = sc.nextInt();
                    inventario.insertar(cod, raza, peso, edad);
                    System.out.println("Animal insertado.");
                    break;
                case 2:
                    System.out.print("Código a modificar: ");
                    int codMod = sc.nextInt();
                    System.out.print("Nuevo peso: ");
                    double nuevoPeso = sc.nextDouble();
                    System.out.print("Nueva edad: ");
                    int nuevaEdad = sc.nextInt();
                    if (inventario.modificar(codMod, nuevoPeso, nuevaEdad)) {
                        System.out.println("Datos actualizados.");
                    } else {
                        System.out.println("Código no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Código a consultar: ");
                    int codBus = sc.nextInt();
                    NodoAnimal encontrado = inventario.buscar(codBus);
                    if (encontrado != null) {
                        System.out.println("Raza: " + encontrado.getRaza() +
                                ", Peso: " + encontrado.getPeso() +
                                ", Edad: " + encontrado.getEdad());
                    } else {
                        System.out.println("No existe ese código.");
                    }
                    break;
                case 4:
                    inventario.recorrerInorden();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
        sc.close();
    }
}
