import java.util.Scanner;
public class Pracs
{
    public static void main(String args[])
    {
        int n ;
        n=Integer.parseInt(args[0]);
   
        double result = 0.0;
        while(n > 0){
            result = result + (double) 1 / n;
            n--;
        }
        System.out.println("Output of Harmonic Series is "+result);
    }
}
