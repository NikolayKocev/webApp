package ChampionshipPac;

import java.util.Arrays;



public class lastChampionship {
	private teams[] allTeams= new teams [18];
    private teamFabrics fabricsForteams= new teamFabrics();
    private round [] allRounds =new round[306];
  
	
	public void createChanpionship() {
		for(int i=0; i<this.allTeams.length; i++) {
			allTeams[i]= fabricsForteams.creatATeam();
		}
		
		for(int i=0; i<this.allTeams.length; i++) {
			setHostListToTeams(allTeams[i]);
		}
		
		rounds();
		System.out.println("ok");
			
	}
	
	private void setHostListToTeams(teams curent) {
		int y=0;
		int curentTeamId=curent.getTeamId();
		
		for (int i=0; i<allTeams.length;i++) {
			
			if(curentTeamId!=allTeams[i].getTeamId()) {
				curent.setHost(allTeams[i],y);
				y++;
			}
		}
	}
	
	private void rounds() {
	
		for(int i=0; i<this.allTeams.length;i++) {
			for (int j=0; j<17 ;j++) {
				round curent= new round(this.allTeams[i], this.allTeams[i].getHost(j));
			}
		}
		
	}
	
	private void createRanking() {
		System.out.println("ok");
		int [] curentRancingPoints=new int [allTeams.length];
		for(int i=0;i <allTeams.length ;i++) {
			curentRancingPoints[i]= allTeams[i].getTeamPoints(allTeams[i])*100 + allTeams[i].getTeamId();
		}
		Arrays.sort(curentRancingPoints);
		teams[] curentRancing= new teams [18];
		for (int i=0;i<allTeams.length;i++) {
			int curentId = curentRancingPoints[i]%100;
			teams curentTeam=null;
			for(int m=0;m<allTeams.length;m++) {
				if(curentId==allTeams[m].getTeamId()) {
					curentTeam=allTeams[m];
					break;
				}
			}
			curentRancing[i]=curentTeam;
		}
		allTeams=curentRancing;
	}
	
	public void showRanking() {
		this.createRanking();
		for(int i =allTeams.length-1; i>=0; i--) {
			allTeams[i].setTeamPosition(allTeams.length-i);
			System.out.println(allTeams[i].getTeamPosition()+ "--"+allTeams[i].getTeamId()+ "--"+allTeams[i].getTeamPoints(allTeams[i]));
		}
	}

}
