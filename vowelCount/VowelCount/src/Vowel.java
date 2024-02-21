import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a chain of words or a word: ");
        String word = sc.nextLine();
        //Count.counter(word.toLowerCase());

        int results = Count.counter(word.toLowerCase());
        System.out.println("The count of vowels is: "+results );
        
    }
}
