import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor informe um numero: ");
        int n = teclado.nextInt();
        teclado.close();
        imprimir(n);
    }
    static void imprimir(int n){
        int a, b;

        for(a=1;a<=n;a++){
            for(b=1;b<=a;b++){
            System.out.print(b+"   ");
            }
            System.out.println();
        }
    }
}