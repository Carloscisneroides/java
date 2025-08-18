import java.util.Scanner;

class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion; // opción del menú

        do {
            System.out.println("\n======= Calculadora con SWITCH =======");
            System.out.print("Ingrese el primer número: ");
            double num1 = sc.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = sc.nextDouble();

            System.out.println("\nElija la operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Módulo");
            System.out.println("0. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("➡ Resultado de la suma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("➡ Resultado de la resta: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("➡ Resultado de la multiplicación: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("➡ Resultado de la división: " + (num1 / num2));
                    } else {
                        System.out.println(" Error: no se puede dividir entre cero.");
                    }
                    break;
                case 5:
                    System.out.println("➡ Resultado del módulo: " + (num1 % num2));
                    break;
                case 0:
                    System.out.println(" Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println(" Opción inválida.");
            }

        } while (opcion != 0); //  el programa sigue hasta que elija salir

        sc.close();
    }
}
