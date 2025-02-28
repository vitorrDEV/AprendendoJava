package mendes.vitor.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = 10; //variavel semmpre com a primeira letra minuscula
        long numeroGrande= 100000; // cabe muitos nmr
        double salarioDouble = 2000; //nmr decimais
        float salarioFloat = 2500; //nmr decimais
        byte idadeByte = 10; // valor numerico ate 127 ou -128
        short idadeShort = 10; //
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M'; //So cabe uma letra
        String nome = "È um graaaaande texto";


        System.out.println(nome);
        System.out.println("Idade: " + idade);
        System.out.println(verdadeiro);
        System.out.println(caractere);
    }
}
