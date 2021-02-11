import java.util.ArrayList;
import java.util.List;

public class Grid {
    Areas[][] layer;
    private ArrayList<Ship> shipList;
 //   private Ship boat;


    public Grid() {

        shipList = new ArrayList<>();
        layer = new Areas[9][9];
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col <9; col++) {
                layer[row][col] = new Areas(row,col);
            }
        }
    }
    public void printMap() {
        System.out.println("   1 2 3 4 5 6 7 8 9");
        int row = 1;
        for (Areas [] sAra: layer) {
            System.out.print(row + "  ");
            for (Areas s: sAra) {
                System.out.print(s.toString() + " ");
            }
            System.out.println();
            row++;
        }
    }
    public int shipListSize(){
        return shipList.size();
    }

    public boolean hit(int row, int col, Grid map2) {
    if(!layer[row][col].toString().equals("~") && !layer.toString().equals("X")){
        layer[row][col].mark();
        map2.getGrid( row, col).mark();
        //layer[row][col].getShip().mark();
        System.out.println("Nice kill");
        return true;
    }
         else {
             layer[row][col].missed();
             map2.getGrid(row,col).missed();
             System.out.println("Do better");
            return false;
        }
//        if (status.equals("H")) {
//            return true;
//        }
    }
    public boolean clearance(Ship boat, int row, int col, String pos){
        if(pos.equals("V")){
            if(col+ boat.getLength()<=9){
                String before = layer[row][col].toString();
                if(before.equals("~")){
                    int z =0;
                    while(z < boat.getLength()){
                        if(!(layer[row ][col+ z].toString().equals("~"))){
                            return false;
                        }
                        z++;
                    }
                    return true;
                }
            }
            return false;
        }
        if(pos.equals("H")){
            if(row + boat.getLength()<=9){
                if(row+ boat.getLength()<=9){
                    String before = layer[row][col].toString();
                    if(before.equals("~")){
                        int z =0;
                        while(z < boat.getLength()){
                            if(!(layer[row+ z ][col].toString().equals("~"))){
                                return false;
                            }
                            z++;
                        }
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public Areas getGrid(int row, int col) {
        return layer[row][col];
    }

    public void placement(Ship boat, int row, int col, String pos){
     layer[row][col].placeShip(boat);
     shipList.add(boat);
     if(pos.equals("V")){
         int z= 1;
         while(z<= boat.getLength()-1){
             layer[row+z][col].placeShip(boat);
             z++;
         }
     }
     if(pos.equals("H")){
         int z=1;
         while(z<=boat.getLength()-1){
             layer[row][col+z].placeShip(boat);
             z++;
         }
     }

    }




//    public void addShip(String type){
//        if (type.equals("D")){//finding the destroyer
//            for(int i =0; i< shipList.size(); i++){
//                Ship local = (Ship) shipList.get(i);
//                if(local.type.equals(type)){//if equals to destroyer then add the following to the parameters
//                    int row = local.getRow();
//                    int col = local.getCol();
//                    int length = local.getLength();
//                    String pos = local.getPosition();
//                    if(pos.equals("H")){//then update to the map
//                        for(int j =col; i< col+length; i++){
//                            map[j][col].setPlaced(true);
//                            map[j][col].setShipLength(length);
//                            map[j][col].setShipPos(pos);
//                        }
//                    }
//                    else if(pos.equals("V")){
//                        for(int j =row; j<row+length; j++){
//                            map[j][col].setPlaced(true);
//                            map[j][col].setShipLength(length);
//                            map[j][col].setShipPos(pos);
//                        }
//                    }
//                }
//            }
//        }
//
//        if (type.equals("C")){//looking for cruiser
//            for(int i =0; i< shipList.size(); i++){
//                Ship local = (Ship) shipList.get(i);
//                if(local.type.equals(type)){
//                    int row = local.getRow();
//                    int col = local.getCol();
//                    int length = local.getLength();
//                    String pos = local.getPosition();
//                    if(pos.equals("H")){
//                        for(int j =col; j< col+length; j++){
//                            map[j][col].setPlaced(true);
//                            map[j][col].setShipLength(length);
//                            map[j][col].setShipPos(pos);
//                        }
//                    }
//                    else if(pos.equals("V")){
//                        for(int j =row; j<row+length; j++){
//                            map[j][col].setPlaced(true);
//                            map[j][col].setShipLength(length);
//                            map[j][col].setShipPos(pos);
//                        }
//                    }
//                }
//            }
//            //possibly remove cruiser from list
//        }
//        if (type.equals("A")){//looking for aircraft
//            for(int i =0; i< shipList.size(); i++){
//                Ship local = (Ship) shipList.get(i);
//                if(local.type.equals(type)){
//                    int row = local.getRow();
//                    int col = local.getCol();
//                    int length = local.getLength();
//                    String pos = local.getPosition();
//                    if(pos.equals("H")){
//                        for(int j =col; j< col+length; j++){
//                            map[j][col].setPlaced(true);
//                            map[j][col].setShipLength(length);
//                            map[j][col].setShipPos(pos);
//                        }
//                    }
//                    else if(pos.equals("V")){
//                        for(int j =row; j<row+length; j++){
//                            map[j][col].setPlaced(true);
//                            map[j][col].setShipLength(length);
//                            map[j][col].setShipPos(pos);
//                        }
//                    }
//                }
//            }
//        }
//        if (type.equals("B")){
//            for(int i =0; i< shipList.size(); i++){
//                Ship local = (Ship) shipList.get(i);
//                if(local.type.equals(type)){
//                    int row = local.getRow();
//                    int col = local.getCol();
//                    int length = local.getLength();
//                    String pos = local.getPosition();
//                    if(pos.equals("H")){
//                        for(int j =col; j< col+length; j++){
//                            map[j][col].setPlaced(true);
//                            map[j][col].setShipLength(length);
//                            map[j][col].setShipPos(pos);
//                        }
//                    }
//                    else if(pos.equals("V")){
//                        for(int j =row; j<row+length; j++){
//                            map[j][col].setPlaced(true);
//                            map[j][col].setShipLength(length);
//                            map[j][col].setShipPos(pos);
//                        }
//                    }
//                }
//            }
//        }
//        if (type.equals("S")){
//            for(int i =0; i< shipList.size(); i++){
//                Ship local = (Ship) shipList.get(i);
//                if(local.type.equals(type)){
//                    int row = local.getRow();
//                    int col = local.getCol();
//                    int length = local.getLength();
//                    String pos = local.getPosition();
//                    if(pos.equals("H")){
//                        for(int j =col; j< col+length; j++){
//                            map[j][col].setPlaced(true);
//                            map[j][col].setShipLength(length);
//                            map[j][col].setShipPos(pos);
//                        }
//                    }
//                    else if(pos.equals("V")){
//                        for(int j =row; j<row+length; j++){
//                            map[j][col].setPlaced(true);
//                            map[j][col].setShipLength(length);
//                            map[j][col].setShipPos(pos);
//                        }
//                    }
//                }
//            }
//        }
//
//    }



}
