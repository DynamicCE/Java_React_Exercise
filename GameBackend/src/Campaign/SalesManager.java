package Campaign;

import Campaign.ICampaign;
import Game.Game;
import Player.Player;

public
class SalesManager {
    public void buyGame( Player player , Game game , ICampaign campaign ){
        double price= game.getPrice ();
        double discountedPrice = price - campaign.calculateDiscount ( game );
        System.out.println (player.getNickName () + " , " +game.getGameName ()+ " oyununu satın aldınız, indirimli fiyat: : "+ discountedPrice +" birimdir." );
    }
}
