import java.lang.reflect.Array;

public class arrays
	{
		static int[] numbers = {2, 4, 8, 16, 32};
		public static void main(String[] args)
			{
				doChallengeOne();
				doChallengeTwo();
				doChallengeThree();
				doChallengeFour();
			}
		public static void doChallengeOne()
			{
				String [] soccerTeams = new String[5];
				soccerTeams[0]= "Barcelona";
				soccerTeams[1]= "Real Madrid";
				soccerTeams[2]= "Atheltico Madrid";
				soccerTeams[3]= "Valencia";
				soccerTeams[4]= "Espanol";
				System.out.println(soccerTeams[2]);	
			}
		public static void doChallengeTwo()
			{
				System.out.println(numbers[numbers.length -1]);
			}
		public static void doChallengeThree()
			{
				for (int i = 0; i < numbers.length; i++)
					{
						System.out.println(numbers[i]);
					}
			}
		public static void doChallengeFour()
			{
				double average = 0;
				for (int i = 0; i < numbers.length; i++)
					{
						average = average + numbers[i];
					}
				System.out.println(average/(numbers.length-1));
			}
	}	
