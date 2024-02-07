package Lista5;

public class Apolice {
    private int numero;
    private int idade;
    private String nome;
    private char sexo;
    private double valor_automovel;    
    public Apolice(){    }
    public Apolice(int numero, String nome, int idade, char sexo, double valor_automovel){
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valor_automovel = valor_automovel;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public double getValor_automovel() {
        return valor_automovel;
    }
    public void setValor_automovel(double valor_automovel) {
        this.valor_automovel = valor_automovel;
    }
    public double calcularValor(){
        if (sexo == 'M' && idade <= 25){
            return valor_automovel * 10/100;
        }
        if (sexo == 'M' && idade > 25){
            return valor_automovel * 5/100;
        }
        if (sexo == 'F'){
            return valor_automovel * 2/100;
        }
        else {
            return 0;
        }
    }
    public String imprimir(){
        return "Número: "+ numero + "\nNome: "+ nome + "\nIdade: "+ idade + "\nSexo: "+ sexo 
        + "\nValor do Automóvel: "+ valor_automovel + "\nValor Apolice: "+ calcularValor(); 
    }
}
