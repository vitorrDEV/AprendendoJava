package mendes.vitor.maratonajava.javacore.Aintroducaoclasses.test;

import mendes.vitor.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
    }
}
