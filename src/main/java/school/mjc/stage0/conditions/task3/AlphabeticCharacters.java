package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) {
            if (character == 'A' || character == 'a') {
                System.out.println("Vowel");
            } else if (character == 'E' || character == 'e') {
                System.out.println("Vowel");
            } else if (character == 'O' || character == 'o') {
                System.out.println("Vowel");
            } else if (character == 'U' || character == 'u') {
                System.out.println("Vowel");
            } else if (character == 'I' || character == 'i') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }

        } else {
            System.out.println("wrong alphabet!");
        }

    }
}
