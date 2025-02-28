package mendes.vitor.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {

        long valorTotal= 10000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                continue;
            }
                System.out.println(parcela+" Parcela" + " R$: "+valorParcela);
        }
    }
}
