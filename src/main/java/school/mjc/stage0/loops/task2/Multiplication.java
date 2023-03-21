package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
       int i = 2;
        int b = 1;
        while ( b <= multiplyByAndToInclusive){
            int c = i*b;
            System.out.println(c);
            b++;
        }  
    }
    
    public static void main (String[] args){
       Multiplication main = new Multiplication();
        main.printMultiplied(5);
        
    }
}
