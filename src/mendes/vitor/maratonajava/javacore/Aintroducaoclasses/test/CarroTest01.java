package mendes.vitor.maratonajava.javacore.Aintroducaoclasses.test;

import mendes.vitor.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new  Carro ();
        Carro carro2 = new  Carro ();

        carro1.nome = "Astra";
        carro1.modelo = "Chevrolet";
        carro1.ano = 2005;

        carro2.nome = "Corolla";
        carro2.modelo = "Toyota";
        carro2.ano = 2013;

        System.out.println("Carro 1:");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2:");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);



    }

}
