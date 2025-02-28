package mendes.vitor.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima todos os numeros pares de 0 ate 1000000

        int contador = 0;
        for (contador = 0; contador <= 1000000; contador ++){
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
        }
    }
}
