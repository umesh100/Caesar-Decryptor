import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by achrymsh@gmail.com on 6/20/17.
 */
public class Decryptor {

    public void decryptnokey(String word) {/*
     * Try bruteforce:--- get 26 output for 26 possible keys
     * compare each element with each element of dictionary and trigger when match is found


     */


        try {
            FileReader fr = new FileReader("Wordlist/words.txt");
            BufferedReader bf = new BufferedReader(fr);
            String cmparr[] = new String[26];
            for (int i = 1; i <= 26; i++) {
                cmparr[i - 1] = bruteforce(word, i);
            }


            while (bf.readLine() != null) {
                String dictword=bf.readLine();
                for(String outputs:cmparr){
                    if(outputs.equalsIgnoreCase(dictword)){
                        System.out.print(dictword.toUpperCase()+" ");

                    }

                }

            }


        } catch (Exception ex) {
            // ex.printStackTrace();
        }


    }

    public void decrypthaskey(String xyz, int x) {
        /*
        *Shift backward for each characters .If value is less than A, start from Z again



         */
        String ans = "";
        for (int i = 0; i <= xyz.length() - 1; i++) {
            char ch = (char) (xyz.charAt(i) - x);
            if (ch > 'z')
                ans += (char) (xyz.charAt(i) - (26 + x));
            else if (ch < 'a')
                ans += (char) (xyz.charAt(i) + (26 - x));
            else
                ans = ans + (char) (xyz.charAt(i) - x);

        }
        System.out.print(ans.toUpperCase()+ " ");

    }

    private String bruteforce(String xyz, int x) { //
        String ans = "";
        for (int i = 0; i <= xyz.length() - 1; i++) {
            char ch = (char) (xyz.charAt(i) - x);
            if (ch > 'z')
                ans += (char) (xyz.charAt(i) - (26 + x));
            else if (ch < 'a')
                ans += (char) (xyz.charAt(i) + (26 - x));
            else
                ans = ans + (char) (xyz.charAt(i) - x);

        }
        return ans;

    }

}

