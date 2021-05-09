package Entities;

import Abstract.IEntity;
import Abstract.GameCategory;

public class Game implements IEntity {
	private int id;
	private String name;
	private GameCategory gameCategory;
	private int price;
	
	public Game() {}

	public Game(int id, String name, GameCategory gameCategory, int price) {
		this.id = id;
		this.name = name;
		this.gameCategory = gameCategory;
		this.price = price;
	}
	
	public Game(String name, GameCategory gameCategory, int price) {
		this.name = name;
		this.gameCategory = gameCategory;
		this.price = price;
	}
	
	// Getter - Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GameCategory getGameCategory() {
		return gameCategory;
	}

	public void setGameCategory(GameCategory gameCategory) {
		this.gameCategory = gameCategory;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
