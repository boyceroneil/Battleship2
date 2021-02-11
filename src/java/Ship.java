public abstract class Ship {
    private  int length;
    private String position;
    private String type;
    private boolean initialization;//saying if on field or not
    private int row;
    private int col;
    private int score;
    Ship(String position, String type, int length){
        this.position = position;
        this.type = type;
        this.length = length;
        this.initialization = false;
    }
    public boolean isInitialization() {
        if(position != "U"){
            return true;
        }

        return initialization;
    }

    public int getLength() {
        return length;
    }

    public String getType() {
        return type;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public String getPosition() {
        return position;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public void setInitialization(boolean initialization) {
        this.initialization = initialization;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }
    public void setArea(int row, int col){
        this.row = row;
        this.col= col;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
