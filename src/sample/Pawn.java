package sample;

import java.util.ArrayList;

/**
 * Created by Денис on 06.07.2017.
 */
public class Pawn extends Figure {
    Pawn(char color) {
        this.color = color;
        this.type = 'p';
    }

    public ArrayList<Cell> check(Field board) {
        ArrayList<Cell> checks = new ArrayList<Cell>();
        int x = cell.getX();
        int y = cell.getY();
        if (((x == 1)&&(color == 'b')) || ((x == 6)&&(color == 'w'))) {
            if (cell.getColor() == 'b') {
                if (color == 'b') {
                    if(board.getCell(x + 1, y).getFigure()==null)
                    checks.add(new Cell(null, x + 1, y, 'w'));
                    if(board.getCell(x + 2, y).getFigure()==null)
                    checks.add(new Cell(null, x + 2, y, 'b'));
                } else {
                    if(board.getCell(x - 1, y).getFigure()==null)
                    checks.add(new Cell(null, x - 1, y, 'w'));
                    if(board.getCell(x - 2, y).getFigure()==null)
                    checks.add(new Cell(null, x - 2, y, 'b'));
                }
            } else {
                if (color == 'b') {
                    if(board.getCell(x + 1, y).getFigure()==null)
                    checks.add(new Cell(null, x + 1, y, 'b'));
                    if(board.getCell(x + 2, y).getFigure()==null)
                    checks.add(new Cell(null, x + 2, y, 'w'));
                } else {
                    if(board.getCell(x - 1, y).getFigure()==null)
                    checks.add(new Cell(null, x - 1, y, 'b'));
                    if(board.getCell(x - 2, y).getFigure()==null)
                    checks.add(new Cell(null, x - 2, y, 'w'));
                }
            }
        } else {
            if (color == 'b') {
                if ((x!=7)&&(board.getCell(x + 1, y).getFigure() == null)) {
                    if (cell.getColor() == 'b') {
                        checks.add(new Cell(null, x + 1, y, 'w'));
                    } else {
                        checks.add(new Cell(null, x + 1, y, 'b'));
                    }
                }
            } else {
                if ((x!=0)&&(board.getCell(x - 1, y).getFigure() == null)) {
                    if (cell.getColor() == 'b') {
                        checks.add(new Cell(null, x - 1, y, 'w'));
                    } else {
                        checks.add(new Cell(null, x - 1, y, 'b'));
                    }
                }
            }
        }
        if (color == 'b') {
            if (y != 7) {
                if ((board.getCell(x + 1, y + 1).getFigure() != null&&(board.getCell(x + 1, y + 1).getFigure().color=='w'))) {
                    if (cell.getColor() == 'b') {
                        checks.add(new Cell(board.getCell((x + 1), (y + 1)).getFigure(), x + 1, y + 1, 'b',true));
                        board.getCell(x + 1, y + 1).setEat(true);
                    } else {
                        checks.add(new Cell(board.getCell((x + 1), (y + 1)).getFigure(), x + 1, y + 1, 'w',true));
                        board.getCell(x + 1, y + 1).setEat(true);
                    }
                }
            }
            if (y != 0) {
                if ((board.getCell(x + 1, y - 1).getFigure() != null)&&((board.getCell(x + 1, y - 1).getFigure().color=='w'))) {
                    if (cell.getColor() == 'b') {
                        checks.add(new Cell(board.getCell((x + 1), (y - 1)).getFigure(), x + 1, y - 1, 'b',true));
                        board.getCell(x + 1, y - 1).setEat(true);
                    } else {
                        checks.add(new Cell(board.getCell((x + 1), (y - 1)).getFigure(), x + 1, y - 1, 'w',true));
                        board.getCell(x + 1, y - 1).setEat(true);
                    }
                }
            }
        } else {
            if (y != 7) {
                if ((board.getCell(x - 1, y + 1).getFigure() != null)&&(board.getCell(x - 1, y + 1).getFigure().color=='b')) {
                    if (cell.getColor() == 'b') {
                        checks.add(new Cell(board.getCell((x - 1), (y + 1)).getFigure(), x - 1, y + 1, 'b',true));
                        board.getCell(x - 1, y + 1).setEat(true);

                    } else {
                        checks.add(new Cell(board.getCell((x - 1), (y + 1)).getFigure(), x - 1, y + 1, 'w',true));
                        board.getCell(x - 1, y + 1).setEat(true);
                    }
                }
            }
            if (y != 0) {
                if ((board.getCell(x - 1, y - 1).getFigure() != null)&&((board.getCell(x - 1, y - 1).getFigure().color=='b'))) {
                    if (cell.getColor() == 'b') {
                        checks.add(new Cell(board.getCell((x - 1), (y - 1)).getFigure(), x - 1, y - 1, 'b',true));
                        board.getCell(x - 1, y - 1).setEat(true);
                    } else {
                        checks.add(new Cell(board.getCell((x - 1), (y - 1)).getFigure(), x - 1, y - 1, 'w',true));
                        board.getCell(x - 1, y - 1).setEat(true);
                    }
                }
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
