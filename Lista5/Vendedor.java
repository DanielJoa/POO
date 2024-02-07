package Lista5;

public class Vendedor {
    private int codigo;
    private String nome;
    private double percentual_comissao;
    public static int qntd_vendedores;

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
    public double getPercentual_comissao() {
        return percentual_comissao;
    }
    public void setPercentual_comissao(double percentual_comissao) {
        this.percentual_comissao = percentual_comissao;
    }
    public Vendedor(){    }
    public Vendedor(int codigo, String nome, double percentual_comissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentual_comissao = percentual_comissao;
    }
    public double calcularpagamentocomissao(double valor_venda){
        return valor_venda * percentual_comissao / 100 ;
    }
    public double CalcularPagamentoComissao(double valor_venda, double desconto){
        return calcularpagamentocomissao(valor_venda) - desconto;
    }
    public String imprimir (double valor_venda, double desconto){
        return "Codigo: " + codigo + "\nNome: "+ nome+ "\nValor da Venda: "+ valor_venda+ "\n% da comissão: "+ percentual_comissao+ 
        "\nDesconto: "+ desconto+ "\nValor a pagar: "+ CalcularPagamentoComissao(valor_venda, desconto);
    }
}
