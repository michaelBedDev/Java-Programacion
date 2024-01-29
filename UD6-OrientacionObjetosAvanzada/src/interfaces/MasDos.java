package interfaces;

public class MasDos implements Serie{
    int inicio;
    int val;
    
    MasDos(){
        inicio=0;
        val=0;
    }
    public int obtenerSiguiente(){
        val +=2;
        return val;
    }
    public void restablecer(){
        inicio=0;
        val=0;
    }
    public void establecerInicio(int x){
        inicio=x;
        val=x;
    }
}

