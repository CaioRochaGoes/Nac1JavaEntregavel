public class FuncionarLoja {
    public static void main(String[] args) {
        Animal animal = new Animal();
        PetShop lojaPetShop = new PetShop();
        animal.setNome("Carlinhos");
        animal.setPorte("pequeno");
        animal.setTipo("cachorro");

        animal.getAnimal();

        lojaPetShop.setExaminarAnimal(70);
        lojaPetShop.setVacinarAnimal(animal);
        lojaPetShop.getVacinarAnimal();


        lojaPetShop.getTotalApagar();
    }
}
