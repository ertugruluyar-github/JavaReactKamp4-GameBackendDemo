package Abstract;

import Entities.Game;
import Entities.Gamer;

public interface IShoppingService {
	void saleGame(Gamer gamer, Game game);
	void cancelSale(Gamer gamer, Game game);
}
