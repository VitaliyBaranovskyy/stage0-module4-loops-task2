package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 1;
        int b = 1;
        while (i <= printToInclusive){
            b= b*i;
            System.out.println(b);
            i++;
        }

    }
    
    public static void main (String[] args){
        FactorialNumbers main = new FactorialNumbers();
        main.printFactorialRow(5);
        
    }
}
