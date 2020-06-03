
public class PetShop{

    private int examinarAnimal;
    private int darBanhoAnimal;
    private int vacinarAnimal;
    private int totalApagar;

    Animal animal = new Animal();

    public int getExaminarAnimal() {
        System.out.println(examinarAnimal);
        return examinarAnimal;
    }

    public void setExaminarAnimal(int examinarAnimal) {

        totalApagar = examinarAnimal + totalApagar;
        this.examinarAnimal = examinarAnimal;
    }

    public int getDarBanhoAnimal() {

        return darBanhoAnimal;
    }

    public void setDarBanhoAnimal(int darBanhoAnimal) {
        this.darBanhoAnimal = darBanhoAnimal;
    }

    public int getVacinarAnimal() {
        System.out.println("valor da vacinação: "+ vacinarAnimal);
        return vacinarAnimal;
    }

    public void setVacinarAnimal(Animal animal) {
        if ((animal.getTipo().equals("cachorro"))||(animal.getTipo().equals("gato"))){
            this.vacinarAnimal = 100;
        }
        this.vacinarAnimal = 150;


    }

    public int getTotalApagar() {
        System.out.println("Total a Pagar: "+totalApagar);
        return totalApagar;
    }

    public void setTotalApagar(int totalApagar) {
        this.totalApagar = totalApagar;
    }
}