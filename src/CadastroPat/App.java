package CadastroPat;

public class App {
    public static void main(String[] args) {

        Responsavel pessoa1 = new Responsavel("DGDark",
                "Pereeira",
                "12345-234",
                "266",
                22,
                "davipereiraneto71@outlook.com",
                "11 948051438"
        );

        Pet pet = new Pet("Luna",
                "cachoro",
                "puldo",
                2,
                "cinza",
                pessoa1,
                Pet.TiposCuiodado.Fisioterapia.toString()
        );

            pessoa1.setNome("DGDarkk");

            System.out.println(pessoa1.retorTodosDados());
            System.out.println("Maior de idade: " +pessoa1.idadeMedia());
            System.out.println(pet.retornardadosPets());


    }

}

