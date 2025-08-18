public class ejerciciosunarios {
    public static void main(String[]args){
        int a = 10;
        int b = 3;

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        // 2. Crea una variable para cada tipo de operación de asignación
        int x = 10;
        x += 5; // suma y asigna
        int y = 20;
        y -= 3; // resta y asigna
        int z = 4;
        z *= 2; // multiplica y asigna
        int w = 40;
        w /= 5; // divide y asigna
        int r = 17;
        r %= 3; // módulo y asigna

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println("w: " + w);
        System.out.println("r: " + r);


        // 3. Imprime 3 comparaciones verdaderas
        System.out.println("a > b: " + (a > b));
        System.out.println("a != b: " + (a != b));
        System.out.println("b < a: " + (b < a));

        // 4. Imprime 3 comparaciones falsas
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("b > a: " + (b > a));

        // 5. Utiliza el operador lógico AND
        boolean andResult = (a > b) && (b < a);
        System.out.println("AND: " + andResult);

        // 6. Utiliza el operador lógico OR
        boolean orResult = (a < b) || (a > b);
        System.out.println("OR: " + orResult);

        // 7. Combina ambos operadores lógicos
        boolean combo = (a > b) && (a == 10) || (b == 100);
        System.out.println("Combinado: " + combo);

        // 8. Añade alguna negación
        boolean negacion = !(a < b);
        System.out.println("Negación: " + negacion);
    }
}
