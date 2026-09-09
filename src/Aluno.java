import java.util.ArrayList;

public class Aluno {
    String nome;
    Integer idade;

    ArrayList media = new ArrayList();
    ArrayList<Prova> provas;

    public Aluno(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }


    public Double calcularMedia() {
        Double valorTotal = 0.0;
        for (Prova p : provas) {
           valorTotal += p.nota;
        }
        Double media = valorTotal / provas.size();
        return media;
    }
}
