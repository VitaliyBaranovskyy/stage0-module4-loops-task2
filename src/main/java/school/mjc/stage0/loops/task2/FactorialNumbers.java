package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
       int i = 0;
        int b = 1;
        while (i >= 0 & i <= printToInclusive){
            
            System.out.println(b);
            b*=(i+1);
            i++;
        }

    }
    
    public static void main (String[] args){
        FactorialNumbers main = new FactorialNumbers();
        main.printFactorialRow(5);
        
    }
}
