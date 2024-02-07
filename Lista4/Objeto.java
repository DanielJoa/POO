package Lista4;

public class Objeto {
    private int cracha;
    private String nome;
    private char tipo_vinculo;
    private float valor_hora;
    private float qntd_hora;
    private float salario;
    private float valor_desconto;

    public void setcracha (int cracha){
        this.cracha = cracha;
    }
    public int getcracha(){
        return cracha;
    }
    public void setnome (String nome){
        this.nome = nome;
    }
    public String getnome(){
        return nome;
    }
    public void settipo_vinculo (char tipo_vinculo){
        this.tipo_vinculo = tipo_vinculo;
    }
    public char gettipo_vinculo(){
        return tipo_vinculo;
    }
    public void setvalor_hora (float valor_hora){
        this.valor_hora = valor_hora;
    }
    public float getvalor_hora(){
        return valor_hora;
    }
    public void setqntd_hora (float qntd_hora){
        this.qntd_hora = qntd_hora;
    }
    public float getqntd_hora(){
        return qntd_hora;
    }
    public void setsalario (float salario){
        this.salario = salario;
    }
    public float getsalario(){
        return salario;
    }
    public void setvalor_desconto (float valor_desconto){
        this.valor_desconto = valor_desconto;
    }
    public float getvalor_desconto(){
        return valor_desconto;
    }
    public float calcular_valor_salario(){
        if (tipo_vinculo == 'H'){
            return valor_hora * qntd_hora - valor_desconto;
        }
        else {
            return salario - valor_desconto;
        }
    }
    public String imprimir(){
        if (tipo_vinculo == 'H'){
            return "Cracha: " + cracha + "\nNome: " + nome + "\nTipo de Vínculo: " + tipo_vinculo + "\nSalário: " + valor_hora * qntd_hora + "\nDesconto: " + valor_desconto + "\nValor a receber: " + calcular_valor_salario();
        }
        return "Cracha: " + cracha + "\nNome: " + nome + "\nTipo de Vínculo: " + tipo_vinculo + "\nSalário: " + salario + "\nDesconto: " + valor_desconto + "\nValor a receber: " + calcular_valor_salario();
    }
}
