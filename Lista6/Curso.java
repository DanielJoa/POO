package Lista6;


import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public Curso(int codigo, String nome, int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public Curso() {
    }

    public void inserirAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void removerAluno(int index){
        alunos.remove(index);
    }

    public String imprimirCompleto(){
        String retorno = imprimir() + "\n";
        for (Aluno aluno : alunos) {
            retorno += aluno.imprimir() + "\n";
        } 
        return retorno;
    }

    public String imprimir(){
        return "Codigo: " + codigo + "\nNome: " + nome + "\nCarga Horária: " + cargaHoraria;
    }

}
