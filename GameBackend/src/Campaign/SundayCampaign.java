package Campaign;

import Game.Game;
import Player.Player;

public
class SundayCampaign implements ICampaign {
    @Override
    public double
    calculateDiscount ( Game game ) {
        return game.getPrice () * 0.45;
    }
}
