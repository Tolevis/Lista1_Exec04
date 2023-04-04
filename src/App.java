import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Double nota1,nota2,nota3,nota4,media;

        System.out.println("Digite a nota 1");
        nota1 = entrada.nextDouble();
        
        System.out.println("Digite a nota 2");
        nota2 = entrada.nextDouble();
        
        System.out.println("Digite a nota 3");
        nota3 = entrada.nextDouble();
        
        System.out.println("Digite a nota 4");
        nota4 = entrada.nextDouble();
        
        media = (nota1 + nota2 + nota3 + nota4)/4;
        
        System.out.println("Sua media é " + media);
        
        entrada.close();
    }
}
