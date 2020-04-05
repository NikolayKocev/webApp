package ChampionshipPac;

import java.util.Random;


public class round {
	teams host;
	teams guest;
	int hostScore;
	int guestScore;
		
	public round(teams host, teams guest) {
		this.host=host;
		this.guest=guest;
		play();
		
	}
	
	public void play() {
		Random goals = new Random();
		this.hostScore=goals.nextInt(10);
		this.guestScore=goals.nextInt(10);
		if (hostScore>guestScore) {
			this.host.setTeamPoints(3);
		}
		if (hostScore<guestScore) {
			this.guest.setTeamPoints(3);
		}
		else {
			this.host.setTeamPoints(1);
			this.guest.setTeamPoints(1);
		}
		
	}

}
