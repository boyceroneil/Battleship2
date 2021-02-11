public class Areas {
    private char t;
    private int row;
    private int col;
    private Ship ship;
    public Areas(int row, int col){
        t= '~';
        this.row = row;
        this.col = col;
    }
    public void placeShip(Ship ship){
        this.ship = ship;
//        if(ship.getType().equals("C")){//Cruiser
//            t='C';
//        }
//        else{
            t = ship.getType().charAt(0);
        //}
    }
    public void mark(){
        t ='H';
    }
    public void missed(){
        t='M';
    }

    public Ship getShip() {
        return ship;
    }

    public char getT() {
        return t;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setT(char t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return String.valueOf(t);
    }
}
