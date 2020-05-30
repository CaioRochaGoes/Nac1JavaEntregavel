public class FuncionarLoja {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setNome("Carlinhos");
        animal.setPorte("Falso");
        animal.setTipo("cachorrinho");

        System.out.println(animal.getNome());
        System.out.println(animal.getTipo());
        System.out.println(animal.getPorte());

        animal.getAnimal();


    }
}
