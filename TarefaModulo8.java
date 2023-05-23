import java.util.Scanner;

public class TarefaModulo8 {
    
    public static void main(String[] args) {
            
        double media;
    
    
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Digite a nota da avaliação 1: ");
        double n1 = leitor.nextDouble();

        System.out.println("Digite a nota da avaliação 2: ");
        double n2 = leitor.nextDouble();

        System.out.println("Digite a nota da avaliação 3: ");
        double n3 = leitor.nextDouble();

        System.out.println("Digite a nota da avaliação 4: ");
        double n4 = leitor.nextDouble();

        media = (n1+n2+n3+n4)/4;
    
        System.out.println("A média final é " + media);
    }

}
