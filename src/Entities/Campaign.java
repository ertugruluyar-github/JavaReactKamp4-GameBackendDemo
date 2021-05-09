package Entities;

import java.time.LocalDate;
import java.util.ArrayList;

import Abstract.IEntity;
import Abstract.GameCategory;

public class Campaign implements IEntity {
	private int id;
	private int name;
	private int discountPercentage;
	private ArrayList<GameCategory> validCategories;
	private LocalDate lastDate;

	public Campaign() {}

	public Campaign(int id, int name, int discountPercentage, ArrayList<GameCategory> validCategories,
			LocalDate lastDate) {
		this.id = id;
		this.name = name;
		this.discountPercentage = discountPercentage;
		this.validCategories = validCategories;
		this.lastDate = lastDate;
	}
	
	public Campaign(int name, int discountPercentage, ArrayList<GameCategory> validCategories,
			LocalDate lastDate) {
		this.name = name;
		this.discountPercentage = discountPercentage;
		this.validCategories = validCategories;
		this.lastDate = lastDate;
	}
	
	// Getter - Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public ArrayList<GameCategory> getValidCategories() {
		return validCategories;
	}

	public void setValidCategories(ArrayList<GameCategory> validCategories) {
		this.validCategories = validCategories;
	}

	public LocalDate getLastDate() {
		return lastDate;
	}

	public void setLastDate(LocalDate lastDate) {
		this.lastDate = lastDate;
	}

}
