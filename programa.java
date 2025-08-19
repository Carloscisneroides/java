import java.sql.SQLOutput;
import java.util.Scanner;

public class programa {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero a calcular ");
        int n = sc.nextInt();

        int a = 10;
        int b = 5;
        int suma = 0;

        for (int i = 0; i < n; i++){
            int termino = a + i *b;
            suma += termino;
            System.out.println(termino + ( i< n -1 ? "+": ""));
        }
        System.out.println("=" + suma);
    }
}
