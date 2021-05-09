package Adapters;

import Abstract.IGamerCheckService;
import Entities.Gamer;

public class MernisGamerCheckManager implements IGamerCheckService{
	
	@Override
	public boolean checkGamer(Gamer gamer) {
		System.out.println("Gamer check with Mernis: " + gamer.getId());
		return true;
	}

}
