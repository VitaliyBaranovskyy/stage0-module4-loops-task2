package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 2;
        int a = 0;
        int c = 1;
        
        while ( a<=power){
         c = c*i;
            System.out.println(i + "в ступені " + a + " = " + c);
            a++;
        }

    }
    
    public static void main (String [] args){
       PowerOfTwo main =new PowerOfTwo();
        main.printPower(8);
    }
}
