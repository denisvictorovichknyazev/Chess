package sample;

import java.util.ArrayList;

/**
 * Created by Денис on 08.07.2017.
 */
public class Horse extends Figure {
    Horse(char color) {
        this.color = color;
        this.type = 'h';
    }

    public ArrayList<Cell> check(Field board) {
        ArrayList<Cell> checks = new ArrayList<Cell>();
        int x = cell.getX();
        int y = cell.getY();
        Cell buf;
        if ((x <= 5)&&(y != 0)) {
            buf = board.getCell((x + 2), (y - 1));
            if ((buf.getFigure() == null) || (buf.getFigure().color != color)) {
                if (buf.getFigure() != null) {
                    board.getCell(x + 2, y - 1).setEat(true);
                }
                checks.add(buf);
            }
            }
        if ((x <= 5)&&(y <= 6)) {
            buf = board.getCell((x + 2), (y + 1));
            if ((buf.getFigure() == null) || (buf.getFigure().color != color)) {
                if (buf.getFigure() != null) {
                    board.getCell(x + 2, y + 1).setEat(true);
                }
                checks.add(buf);
            }
        }
        if ((x >= 2)&&(y != 0)) {
            buf = board.getCell((x - 2), (y - 1));
            if ((buf.getFigure() == null) || (buf.getFigure().color != color)) {
                if (buf.getFigure() != null) {
                    board.getCell(x - 2, y - 1).setEat(true);
                }
                checks.add(buf);
            }
        }
        if ((x >= 2)&&(y <= 6)) {
            buf = board.getCell((x - 2), (y + 1));
            if ((buf.getFigure() == null) || (buf.getFigure().color != color)) {
                if (buf.getFigure() != null) {
                    board.getCell(x - 2, y + 1).setEat(true);
                }
                checks.add(buf);
            }
        }
        if ((x <= 6)&&(y >= 2)) {
            buf = board.getCell((x + 1), (y - 2));
            if ((buf.getFigure() == null) || (buf.getFigure().color != color)) {
                if (buf.getFigure() != null) {
                    board.getCell(x + 1, y - 2).setEat(true);
                }
                checks.add(buf);
            }
        }
        if ((x <= 6)&&(y <= 5)) {
            buf = board.getCell((x + 1), (y + 2));
            if ((buf.getFigure() == null) || (buf.getFigure().color != color)) {
                if (buf.getFigure() != null) {
                    board.getCell(x + 1, y + 2).setEat(true);
                }
                checks.add(buf);
            }
        }
        if ((x != 0)&&(y >= 2)) {
            buf = board.getCell((x - 1), (y - 2));
            if ((buf.getFigure() == null) || (buf.getFigure().color != color)) {
                if (buf.getFigure() != null) {
                    board.getCell(x - 1, y - 2).setEat(true);
                }
                checks.add(buf);
            }
        }
        if ((x != 0)&&(y <= 5)) {
            buf = board.getCell((x - 1), (y + 2));
            if ((buf.getFigure() == null) || (buf.getFigure().color != color)) {
                if (buf.getFigure() != null) {
                    board.getCell(x - 1, y + 2).setEat(true);
                }
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
