package Revisao;

public class Aluno {
    private String ra;
    private String nome;

    public Aluno() {
    }

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String imprimir() {
        return "RA: " + ra + "\nNome: " + nome;
    }
}
