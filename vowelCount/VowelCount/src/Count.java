public class Count {
    /*Made a function that Return the number (count) of vowels in the given string.
    We will consider a, e, i, o, u as vowels for this Kata (but not y).
    The input string will only consist of lower case letters and/or spaces. */
    //Function
    public static int counter (String word){
        int results = 0;

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'||
            word.charAt(i) == 'o' || word.charAt(i) == 'u' ) {
                results++;
        }
    }
    return results;
}
}
