public class Animal {
    private String Nome ;
    private String tipo;
    private String porte;


    public void getAnimal(){
        System.out.println("---------------------------------");
        System.out.println("Nome do animal: "+getNome().toUpperCase()+"\n"+ "Tipo do animal: "+getTipo().toUpperCase()+
                "\n"+"Porte do animal: "+getPorte().toUpperCase());

    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        porte.toLowerCase();
        if(!porte.equals("pequeno")&&!porte.equals("medio")&&!porte.equals("grande")){
            System.out.println("A definição de porte está incorreta!\n Unicas entradas para \"Porte\" permitida são: Pequeno, Medio ou Grande\n" +
                    "Porte em estado indefinido é Considerado como Grande ");
            porte = "grande";
        }
        this.porte = porte;


    }
}
