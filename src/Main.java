import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        float b;
        String s;

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese un String");
        s = in.nextLine();
        System.out.println("Usted ingreso el string " + s);

        System.out.println("Ingrese un integrador");
        a = in.nextInt();
        System.out.println("Tu integrador es " + a);

        System.out.println("Ingrese un float");
        b = in.nextFloat();
        System.out.println("Usted ingreso un float  " + b);
    }

}


