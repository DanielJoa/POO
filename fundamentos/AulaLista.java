package fundamentos;

import java.util.ArrayList;
//import java.util.List;

import POO.Fornecedor;
import POO.Produto;
//import POO.pessoa;

public class AulaLista {
    public static void main(String[] args) {
        //Array
        /* 
        int [] numeros = new int [3];
        numeros [0] = 10;
        numeros [1] = 5;
        numeros [2] = 7;
        System.out.println(numeros[1]);
        numeros[0] = 11;
        for (int i = 0; i < numeros.length; i++){
            System.out.println("For ----> " + numeros[i]);
        }
        for (int numero : numeros) {
            System.out.println("Foreach ---> " + numero);
        }
        int numeroChefe = 6;
        int[] numeros2 = new int[4];
        for (int i = 0; i < 3; i++){
            numeros2[i] = numeros[i];
        }
        numeros2[3] = numeroChefe;

        pessoa[] pessoas = new pessoa [100];
        pessoa p = new pessoa();
        p.setNome("Daniel");
        pessoas[0] = p; 
        */
        /*
        List<String> nomes = new ArrayList<>(); //ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Edson");
        nomes.add("Daniel");
        nomes.add("Thiago");
        nomes.add("Igor");
        nomes.add("Brian"); // add = adiciona objetos 
        System.out.println(nomes);
        nomes.add(2, "Vinicius"); // adiciona na posição o objeto
        System.out.println(nomes);
        if (nomes.contains("Vinicius")){ //verifica se tem o objeto
            System.out.println("Tem Vinicius na lista");
        }
        System.out.println("Posição 2: " + nomes.get(1)); //get - retorna o objeto na posição desejada
        System.out.println("O Vinicius esta na posição : " + nomes.indexOf("Vinicius")); // retorna a posição do objeto desejado

        nomes.remove("Vinicius");
        System.out.println(nomes);
        nomes.set(4, "Maria"); //troca o objeto do indice desejado
        System.out.println(nomes);
        for (int i = 0; i < nomes.size(); i++){
            System.out.println("For: " + nomes.get(i));
}
        for (String nome : nomes) {
            System.out.println("Foreach --> " + nome);
}
        nomes.clear();
        System.out.println(nomes);
        */
        Fornecedor f1 = new Fornecedor();
        f1.setNome("Bic");
        Produto p1 = new Produto("Caneta", 2, 0);
        //f1.produtos.add(p1);
        f1.setProduto(p1);
        Produto p2 = new Produto("Lapis", 5, 0);
        //f1.produtos.add(p2);
        f1.setProduto(p2);
        for (Produto produto : f1.getProdutos()) {
            System.out.println(produto.getNome() + " " + produto.getValor());
        }
        Fornecedor f2 = new Fornecedor();
        f2.setNome("HP");
        Produto p3 = new Produto("Notebook", 5300, 0);
        //f2.produtos.add(p3);
        f2.setProduto(p3);
        ArrayList<Fornecedor> fornecedores = new ArrayList<>();
        fornecedores.add(f1);
        fornecedores.add(f2);
        for (Fornecedor forn : fornecedores) {
            System.out.println("Fornecedor: " + forn.getNome());
            for (Produto p : forn.getProdutos()) {
                System.out.println("Produto: " + p.getNome());
            }
        }
        
    }
}
