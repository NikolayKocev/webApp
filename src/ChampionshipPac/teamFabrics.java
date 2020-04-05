package ChampionshipPac;

public class teamFabrics implements IteamsFabrics{
	
	teams newTeams;
	static int idPosition=0;
    public teamFabrics() {
    	
    }
	
	public teams creatATeam() {
		newTeams=new teams(1,0,this.teamId());
		return this.newTeams;
	}
	
	public int teamId() {
		idPosition++;
		return idPosition;
	}

}
