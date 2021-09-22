package SettersAndGetters;

public class ControleRemoto {
    Televisao tv;

    public ControleRemoto(Televisao tv){
    this.tv = tv;
    }

    public void aumentarVolume(){
        tv.volume++;

    }

    public void diminuirVolume(){
        tv.volume --;
    }

    public void subirCanal(){
        tv.canais ++;
    }

    public void descerCanal(){
        tv.canais --;
    }



}
