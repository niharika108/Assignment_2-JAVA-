
import java.util.Scanner;

class Guesser
{
	int guessNum;
	public int guessNumber()
	{

		Scanner scan = new Scanner(System.in);
			System.out.println("Guesser Kindly guess the number");
			guessNum=scan.nextInt();
			return guessNum;	
	}
	
}

class Player
{
	int playerGuessNum;
	public int playerGuessNumber(int x)
	{
	
		Scanner scan = new Scanner(System.in);
		if(x==1)
		{
			System.out.println("Player 1 Kindly guess the number");
		}
		else if(x==2)
		{
			System.out.println("Player 2 Kindly guess the number");
		}
		else if(x==3)
		{
			System.out.println("Player 3 Kindly guess the number");	
		}
		playerGuessNum=scan.nextInt();
		return playerGuessNum;
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	public void collectNumFromGuesser()
		{
			Guesser g = new Guesser();
			numFromGuesser=g.guessNumber();
		}
		
	public void collectNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromPlayer1=p1.playerGuessNumber(1);
		numFromPlayer2=p2.playerGuessNumber(2);
		numFromPlayer3=p3.playerGuessNumber(3);
	}
	
	void compare(int x)
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				if(x==1)
				{
					System.out.println("Player 1 and Player 2 and Player 3 are qualified to Semifinal");
					SemiFinal sfr=new SemiFinal();
					sfr.semiFinalResultGuesser();
					sfr.semiFinalResultFromPlayer();
					sfr.semiFinalResultCompare();
				}
				else if(x==3)
				{
					System.out.println("Player 1,Player 2 and Player 3 are the Winners");
				}
			
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player 1 and Player 2 are qualified to Final");
				FinalResult fr=new FinalResult();
				fr.FinalResultGuesser();
				fr.FinalNumFromPlayer(1,2);
				fr.Finalcompare(1,2);
				
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 and Player 3 are to final");
				FinalResult fr=new FinalResult();
				fr.FinalResultGuesser();
				fr.FinalNumFromPlayer(1,3);
				fr.Finalcompare(1,3);
			}
			else
			{
				System.out.println("Player 1 won the Game");
			}
			
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
					System.out.println("Player 2 and Player 3 -final");
					FinalResult fr=new FinalResult();
					fr.FinalResultGuesser();
					fr.FinalNumFromPlayer(2,3);
					fr.Finalcompare(2,3);
			}
			else
			{
				System.out.println("Player 2 won the Game");
			}
			
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the Game");
		}
		else
		{
			System.out.println("Game lost! try again");
		}
	}
	
}

public class GuesserGame {

	public static void main(String[] args) {
	
		System.out.println("Welcome Everyone to this wonderful Guesser Game!!");
		System.out.println("Please read the instructions of the game carefully before start the game.");
		System.out.println("   1. There will be total 5 players in this game, 1 Umpire who leads the game, 1 Guesser who will guess the number and share with Umpire, 3 players try to guess the number which guesser has guessed and share with the umpire.");
		System.out.println("   2. Now, The Umpire compare the number which guesser has guessed with the number guessed by players.");
		System.out.println("   3. if 3 players guessed the number correctly then 3 will be qualified to semifinal, In Semifinal if again 3 players guessed the number correctly then 3 players will be qualified to the Final, In final if again 3 players guessed the number correctly, the three will be declared as Winners");
		System.out.println("   4. In first round if 2 players guessed the number correctly then 2 players will be qualified to Final, In Final if again 2 players will guessed the correct number then 2 players will be declared as Winners");
		System.out.println("   5. In any round, only one Player guessed the number correctly then that one player will directly declared as Winner.");
		System.out.println("   6. If no one guessed the correct number in any of the round then the game will end up.");
		System.out.println("The winner will get an amazing prize from iNeuron team (^ ^)");
		System.out.println("All the very best to all the players!!");
		System.out.println();
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare(1);
		
	}

}

class SemiFinal {
	int semiFinalNumFromGuesser;
	int semiFinalNumumFromPlayer1;
	int semiFinalNumumFromPlayer2;
	int semiFinalNumumFromPlayer3;
	
	public void semiFinalResultGuesser() {
		
		Guesser g = new Guesser();
		semiFinalNumFromGuesser=g.guessNumber();
		
		
	}	
		public void semiFinalResultFromPlayer()
		{
			Player p1=new Player();
			Player p2=new Player();
			Player p3=new Player();
			
			semiFinalNumumFromPlayer1=p1.playerGuessNumber(1);
			semiFinalNumumFromPlayer2=p2.playerGuessNumber(2);
			semiFinalNumumFromPlayer3=p3.playerGuessNumber(3);
		}
		
	void semiFinalResultCompare()
	{
		if(semiFinalNumFromGuesser==semiFinalNumumFromPlayer1)
		{
			if(semiFinalNumFromGuesser==semiFinalNumumFromPlayer2 && semiFinalNumFromGuesser==semiFinalNumumFromPlayer3)
			{
				System.out.println("Player 1, Player 2 and Player 3 are qualified to final");
				Umpire u=new Umpire();
				u.collectNumFromGuesser();
				u.collectNumFromPlayer();
				u.compare(3);
				
			}
			else if(semiFinalNumFromGuesser==semiFinalNumumFromPlayer2)
			{
				System.out.println("Player 1 and Player 2 are qualified to final");
				FinalResult fr=new FinalResult();
				fr.FinalResultGuesser();
				fr.FinalNumFromPlayer(1,2);
				fr.Finalcompare(1,2);
				
				
			}
			else if(semiFinalNumFromGuesser==semiFinalNumumFromPlayer3)
			{
				System.out.println("Player 1 and Player 3 are qualified to final");
				FinalResult fr=new FinalResult();
				fr.FinalResultGuesser();
				fr.FinalNumFromPlayer(1,3);
				fr.Finalcompare(1,3);
				
			}
			else
			{
				System.out.println("Player 1 won the Game");
			}
			
		}
		else if(semiFinalNumFromGuesser==semiFinalNumumFromPlayer2)
		{
			if(semiFinalNumFromGuesser==semiFinalNumumFromPlayer3)
			{
					System.out.println("Player 2 and Player 3 are qualified to Final");
					FinalResult fr=new FinalResult();
					fr.FinalResultGuesser();
					fr.FinalNumFromPlayer(2,3);
					fr.Finalcompare(2,3);
			}
			else
			{
				System.out.println("Player 2 won the Game");
			}
			
		}
		else if(semiFinalNumFromGuesser==semiFinalNumumFromPlayer3)
		{
			System.out.println("Player 3 won the Game");
		}
		else
		{
			System.out.println("Game lost! try again");
		}
	
	}
			
}
class FinalResult
{
	int FinalNumFromGuesser;
	int FinalNumumFromPlayer1;
	int FinalNumumFromPlayer2;
	int FinalNumumFromPlayer3;
	
	public void FinalResultGuesser() {
		
		Guesser g = new Guesser();
		FinalNumFromGuesser=g.guessNumber();
			
	}	
		public void FinalNumFromPlayer(int x, int y)
		{
			if(x==1 && y==2) {
				Player p1=new Player();
				Player p2=new Player();
				
				FinalNumumFromPlayer1=p1.playerGuessNumber(1);
				FinalNumumFromPlayer2=p2.playerGuessNumber(2);	
			}
			if(x==1 && y==3) {
				Player p1=new Player();
				Player p3=new Player();
				
				FinalNumumFromPlayer1=p1.playerGuessNumber(1);
				FinalNumumFromPlayer3=p3.playerGuessNumber(3);	
			}
			if(x==2 && y==3) {
				Player p2=new Player();
				Player p3=new Player();
				
				FinalNumumFromPlayer2=p2.playerGuessNumber(2);
				FinalNumumFromPlayer3=p3.playerGuessNumber(3);	
			}
	
			
		}
		void Finalcompare(int x, int y) {
			if(x==1 && y==2) {
				if(FinalNumFromGuesser==FinalNumumFromPlayer1)
				{
					if(FinalNumFromGuesser==FinalNumumFromPlayer2)
					{
						System.out.println("Player 1 and 2 are the Winners");
					}
					else
					{
						System.out.println("Player 1 is the Winner");
					}
						
				}
				else if(FinalNumFromGuesser==FinalNumumFromPlayer2)
				{
					System.out.println("Player 2 is the Winner");
				}
				else
				{
					System.out.println("Game lost! try again");	
				}
				
			}
			
			if(x==1 && y==3) {
				if(FinalNumFromGuesser==FinalNumumFromPlayer1)
				{
					if(FinalNumFromGuesser==FinalNumumFromPlayer3)
					{
						System.out.println("Player 1 and 3 are the Winners");
					}
					else
					{
						System.out.println("Player 1 is the Winner");
					}
						
				}
				else if(FinalNumFromGuesser==FinalNumumFromPlayer3)
				{
					System.out.println("Player 3 is the Winner");
				}
				else
				{
					System.out.println("Game lost! try again");		
				}
				
			}
			
			
			if(x==2 && y==3) {
				if(FinalNumFromGuesser==FinalNumumFromPlayer2)
				{
					if(FinalNumFromGuesser==FinalNumumFromPlayer3)
					{
						System.out.println("Player 2 and 3 are the Winners");
					}
					else
					{
						System.out.println("Player 2 is the Winner");	
					}
						
				}
				else if(FinalNumFromGuesser==FinalNumumFromPlayer3)
				{
					System.out.println("Player 3 is the Winner");
				}
				else
				{
					System.out.println("Game lost! try again");	
				}
				
			}
			
			
		}
}



