import java.util.Scanner;

public class suma {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero ");
        int num1 = sc.nextInt();

        int suma = 0;
        for (int i = 1; i <= num1; i++){
            if (num1 % i == 0){
                suma += i;
            }
        }
        System.out.println("la suma de los divisores " + num1  +  " es :" + suma);
    }
}
