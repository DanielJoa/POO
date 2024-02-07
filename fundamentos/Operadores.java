package fundamentos;

public class Operadores {
    public static void main(String[] args) {
        System.out.println(2 >=2);
        int x=0;
        x = x + 2; //comum
        x +=2; //abreviado
        //tipos de operadores de atribuição

        //unario
        System.out.println(x++); //soma dps de mostrar
        System.out.println(++x); //soma antes de mostrar

        //binario
        x = 4;
        String texto;

        //terciario
        texto = x == 3 ?    "Valor igual a 3" : 
                            "Valor diferente";
        System.out.println(texto);
    }
}
