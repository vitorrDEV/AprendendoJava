package mendes.vitor.maratonajava.javacore.Bintroducaometodos.test;

import mendes.vitor.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros(); //Os metodos são calculados dentro do objeto
        System.out.println("Finalizando CalculadoraTest01");
        calculadora.subtraiDosisNumeros();
    }
}
