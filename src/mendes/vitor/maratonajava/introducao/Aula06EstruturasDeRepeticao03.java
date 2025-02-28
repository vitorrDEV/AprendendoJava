package mendes.vitor.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //Imprima os primeiros 25 nmrs de um dado valor.

        int valorMaximo = 50;
        for (int i = 0; i <= valorMaximo; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
