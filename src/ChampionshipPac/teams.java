package ChampionshipPac;

public class teams  {
	private int teamId;
	private int teamPoints=0;
	private int teamPosition=1;
	private teams [] host= new teams[17];
	
	public teams getHost(int numberOfTeam) {
		return host[numberOfTeam];
	}

	public void setHost(teams hosting,int x) {
		this.host[x] = hosting;
	}

	public int getTeamPoints(teams az) {
		return az.teamPoints;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamPoints(int teamPoints) {
		this.teamPoints = this.teamPoints + teamPoints;
	}

	public int getTeamPosition() {
		return teamPosition;
	}

	public void setTeamPosition(int teamPosition) {
		this.teamPosition = teamPosition;
	}

	public teams(int position, int points, int id) {
		this.teamId=id;
		this.teamPoints=points;
		this.teamPosition=position;
		
	}
		
	
	
	

}
