package Campaign;

import Game.Game;
import Player.Player;

public
class NewPlayerCampaign implements ICampaign {


    @Override
    public double
    calculateDiscount ( Game game ) {
        return game.getPrice () * 0.25;
    }
}
