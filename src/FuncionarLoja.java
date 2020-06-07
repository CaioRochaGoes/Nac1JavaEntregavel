public class FuncionarLoja {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        Animal animal4 = new Animal();
        Animal animal5 = new Animal();

        animal.setNome("Carlinhos");
        animal.setPorte("pequeno");
        animal.setTipo("cachorro");



        animal2.setNome("bixano");
        animal2.setPorte("grande");
        animal2.setTipo("gato");
        animal2.getAnimal();

        animal3.setNome("jujuzinha");
        animal3.setPorte("medio");
        animal3.setTipo("pata");
        animal3.getAnimal();

        animal4.setNome("Zeus");
        animal4.setPorte("Grande");
        animal4.setTipo("cachorro");
        animal4.getAnimal();

        animal5.setNome("Dandara");
        animal5.setPorte("medio");
        animal5.setTipo("gato");
        animal5.getAnimal();



        PetShop lojaPetShop = new PetShop();
        lojaPetShop.setExaminarAnimal();
        lojaPetShop.setVacinarAnimal(animal);
        lojaPetShop.setDarBanhoAnimal(animal);
        animal.getAnimal();
        lojaPetShop.extrato();

        lojaPetShop.setVacinarAnimal(animal2);
        lojaPetShop.setDarBanhoAnimal(animal2);
        animal2.getAnimal();
        lojaPetShop.extrato();

        lojaPetShop.setVacinarAnimal(animal3);
        lojaPetShop.setDarBanhoAnimal(animal3);
        animal3.getAnimal();
        lojaPetShop.extrato();

        lojaPetShop.setVacinarAnimal(animal4);
        lojaPetShop.setDarBanhoAnimal(animal4);
        animal4.getAnimal();
        lojaPetShop.extrato();

        lojaPetShop.setVacinarAnimal(animal5);
        lojaPetShop.setDarBanhoAnimal(animal5);
        animal5.getAnimal();
        lojaPetShop.extrato();

        lojaPetShop.getTotalApagar();

    }
}
