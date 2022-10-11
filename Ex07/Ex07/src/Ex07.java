import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Entre com a medida do lado do quadrado: ");
        int lado = sc.nextInt();
        sc.close();

        int area = lado * lado;

        int dobro = area * 2;

        System.out.println("O dobro da área do quadrado de lado com medida " + lado + " é igual à " + dobro + " . ");
    
    }
}
