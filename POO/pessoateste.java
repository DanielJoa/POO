package POO;

public class pessoateste {
    public static void main(String[] args) {
        pessoa p1 = new pessoa();
        //p1.nome = "Daniel";
        p1.setNome("Daniel");
        //p1.telefone = "15991209166";
        p1.settelefone("15991209166");
        p1.idade = 20;

        pessoa p2 = new pessoa();
        p2.setNome("Thi");
        //p2.nome = "Thi"; deixa de funcionar por ser informação privada
        //p1.perguntaroNome(p2);
        //p2.responderonome();
    }
}
