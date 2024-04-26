import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int[] Array = new int[10];
        Scanner scanner = new Scanner(System.in);
        int valor = -1;

        try {
            int indice = 0;
            while (valor != 0) {
                System.out.print("Digite um valor inteiro (0 para sair): ");
                valor = scanner.nextInt();
                
                if (valor == 0) {
                    Array[indice] = valor;
                    break; 
                }
                
                Array[indice] = valor;
                indice++;
            }

            System.out.println("Elementos do Array:");
            for (int i = 0; i < indice; i++) {
                System.out.println(Array[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor informado não é numérico.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Você tentou inserir mais que 10 valores.");
        } finally {
            scanner.close();
        }
    }
}
