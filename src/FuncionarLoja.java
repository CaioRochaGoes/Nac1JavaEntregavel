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
        System.out.println("---------");
        animal.getAnimal();
        System.out.println("---------");
        animal2.setNome("bixano");
        animal2.setPorte("grande");
        animal2.setTipo("gato");
        System.out.println("---------");
        animal2.getAnimal();
        System.out.println("---------");
        animal3.setNome("jujuzinha");
        animal3.setPorte("medio");
        animal3.setTipo("pata");
        System.out.println("---------");
        animal3.getAnimal();
        System.out.println("---------");
        animal4.setNome("Zeus");
        animal4.setPorte("Grande");
        animal4.setTipo("cachorro");
        System.out.println("---------");
        animal4.getAnimal();
        System.out.println("---------");
        animal5.setNome("Dandara");
        animal5.setPorte("medio");
        animal5.setTipo("gato");
        System.out.println("---------");
        animal5.getAnimal();
        System.out.println("---------");


        PetShop lojaPetShop = new PetShop();
        lojaPetShop.setExaminarAnimal();
        lojaPetShop.setVacinarAnimal(animal);
        lojaPetShop.setDarBanhoAnimal(animal);
        lojaPetShop.getVacinarAnimal();
        lojaPetShop.getExaminarAnimal();
        lojaPetShop.getDarBanhoAnimal();

        lojaPetShop.setVacinarAnimal(animal2);
        lojaPetShop.setDarBanhoAnimal(animal2);
        lojaPetShop.setVacinarAnimal(animal3);
        lojaPetShop.setDarBanhoAnimal(animal3);
        lojaPetShop.setVacinarAnimal(animal4);
        lojaPetShop.setDarBanhoAnimal(animal4);
        lojaPetShop.setVacinarAnimal(animal5);
        lojaPetShop.setDarBanhoAnimal(animal5);
        lojaPetShop.getTotalApagar();

    }
}
