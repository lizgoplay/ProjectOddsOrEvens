import java.util.*;
public class ProjectOddsOrEvens {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            //intro
            //take in the user name, odds or evens
            System.out.println("Let's play a game called \"Odds and Evens\"");
            System.out.print("What is your name? ");
            String name = input.nextLine();
            System.out.print("Hi "+name+", Which do you choose? (O)dds or (E)vens ");
            char choice = input.next().charAt(0);
            String gameChoice = "";
            String computerChoice = "";

            if(choice=='O')
            { gameChoice = "odds";
              computerChoice = "evens";}
            else if (choice=='E')
            { gameChoice = "evens";
              computerChoice = "odds";}
            System.out.println(name+" has picked "+gameChoice+"! The computer will be " +computerChoice+".");
            System.out.println("----------------------");
            System.out.println();

            // randomizer
            //takes in the number of "fingers" the user would like to plays, and uses
            //the random generator to decide what the computer will play
            Random rand=new Random();
            int computer=rand.nextInt(6);
            System.out.print("How many \"fingers\" do you put out? ");
            int fingers = input.nextInt();
            System.out.println("The computer plays "+computer+" \"fingers\".");
            System.out.println("----------------------");
            System.out.println();

            //sum
            // adds the 2 integers together and produces the sum
            int sum = fingers+computer;
            System.out.println(fingers+" + "+computer+" ="+sum);

            //who wins
            //decided whether the final answer is even or odd, and declares a winner
            //if(user is odd and sum is odd){
            //    user wins}
            //else if (user is odd and sum is even){
            //    user loses}
            String oddOrEven ="";
            String winOrLose = "";
            if (sum%2==0)
            {oddOrEven = "even";
                if (gameChoice.equals(oddOrEven))
                    {winOrLose=name;}
                else
                { winOrLose="Computer";}
            }
            else
            {oddOrEven = "odd";
                if (gameChoice.equals(oddOrEven))
                {winOrLose=name;}
                else
                { winOrLose="Computer";}
            }
            System.out.println(sum+" is ..."+oddOrEven+"!");

            System.out.println("That means "+winOrLose+" wins! :)");
            System.out.println("----------------------");
        }
}
