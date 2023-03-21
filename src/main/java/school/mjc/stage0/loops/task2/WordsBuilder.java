package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase (char... chars) { 
         StringBuilder phrase = new StringBuilder();
        int i = 0;
        while (i < chars.length && chars[i] != 's') {
            phrase.append(chars[i]);
            i++;
        }
        System.out.println(phrase.toString());  
        
    }
    
    public static void main (String [] args){
        WordsBuilder main = new WordsBuilder();
        main.buildPhrase('H','e','l','l','o',' ','l','o','o','p','s');
        
    }
}
