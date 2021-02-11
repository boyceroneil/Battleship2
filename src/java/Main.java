import java.util.*;
public class Main {
//destroyer 00H
//aircraft 30V
//submarine 31H
//cruiser 41V
//battleship    25H
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Player 1 what is your name: ");
    String name1 = read.nextLine();
    //Fleet1 player1 = new Fleet1();
    Grid map1 = new Grid();
    Grid map2 = new Grid();

    System.out.println(name1 + " set your Destroyer class ");
    map1.printMap();
    placeShips(new Destroyer(), map1);
    System.out.println(name1 + " set your Aircraft class ");
    map1.printMap();
    placeShips(new AirCraft(), map1);
    System.out.println(name1 + " set your Submarine class ");
    map1.printMap();
    placeShips(new Submarine(), map1);
    System.out.println(name1 + " set your Cruiser class ");
    map1.printMap();
    placeShips(new Cruiser(), map1);
    System.out.println(name1 + " set your Battleship class ");
    map1.printMap();
    placeShips(new Battleship(), map1);

        System.out.println("Player 2 what is your name: ");
        String name2 = read.nextLine();
        System.out.println(name2 + " set your Destroyer class ");
        map2.printMap();
        placeShips(new Destroyer(), map2);
        System.out.println(name2 + " set your Aircraft class ");
        map2.printMap();
        placeShips(new AirCraft(), map2);
        System.out.println(name2 + " set your Submarine class ");
        map2.printMap();
        placeShips(new Submarine(), map2);
        System.out.println(name2 + " set your Cruiser class ");
        map2.printMap();
        placeShips(new Cruiser(), map2);
        System.out.println(name2 + " set your Battleship class ");
        map2.printMap();
        placeShips(new Battleship(), map2);

        begin(map1,map2,name1,name2);

    //    System.out.println("C for cruiser, B for battleship, A aircraft, S submarine, and D for destroyer");
//    String type = read.nextLine();


    }
    public static void placeShips(Ship boat, Grid map){
        while(true){
            Scanner read = new Scanner(System.in);
            Scanner read1 = new Scanner(System.in);
            System.out.println("Choose the row you want ");
            int row = read.nextInt();
            System.out.println("Choose the column you want to be at ");
            int col = read.nextInt();
            System.out.println("Choose H for horizontal and V for vertical placement ");
            String pos = read1.nextLine();
            if(map.clearance(boat,row,col,pos)){
                map.placement(boat,row,col,pos);
                break;
            }

        }
    }

    public static void begin(Grid map1, Grid map2, String name1, String name2) {
        Scanner read = new Scanner(System.in);
        Scanner read1 = new Scanner(System.in);
        Grid player1Att = new Grid();
        Grid player2Att = new Grid();
        int counter =0;
        int counter2 =0;
        System.out.println(name1+ " go first and pick your target to attack \n");
        while(map1.shipListSize() >0 && map2.shipListSize() > 0){
            player1Att.printMap();
            //map1.printMap();

            while(true){
                System.out.println(name1 +" choose the row you want to hit");
                int row = read.nextInt();
                System.out.println(name1+" choose the column you want to hit");
                int col = read.nextInt();
                if(row>0 && row<=9 && col>0 && col<=9){
                    if(player1Att.getGrid(row-1, col-1).toString().equals("~")){
                        map2.hit(row-1,col-1,player1Att);
                        counter++;
                        break;
                    }
                }
                else{
                    System.out.println("Missed");
                }
            }
            player2Att.printMap();
            map2.printMap();
            while(true){
                System.out.println(name2+ " choose the row you want to hit");
                int row = read.nextInt();
                System.out.println(name2+" choose the column you want to hit");
                int col = read.nextInt();
                if(row>0 && row<=9 && col>0 && col<=9){
                    if(player2Att.getGrid(row-1, col-1).toString().equals("~")){
                        map1.hit(row-1,col-1,player2Att);
                        counter2++;
                        break;
                    }
                }
                else{
                    System.out.println("Missed");
                }
            }
            if(counter2==5){
                System.out.println(name1 + " you suck");//player 2 win
        }
            else if(counter==5){
                System.out.println(name2 + " you suck");//player1 win
            }

        }

    }
}
