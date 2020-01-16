package CadastroPat;

public class App {
    public static void main(String[] args) {
        Responsavel pessoa1 = new Responsavel("DGDark",
                "Pereeira",
                "12345-234",
                "266",
                16,
                "davipereiraneto71@outlook.com",
                "11 948051438");

        Pet pet = new Pet("Luna",
                "cachoro",
                "puldo",
                2,
                "cinza",
                pessoa1,
                "Banho e tosa");

            System.out.println(pet.dono.nome);

    }
}
