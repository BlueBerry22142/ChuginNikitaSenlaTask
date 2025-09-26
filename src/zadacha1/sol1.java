package zadacha1;

import javax.swing.text.html.ListView;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.lang.Character;

public class sol1 {
    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
    public static void main() {
        final String[] DICTIONARY= {"БУКВА", "ТАБУРЕТ", "ЧАШКА", "ПРИШЕЛЕЦ", "СТУДЕНТ"};

        final byte START_LIVES_COUNT=6;

        System.out.print("ИГРА НАЧАЛАСЬ. ВВОДИТЕ КИРИЛЛИЧЕСКИЕ БУКВЫ ВЕРХНЕГО ИЛИ НИЖНЕГО РЕГИСТРА. КОЛИЧЕСТВО ЖИЗНЕЙ: "+ START_LIVES_COUNT+"\n");
        HashSet<Character> guessedLetters= new HashSet<Character>();
        String word = getRandom(DICTIONARY);
        //System.out.println(word);
        Scanner myScanner = new Scanner(System.in);
        int lives=(int)START_LIVES_COUNT;
        for (int i = 0; i<word.length();i++){
                System.out.print("_");
            }
        while (lives>0){
            char guess= (myScanner.nextLine().toUpperCase().charAt(0));

            if (word.indexOf(guess)==-1){
                lives--;
                System.out.print("НЕВЕРНО. ВЫ ПОТЕРЯЛИ ОДНУ ЖИЗНЬ. ТЕКУЩЕЕ КОЛИЧЕСТВО ЖИЗНЕЙ: " + lives + "\n");
            }
            else{
                System.out.print("ВЕРНО. ТЕКУЩЕЕ КОЛИЧЕСТВО ЖИЗНЕЙ: " + lives + "\n");
                guessedLetters.add(guess);
            }
            for (int i = 0; i<word.length();i++){
                if ( guessedLetters.contains(word.charAt(i)) ){
                    System.out.print(word.charAt(i));
                }
                else{
                    System.out.print("_");
                }

            }
            System.out.print("\n");
            boolean winFlag=true;
            for (int i = 0; i<word.length();i++){
                if (guessedLetters.contains(word.charAt(i))){}
                else{
                    winFlag=false;
                }
            }
            if (winFlag){
                System.out.println("ПОБЕДА. ИГРА ОКОНЧЕНА. ЗАГАДАННОЕ СЛОВО: " + word + " ОСТАВШИЕСЯ ЖИЗНИ: " + lives);
                return;
            }
        }
        System.out.print("ПОРАЖЕНИЕ. ЗАГАДАННОЕ СЛОВО: "+word);

    }


}
