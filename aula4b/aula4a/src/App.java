import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("");
        Scanner leitor = new Scanner(System.in);
        System.out.print("informe a 1 nota :");
        float prova = leitor.nextFloat();
        System.out.print("informe a 2 nota :");
        float trabalho = leitor.nextFloat();
        float provaPorcem = (float) (prova * 0.6);
        float trabalhoPorcem = (float) (trabalho * 0.4);
        float operacao = (provaPorcem + trabalhoPorcem) ;
        leitor.close();
        System.out.println(operacao);
        
    
    
    
    
    
    
    }
}
