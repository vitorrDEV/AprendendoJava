package mendes.vitor.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int contador = 0;
        while(contador <= 10) {
            System.out.println(++contador);
        }

        do {
            System.out.println("dentro do do-while"+ ++contador);
        } while (contador <= 10);

        for(int i = 0; i < 10; i++){
            System.out.println("For"+ i);
        }

    }
}
