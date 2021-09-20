public class Elevador {
    int andarAtual = 0;
    int totalAndares;
    int capacidade = 15;
    int pessoasNele = 0;

    public Elevador (int totalAndares){
        this.totalAndares = totalAndares;
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
