package Day5.task1;

//Napisz program, ktory bedzie liczyl liczbe wystapien okreslonych znakow w slowie.
//        Przykladowa sygnatura public int countOccurrencesLettersInWord(String word, char[] letters)
//        {...}gdzie word jest przekazanym slowem, a letters to znaki, ktorych wystapienia zliczamy
//        Przyklad
//public int countOccurrencesLettersInWord("Dom to nie auto", new char[] {'a','m'})
//        Wynik 2


// Zrób testy jako praca domowa

public class Counter {

    public static void main(String[] args) {

        int result = countOccurrencesLettersInWord("Dom to nie auto", new char[]{'a', 'm', 't', 'x', 'y', 'c'});
//        int result1 = countOccurrencesLettersInWord(null, new char[]{'a', 'm', 't', 'x', 'y', 'c'});

        System.out.println("Wynik: " + result);
//        System.out.println("Wynik: " + result1);

    }

    public static int countOccurrencesLettersInWord(String word, char[] letters) {

        if (word == null || word.isBlank()) {
            System.out.println("Sentence is <null>");
//            return -1;
            return 0;
        } else {

            int counter = 0;

            for (char letter : word.toCharArray()) {
                for (char letterFromCharArray : letters) {
                    if (letter == letterFromCharArray) {
                        counter++;
                        break;
                    }
                }
            }
            return counter;
        }
    }
}
