import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by achrymsh@gmail.com on 6/20/17.
 */
public class CaesarEngine {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("PLEASE PROVIDE INPUT WORDS:");

        String input = sc1.nextLine();
        input=input.toLowerCase();
        StringTokenizer st=new StringTokenizer(input," ");//String tokenizer to split each strings of a line
        int count=st.countTokens();
        String[] marr=new String[count];
        for(int i=0;i<=count-1;i++){

            marr[i]=st.nextToken();//store in array
        }




        System.out.println("PLEASE WRITE 1 --TO ENCRYPT OR 2 --TO DECRYPT");
        int opt = sc1.nextInt();

        switch (opt) {

            case 1:
                //start encryption process
                System.out.println("PLEASE PROVIDE KEY");
                int key = sc1.nextInt();
                if (key < 1 || key > 26) {
                    System.out.println("KEY SHOULD BE WITHIN RANGE : 1-27");
                } else {
                    try {
                        System.out.println("Encrypting please wait....");
                        System.out.print("ENCRYPTED VALUE: ");
                        for(String arrx:marr){//pass a value at a time to encryptor method
                            new Encryptor().encryptwithkey(arrx, key);}
                    } catch (Exception ex) {
                        System.out.println("CANNOT ENCRYPT NUMBERS");

                    }
                }

                break;

            case 2:
                //start decryption process
                System.out.println("PLEASE PROVIDE KEY IF YOU HAVE :ELSE PRESS 0");
                int keyD = sc1.nextInt();
                if (keyD < 1 || keyD > 26) {
                    System.out.println("Trying bruteforce, please wait.....");
                    System.out.println("DECRYPTED VALUE:");
                    for(String arrx:marr){//pass a value at a time to decryptor method
                        new Decryptor().decryptnokey(arrx);}
                }
                else{
                    System.out.println("DECRYPTED VALUE:");
                    for(String arrx:marr){//pass a value at a time to decryptor method , pass decryption key
                        new Decryptor().decrypthaskey(arrx,keyD);}
                }


                break;

            default:
                System.out.println("please provide input again");

                break;
        }
    }


}
















