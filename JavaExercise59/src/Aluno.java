public class Aluno {

    public String nome;
    public int matricula;
    public int[] notas = new int[3];

    public int CalculaSoma(int[] notas){
        int soma = 0;

        for(int i = 0; i < 3; i++){
            soma += notas[i];
        }
        return soma;
    }
    public int CalculaMedia(){
        return CalculaSoma(notas) / 3;
    }
}
