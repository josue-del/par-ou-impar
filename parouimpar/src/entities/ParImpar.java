package entities;

/**
 * @author josue
 * A classe ParImpar era fazer o processo de calculo
 */
public class ParImpar {
    public int numero;
    
    public int verifica(){
        if(numero % 2 == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
}
