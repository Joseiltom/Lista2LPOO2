package Questao1;

public class Fatorial {

    public int fatorial(int f){
        if (f == 0){
            return 1;
        }else{
            return f*fatorial(f-1);
            
        }
    }
    
}
