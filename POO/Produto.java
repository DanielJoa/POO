package POO;

public class Produto {
    private String nome;
    private double valor, desconto;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public Produto(String nome, double valor, double desconto) {
        this.nome = nome;
        this.valor = valor;
        this.desconto = desconto;
    }

}
