package mendes.vitor.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+ - / *
        int numero01 = 10;
        int numero02 =20;
        System.out.println(numero01 + numero02);

        //%
        int resto = 20 % 2;
        System.out.println(resto);

        //< > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);

        //&& -> (AND) || -> (or) ! -> (NOT)
        int idade = 20;
        float salario = 3500f;
        boolean verifica = idade >= 18 && salario >= 2500;
        System.out.println(verifica);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPolpanca = 10000;
        float valorPlaystation = 5000;

        boolean isPlaystation5Compravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPolpanca > valorPlaystation;
        System.out.println(isPlaystation5Compravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; //
        System.out.println(bonus);

        //++ --
        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);

    }
}
