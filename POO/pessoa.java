package POO;

public class pessoa {
    private String nome;
    private String telefone;
    public int idade;

    public String getNome (){
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public String gettelefone (){
        return telefone;
    }
    public void settelefone (String telefone){
        this.telefone = telefone;
    }
    void perguntaroNome(pessoa pes){
        System.out.println("Qual o seu nome?");
        //System.out.println("Meu nome é " + pes.nome);
        pes.responderonome();
    }
    void responderonome(){
        System.out.println("Meu nome é " + nome);
    }
}
