import java.util.Scanner;
public class Main {
	public static void main(String [] args){
		
		System.out.printf("Welcome to the guess a number game, please type in a number to set the amount of dice being rolled\n");
		Scanner input = new Scanner(System.in);
		double user = input.nextDouble();
		System.out.printf("The number of dice being rolled are %s.\nNow Guess the number that could be rolled by the %s dice used\n", user, user);
		System.out.printf("Try to guess as close as possible to the number rolled. The guess can be off as much as 10 percent to win.\n");
		
		Dice randomNumber = new Dice();
		double game = randomNumber.Throw(user);
		double guess = input.nextDouble();
		
		
		double check = (guess/game);
		System.out.printf("%s\n", check);
		if ((1 <= check && check <= 1.1) || (.9 <= check && check <= 1)){
			System.out.printf("Congratulations, the number %s is the correct choice. Your guess of %s was close enough to the number.\nYou win!!!\n", game ,guess);		
			}		
		else if (check < .9){			
			System.out.printf("Sorry but the number %s is too low, the correct number is %s, please try again by restarting program.", guess , game);		
			}		
		else if (check > 1.1){			
			System.out.printf("Sorry but the number %s is too high, the correct number is %s, please try again by restarting program.", guess , game);			
			}	
		}
	} 
