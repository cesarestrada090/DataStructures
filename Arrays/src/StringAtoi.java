import java.math.BigInteger;

public class StringAtoi {
    public static void main(String[] args) {
        String word = "012345678aA9";
        String finalNumber = "";
        int negative = 1;
        for(int i = 0 ; i<word.length(); i++) {
            int letterValue = word.charAt(i);
            if(letterValue>47 && letterValue<58){
                finalNumber = finalNumber + (char)letterValue;
            }
            if(letterValue == 45){
                negative = negative*-1;
            }
            System.out.println(Long.MAX_VALUE);
            Long.parseLong("9223372036854775807");

            System.out.println(Character.isAlphabetic(letterValue));

        }
        System.out.println("final"+ finalNumber);

    }
}
