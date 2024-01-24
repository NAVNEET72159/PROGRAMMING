package CodeChefQuestions;

import java.lang.ref.Cleaner;
import java.util.Scanner;

public class The_Lead_Game {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int max=0;
        int play1=0,play2=0;

        while((t--)!=0){
            int p=sc.nextInt();
            int q=sc.nextInt();
            play1+=p;
            play2+=q;
            int lead = play1-play2;
            System.out.println(play1+" "+play2+" "+lead);
            if(Math.abs(lead)>Math.abs(max))
                max=lead;
        }
        if(max>0)
            System.out.print(1+" "+(max));
        else
            System.out.print(2+" "+Math.abs(max));
    }
}
