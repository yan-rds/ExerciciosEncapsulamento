package SettersAndGetters;

public class Pessoa {
    Data nascimento = new Data(12, 7, 1999);
    Data hoje = new Data(21, 9, 2021);
    private String nome;
    private double altura;
    private int idade;

    public Pessoa(String nome, double altura){
        this.nome = nome;
        this.altura = altura;
    }

    public int getIdade(){
        return idade;
    }

    public String getNome(){
        return nome;
    }


    public double getAltura(){
        return altura;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void calcularIdade (int dia, int mes, int ano){
        nascimento.dia = dia;
        nascimento.mes = mes;
        nascimento.ano = ano;

        if (hoje.mes > nascimento.mes & hoje.dia > nascimento.dia){
            idade = hoje.ano - ano;
            System.out.println(idade);

        }
        else if (hoje.mes > nascimento.mes & hoje.dia < nascimento.dia){
            idade = hoje.ano - ano - 1;
            System.out.println(idade);
        }
        else if (hoje.mes < nascimento.mes){
            idade = hoje.ano - ano - 1;
            System.out.println(idade);
        }
        else {
            System.out.println("erro");
        }
    }

    public void mostrarInformacoes(){
        System.out.println(getNome());
        System.out.println(getAltura());
        System.out.println(getIdade());


    }


}
