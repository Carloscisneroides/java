public class asignacios {
    public static void main(String[]args) {

        int a = 6;
        int b = 3;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // asignacion

        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);
        a +=1;
        System.out.println(a);

        a -=1;
        System.out.println(a);

        a *=1;
        System.out.println(a);

        a /=1;
        System.out.println(a);
        a %=1;
        System.out.println(a);
// operadores logico
        System.out.println(a == b);
        System.out.println(a == 0);
        System.out.println(a != b);


        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);

        System.out.println(3>2 && 5 ==2);


        System.out.println(true || true);
        System.out.println(false ||true);
        System.out.println(true || false);

        System.out.println(3>2 || 5 ==2);

        System.out.println(! true);
        System.out.println( !(3>2)|| 5 ==2);

        System.out.println(-b);
        System.out.println(+b);
        System.out.println(b++);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b--);

    }
}
