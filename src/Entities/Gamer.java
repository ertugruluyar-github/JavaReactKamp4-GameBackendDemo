package Entities;

import java.time.LocalDate;
import java.util.ArrayList;

import Abstract.IEntity;
import Abstract.User;

public class Gamer extends User implements IEntity {
	private ArrayList<Game> gameBag = new ArrayList<Game>();;
	
	public Gamer() {}

	public Gamer(int id, String firstName, String lastName, String email, String userName, String password,
			String nationalityId, LocalDate dateOfBirth, ArrayList<Game> gameBag) {
		super(id, firstName, lastName, email, userName, password, nationalityId, dateOfBirth);
		this.gameBag = gameBag;
	}
	
	public Gamer(String firstName, String lastName, String email, String userName, String password,
			String nationalityId, LocalDate dateOfBirth, ArrayList<Game> gameBag) {
		super(firstName, lastName, email, userName, password, nationalityId, dateOfBirth);
		this.gameBag = gameBag;
	}

	// Getter - Setter
	public ArrayList<Game> getGameBag() {
		return gameBag;
	}

	public void setGameBag(ArrayList<Game> gameBag) {
		this.gameBag = gameBag;
	}
	
}
