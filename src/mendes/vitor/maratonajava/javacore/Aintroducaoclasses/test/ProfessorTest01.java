package mendes.vitor.maratonajava.javacore.Aintroducaoclasses.test;

import mendes.vitor.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Carlos";
        professor.idade = 40;
        professor.sexo = 'M';

        System.out.println("O professor "+professor.nome+ " tem "+professor.idade+ " anos, e é "+professor.sexo);

    }
}
