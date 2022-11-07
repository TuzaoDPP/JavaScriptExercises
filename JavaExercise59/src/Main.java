import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Aluno Aluno1 = new Aluno();
        Aluno1.nome = "Arthur";
        Aluno1.matricula = 422142366;

        for(int i = 0; i < 3; i++){
            System.out.println("Informe uma nota do aluno " + Aluno1.nome + ": ");
            Aluno1.notas[i] = input.nextInt();
        }
        Aluno1.CalculaSoma(Aluno1.notas);

        System.out.println("A média das notas desse aluno é de: " + Aluno1.CalculaMedia());
    }
}