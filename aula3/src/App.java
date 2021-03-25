import java.util.Scanner;
//import java.math.MathContext;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);// abertura do leitor
        System.out.print("Digite um número :");
        float numero1 = leitor.nextInt();// primeiro numero
        System.out.print("Digite outro : ");
        float numero2 = leitor.nextInt();//segundo numero
        float soma = numero1 + numero2;// operação de adição 
        System.out.println(soma);
        leitor.close();// fechamento do leitor 
    }
}
