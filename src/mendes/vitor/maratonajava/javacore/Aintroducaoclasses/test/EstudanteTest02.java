package mendes.vitor.maratonajava.javacore.Aintroducaoclasses.test;

import mendes.vitor.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante02.nome = "Vitor";
        System.out.println(estudante.nome); //esta inicializando com o nome que eu dei la na classe.
        System.out.println("---------------");
        System.out.println(estudante02.nome); //esta inicializando com o nome q eu alterei agora.

    }
}
