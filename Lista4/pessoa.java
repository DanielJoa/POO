package Lista4;


public class pessoa {
    private String cpf;
    private String nome;
    private char sexo;
    private int idade;

    public void setCpf (String cpf){
        this.cpf = cpf;
    }
    public String getCpf (){
        return cpf;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public String getNome (){
        return nome;
    }
    public void setIdade (int idade){
        this.idade = idade;
    }
    public int getIdade (){
        return idade;
    }
    public void setSexo (char sexo){
        this.sexo = sexo;
    }
    public char getSexo (){
        return sexo;
    }        
    public String imprimir(){
        return "CPF: " + cpf + "\nNome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade;
    }
}


