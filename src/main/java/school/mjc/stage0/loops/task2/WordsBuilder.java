package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char ch1, char ch2, char ch3, char ch4, char ch5, char ch6, char ch7, char ch8, char ch9, char ch10) {
        
        System.out.println(ch1+ "" + ch2+""+ch3+""+ch4+""+ch5+" "+ch6+""+ch7+""+ch8+""+ch9+""+ch10);

    }
    
    public static void main (String [] args){
        WordsBuilder main = new WordsBuilder();
        main.buildPhrase('H','e','l','l','o','l','o','o','p','s');
        
    }
}
