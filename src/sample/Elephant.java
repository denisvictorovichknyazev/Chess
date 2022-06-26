package sample;

import java.util.ArrayList;

/**
 * Created by Денис on 06.07.2017.
 */
public class Elephant extends Figure{
    Elephant(char color){
        this.color = color;
        this.type = 'e';
    }
    public ArrayList<Cell> check(Field board) {
        ArrayList<Cell> checks = new ArrayList<Cell>();
        Cell buf;
        boolean flag = true,flag1 = true,flag2 = true,flag3 = true;
        int x = cell.getX();
        int y = cell.getY();
        for(int i=1;i<7;i++){
            if((flag)&&((x-i)>-1)&&((y-i)>-1)){
                buf = board.getCell((x-i),(y-i));
                if(buf.getFigure()!=null){
                    if(buf.getFigure().color!=color){
                        buf.setEat(true);
                        checks.add(buf);
                    }
                    flag = false;
                }else
                    checks.add(buf);
            }
            if((flag1)&&((x+i)<8)&&((y+i)<8)){
                buf = board.getCell((x+i),(y+i));
                if(buf.getFigure()!=null){
                    if(buf.getFigure().color!=color){
                        buf.setEat(true);
                        checks.add(buf);
                    }
                    flag1 = false;
                }else
                    checks.add(buf);
            }
            if((flag2)&&((x+i)<8)&&((y-i)>-1)){
                buf = board.getCell((x+i),(y-i));
                if(buf.getFigure()!=null){
                    if(buf.getFigure().color!=color){
                        buf.setEat(true);
                        checks.add(buf);
                    }
                    flag2 = false;
                }else
                    checks.add(buf);
            }
            if((flag3)&&((x-i)>-1)&&((y+i)<8)){
                buf = board.getCell((x-i),(y+i));
                if(buf.getFigure()!=null){
                    if(buf.getFigure().color!=color){
                        buf.setEat(true);
                        checks.add(buf);
                    }
                    flag3 = false;
                }else
                    checks.add(buf);
            }
        }
        return checks;
    }

    @Override
    public boolean getCastling_l() {
        return false;
    }
    @Override
    public boolean getCastling_s() {
        return false;
    }
}
