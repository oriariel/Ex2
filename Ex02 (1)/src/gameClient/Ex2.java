package gameClient;
import Server.Game_Server_Ex2;
import api.game_service;
public class Ex2 {

	public static void main(String[] args) {
		int level_number = 0;
		game_service game = Game_Server_Ex2.getServer(level_number);
		game.login(1234);
		System.out.println(game.getGraph());
		System.out.println(game.getGraph());
		System.out.println(game);
		game.addAgent(0);
		game.startGame();
		while(game.isRunning()) {
			game.chooseNextEdge(0, 5);
			game.move();
			
		}
		}
	}

