/**
 * Created by achrymsh@gmail.com on 6/20/17.
 */
public class Encryptor {

    public void encryptwithkey(String var,int k){/*
    *Shift each chars with <b>key</b>
    * If char thus obtained > A, start counting from A (ch-=26);
    *

    */
         var=var.toLowerCase();
        String str="";
         for(int i=0;i<=var.length()-1;i++) {

             char ch=(char) (var.charAt(i)+k);
             if (ch > 'z')
            str += (char)(var.charAt(i) - (26-k));
             else
             str=str+(char)(var.charAt(i)+k);
         }

        String ans=str.toUpperCase();
        System.out.print(ans+" ");
    }




}
