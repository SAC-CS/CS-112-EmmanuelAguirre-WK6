//Programmer: Emmanuel Aguirre
//CLASS: Cmpr-112
//HW: Week 6
import java.util.Scanner;
public class RockPaperScissors 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String rockWord = "Rock";
		String paperWord = "Paper";
		String scissorsWord = "Scissors";
		String draw = "It's a Draw!";
		String win = "You WIN!";
		String lose = "You LOSE!";
		String compAnsWord;
		String userAnsWord;
		
		int rockNum = 1;
		int paperNum = 2;
		int scissorsNum = 3;
		int compAnsNum;
		int userAnsNum;
		
		compAnsNum = ((int)(Math.random()*3)+1);
		if(compAnsNum==rockNum)
			compAnsWord = rockWord;
		else if(compAnsNum==paperNum)
			compAnsWord = paperWord;
		else
			compAnsWord = scissorsWord;
			
		System.out.println("Welcome to the game: Rock, Paper, Scissors!");
		System.out.println("This is a player vs computer game.");
		System.out.println("The computer has made a selection.");
		System.out.print("Enter your move (1 for Rock, 2 for Paper, or 3 for Scissors): ");
		userAnsNum = in.nextInt();
		System.out.println();
		
		if(userAnsNum==rockNum)
			userAnsWord = rockWord;
		else if(userAnsNum==paperNum)
			userAnsWord = paperWord;
		else
			userAnsWord = scissorsWord;
		
		if(userAnsNum==compAnsNum)
			System.out.println(draw);
		else
		{
			if(userAnsNum == rockNum)
			{
				if(compAnsNum==scissorsNum)
					System.out.println(win);
				else
					System.out.println(lose);
			}
			
			else if(userAnsNum == paperNum)
			{
				if(compAnsNum==rockNum)
					System.out.println(win);
				else
					System.out.println(lose);
			}
			else
			{
				if(compAnsNum == paperNum)
					System.out.println(win);
				else
					System.out.println(lose);
			}
		}
		System.out.printf("User: %s\tComp: %s", userAnsWord, compAnsWord);					
		System.exit(0);	
	}
}
