package sample;

import java.util.ArrayList;

/**
 * Created by Денис on 06.07.2017.
 */
public abstract class Figure {
    protected Cell cell;
    protected char type;
    protected char color;
    protected byte check_col;
    public Cell getCell(){return cell;}
    public char getType(){return type;}
    public char getColor(){return color;}
    public void setCell(Cell cell){this.cell = cell;}
    public void setType(char type){this.type=type;}
    public boolean pawn_become_a_queen(){
        int x = cell.getX();
        if(((color == 'b')&&(x == 7))^((color == 'w')&&(x == 0))){
            return true;
        }else
            return false;
    }
    public byte getCheck_col() {
        return check_col;
    }

    public void setCheck_col(byte check_col) {
        this.check_col = check_col;
    }

    public abstract boolean getCastling_l();
    public abstract boolean getCastling_s();
}
