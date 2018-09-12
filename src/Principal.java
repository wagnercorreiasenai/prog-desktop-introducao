
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String idadeTxt;
        int idade;
        
        System.out.println("Informe seu idade:");
        idadeTxt = entrada.next();
        idade  = Integer.parseInt(idadeTxt);
        
        if (idade < 16) {
            System.out.println("Não pode votar");
        } else if ((idade >= 16 && idade < 18) || (idade > 70)) {
            System.out.println("Voto facultativo");
        } else {
            System.out.println("Voto Obrigatório");
        }
        
    }
}
