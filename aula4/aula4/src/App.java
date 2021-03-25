import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("informe o valor da gasolina  :");
        double gasolina = leitor.nextFloat();
        System.out.print("informe a % de aumento da gasolina :");
        double porcemtagem = leitor.nextFloat();
        double calculo = gasolina*(porcemtagem/100);
        leitor.close();
        System.out.println(calculo);
        
        
        
        
        
        
        
    }
}
