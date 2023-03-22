package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int i = 0;
        while (i >=0 && i <= lastPrinted){
            System.out.println(i);
            i++;
        }  
    }
    
    public static void main (String [] args){
        NaturalNumbers main =new NaturalNumbers();
        main.naturalNumbersPrinter(15);
    }
}
