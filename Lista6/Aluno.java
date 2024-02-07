package Lista6;

public class Aluno {
    private String RA;
    private String Nome;

    public String getRA() {
        return RA;
    }
    public void setRA(String RA) {
        this.RA = RA;
    }
    public String getNome() {
        return Nome;
    }
    public void setName(String Nome) {
        this.Nome = Nome;
    }
    public Aluno(String RA, String Nome) {
        this.RA = RA;
        this.Nome = Nome;
    }
    public Aluno() {
    }
    public String imprimir(){
        return "RA: " + RA + "\nNome: " + Nome;
    }
    
}
