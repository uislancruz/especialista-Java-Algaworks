public class Principal {

    public static void main(String[] args) {
        Pessoa eu = new Pessoa();

        eu.nome = "Uislan Cruz ";
        eu.cpf = "111-222-333-44";
        eu.anoNascimento = 1988;

        Pessoa voce= new Pessoa();

        voce.nome = "Thiago Faria";
        voce.cpf = "444-333-222-11";
        voce.anoNascimento = 1981;

        Carro meuCarro = new Carro();

        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR_V";
        meuCarro.proprietario = eu;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.proprietario = voce;


        System.out.println("Meu Carro");
        System.out.println("----------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Proprietario: %s%n", meuCarro.proprietario.nome);
        System.out.println();

        System.out.println("Seu Carro");
        System.out.println("----------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Proprietario: %s%n", seuCarro.proprietario.nome);
        System.out.println();


    }
}
