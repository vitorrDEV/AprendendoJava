package mendes.vitor.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Dados os valores de 1 a 7 imprima se é dia ultiu ou final de semana
        //Considerando 1 como domingo

        byte day = 7;
        switch(day){
            case 1:
                System.out.println("Domingo, fim de semana");
                break;
            case 2:
                System.out.println("Segunda, dia utiu");
                break;
            case 3:
                System.out.println("Terça, dia utiu");
                break;
            case 4:
                System.out.println("Quarta, dia utiu");
                break;
            case 5:
                System.out.println("Quinta, dia utiu");
                break;
            case 6:
                System.out.println("Sexta, dia utiu");
                break;
            case 7:
                System.out.println("Sabado, fim de semana");
                break;
            default:
                System.out.println("Dia Inválido");
                break;
        }
    }
}
