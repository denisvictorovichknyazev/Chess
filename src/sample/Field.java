package sample;

/**
 * Created by Денис on 06.07.2017.
 */
public class Field {
    private Cell[][] field;
    Field(){
        field = new Cell[8][8];
    }
    public void setCell(int i,int j,Cell c){field[i][j] = c;}
    public Cell getCell(int i,int j){return field[i][j];}
}
