import java.util.*;

public class TypingTest {
    public static void accuracy(String sentence , String my_sentence) {
        double chars = 0;
        double Total_chars = sentence.length();
        int length = Math.min(sentence.length(), my_sentence.length());

        for (int i = 0; i < length; i++) {
            if (sentence.charAt(i) == my_sentence.charAt(i)) {
                chars++;
            }
        }

        double percentage = (chars / Total_chars) * 100;
        System.out.println("Your total accuracy is " + Math.round(percentage) + "%");
    }

    public static void main(String[] args) {
        String sentence = "Space is an almost perfect vacuum, nearly void of matter and with extremely low pressure. In space, sound doesn't carry because there aren't molecules close enough together to transmit sound between them. Not quite empty, bits of gas, dust and other matter floats around areas of the universe, while more crowded regions can host planets, stars and galaxies.";
        System.out.println("Welcome to typing test Application");
        System.out.println("Write the following sentence:\n" + sentence + "\n");
        Scanner input = new Scanner(System.in);
        long start_time = System.currentTimeMillis();
        String my_sentence = input.nextLine();
        long end_time = System.currentTimeMillis();
        long total_time = end_time - start_time;
        double seconds = total_time / 1000.0;
        double words = sentence.split(" ").length;
        double wpm = (words / seconds) * 60;
        System.out.println("Your total words per minute: " + Math.round(wpm));
        System.out.println("You took a total time of: " + seconds + " seconds");

        if (sentence.equals(my_sentence)) {
            System.out.println("Wow! Your accuracy is 100%");
        } else {
            accuracy(sentence, my_sentence);
        }
    }
}
