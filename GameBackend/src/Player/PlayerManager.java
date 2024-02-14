package Player;

public
class PlayerManager {
    public void addPlayer(Player player){
        System.out.println ("oyuncu sisteme eklendi: " + player.getNickName () );
    }
    public void deletePlayer(Player player){
        System.out.println (    "Oyuncu sistemden silindi: " + player.getNickName ());
    }
}
