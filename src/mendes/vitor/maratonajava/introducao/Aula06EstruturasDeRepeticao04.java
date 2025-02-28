package mendes.vitor.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantos ele pode ser parcelado
        //Condicao é q valor parcela >= 1000

        long valorTotal= 10000;
        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela >= 1000){
                System.out.println(parcela+" Parcela" + " R$: "+valorParcela);
            }else {
                break;
            }
        }
    }
}
