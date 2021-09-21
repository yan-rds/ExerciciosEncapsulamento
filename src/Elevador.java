public class Elevador {
    private int andarAtual = 0;
    private int totalAndares;
    private int capacidade = 15;
    private int pessoasNele = 0;

    public Elevador (int totalAndares){
        this.totalAndares = totalAndares;
    }

    public int getAndarAtual(){
        return andarAtual;
    }

    public int getTotalAndares(){
        return totalAndares;
    }

    public int getCapacidade(){
        return capacidade;
    }

    public int getPessoasNele(){
        return pessoasNele;
    }

    public void setAndarAtual(int andarAtual){
        this.andarAtual = andarAtual;
    }

    public void setTotalAndares(int totalAndares){
        this.totalAndares = totalAndares;
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public void setPessoasNele(int pessoasNele){
        this.pessoasNele = pessoasNele;
    }

    public void entra (int pessoasEntrando){
        if (pessoasNele + pessoasEntrando <= capacidade) {
            pessoasNele = pessoasNele + pessoasEntrando;
        }
        else {
            System.out.println("não cabe");
        }
    }
    public void sai (int pessoasSaindo){
        if (pessoasNele < pessoasSaindo){
            System.out.println("Não tem gente suficiente");
        }
        else {
            pessoasNele = pessoasNele - pessoasSaindo;
        }
    }
    public void sobe(){
        if (andarAtual < totalAndares){
            andarAtual++;
        }
        else{
            System.out.println("Já tá no ultimo");
        }
    }
    public void desce(){
        if (andarAtual > 0){
            andarAtual--;
        }
        else {
            System.out.println("Já tá no térreo");
        }
    }
}
