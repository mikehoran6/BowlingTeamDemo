//pages 386-391

public class BowlingTeam
{
	//data field variables
	private String teamName;
	private String[] members = new String[4];

	//mutator (setter) for teamName
	public void setTeamName(String team)
	{
		teamName = team;
	}
	//accessor (getter) for teamName
	public String getTeamName()
	{
		return teamName;
	}

	//mutator (setter) for members[]
	public void setMember(int number, String name)
	{
		members[number] = name;
	}
	//accessor (getter) for members[]
	public String getMember(int number)
	{
		return members[number];
	}
}  