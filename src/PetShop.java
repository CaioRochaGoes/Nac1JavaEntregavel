
public class PetShop{

    private int examinarAnimal;
    private int darBanhoAnimal;
    private int vacinarAnimal;
    private int totalApagar;

    Animal animal = new Animal();

    public int getExaminarAnimal() {
        System.out.println("valor exame animal: "+examinarAnimal);
        return examinarAnimal;
    }

    public void setExaminarAnimal() {
        setTotalApagar(70);
        this.examinarAnimal = 70;
    }

    public int getDarBanhoAnimal() {
        System.out.println("Valor do banho: "+darBanhoAnimal);
        return darBanhoAnimal;
    }

    public void setDarBanhoAnimal(Animal animal) {
        if (animal.getPorte().equals("pequeno")){
            setTotalApagar(40);
            this.darBanhoAnimal = 40;
        }else {
            if (animal.getPorte().equals("medio")){
                setTotalApagar(50);
                this.darBanhoAnimal = 50;
            }
            else {
                if (animal.getPorte().equals("grande")){
                    setTotalApagar(60);
                    this.darBanhoAnimal = 60;
                }
            }
        }


    }

    public int getVacinarAnimal() {
        System.out.println("valor da vacinação: "+ vacinarAnimal);
        return vacinarAnimal;
    }

    public void setVacinarAnimal(Animal animal) {
        if ((animal.getTipo().equals("cachorro"))||(animal.getTipo().equals("gato"))){
            setTotalApagar(100);
            this.vacinarAnimal = 100;

        }else {
            setTotalApagar(150);
            this.vacinarAnimal = 150;
        }



    }

    public int getTotalApagar() {
        System.out.println("Total a Pagar: "+totalApagar);
        return totalApagar;
    }

    public void setTotalApagar(int totalApagar) {
        this.totalApagar = totalApagar + this.totalApagar;
    }
}