import java.util.Scanner;

public class BowlingTeamDemo
{
	public static void main(String[] args)
	{
		//variables
		String name;
		int x;
		int y;
		final int NUM_TEAM_MEMBERS = 4;
		final int NUM_TEAMS = 4;

		//input
		Scanner input = new Scanner(System.in);	

		BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];

		//call
		getTeamData(teams);

		//output
		for(y = 0; y < NUM_TEAMS; ++y)
		{
			System.out.println("\nMembers of team " + teams[y].getTeamName() + ": ");
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			{
				System.out.print(teams[y].getMember(x) + " ");
			}
			System.out.println();
		}
		//allow user to look up roster of any existing team by name
		System.out.print("\n\nEnter a team name to see its roster: ");
		name = input.nextLine();
		for(y = 0; y < teams.length; ++y)
		{
			if(name.equalsIgnoreCase(teams[y].getTeamName()))
				for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
				{
					System.out.print(teams[y].getMember(x) + " ");
				}	
		}
	}

	public static void getTeamData(BowlingTeam[] teams)
	{
		//variables
		String name;
		int x;
		int y;
		final int NUM_TEAM_MEMBERS = 4;
		final int NUM_TEAMS = 4;

		//input
		Scanner input = new Scanner(System.in);	
		//loop for each individual team
		for(y = 0; y < NUM_TEAMS; ++y)
		{
			teams[y] = new BowlingTeam();
			System.out.print("Please enter the team name: ");
			name= input.nextLine();
			teams[y].setTeamName(name);
			System.out.println("Enter 4 team members: ");
			//loop to enter team members
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			{
				System.out.print("Enter team member's name: ");
				name = input.nextLine();
				teams[y].setMember(x, name);
			}
		}

	}
}