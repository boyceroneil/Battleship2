import java.util.Scanner;

public class Player {
    public Ship[] ships;
    public Grid player1;
    public Grid opponent1;
    public Player(){
        ships = new Ship[5];
        for(int i =0; i<5; i++){
         //   Ship temp = new Ship();
          //  ships[i] = temp;
        }
    }
    public int deployShip(){
        int counter =0;
            for(Ship s: ships){
                if(s.isInitialization()){
                    counter++;
                }
        }
        return counter;


    }

}
