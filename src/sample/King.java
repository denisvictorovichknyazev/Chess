package sample;

import java.util.ArrayList;

/**
 * Created by Денис on 06.07.2017.
 */
public class King extends Figure {
    private boolean castling_s;
    private boolean castling_l;
    King(char color) {
        this.color = color;
        this.type = 'k';
        this.castling_s = false;
        this.castling_l = false;

    }

    private char getOppossitecolor() {
        if (color == 'b')
            return 'w';
        else
            return 'b';
    }
    public boolean getCastling_l(){
        return castling_l;
    }
    public boolean getCastling_s(){
        return castling_s;
    }
    public ArrayList<Cell> get_Possible(Figure f, ArrayList<Cell> list, Field buf_board) {
        Cell buf_old_pos = f.getCell().copy();
        ArrayList<Cell> result = new ArrayList<Cell>();
        Cell buf_f = new Cell();
        boolean flag = false;
        for (int ind = 0; ind < list.size(); ind++) {
            Cell buf_new_pos = buf_board.getCell(list.get(ind).getX(), list.get(ind).getY()).copy();
            buf_new_pos.setFigure(f);
            buf_old_pos.setFigure(null);
            buf_board.setCell(buf_new_pos.getX(), buf_new_pos.getY(), buf_new_pos);
            buf_board.setCell(buf_old_pos.getX(), buf_old_pos.getY(), buf_old_pos);
            if (f.getType() == 'k') {
                this.cell.setX(buf_new_pos.getX());
                this.cell.setY(buf_new_pos.getY());
            }
            if ((list.get(ind).getFigure() != null) && (list.get(ind).getFigure().getColor() != color)) {
                buf_f = list.get(ind).copy();
                flag = true;
            }
            if (this.getCheck(buf_board, this.getCell().getX(), this.getCell().getY())) {
                list.set(ind, null);
            }
            buf_old_pos.setFigure(f);
            buf_new_pos.setFigure(null);
            buf_board.setCell(buf_new_pos.getX(), buf_new_pos.getY(), buf_new_pos);
            buf_board.setCell(buf_old_pos.getX(), buf_old_pos.getY(), buf_old_pos);
            if (f.getType() == 'k') {
                this.cell.setX(buf_old_pos.getX());
                this.cell.setY(buf_old_pos.getY());
            }
            if (list.get(ind) != null) {
                result.add(list.get(ind));
            }
            if (flag) {
                buf_board.setCell(buf_f.getX(), buf_f.getY(), buf_f);
            }
        }
        return result;
    }


    public boolean getCheck(Field board, int x, int y) {
        char op_color = getOppossitecolor();
        ArrayList<Cell> list = new ArrayList<Cell>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((board.getCell(i, j).getFigure() != null) && (color != board.getCell(i, j).getFigure().color)) {
                    switch (board.getCell(i, j).getFigure().getType()) {
                        case 'p': {
                            list.clear();
                            Pawn pawn = new Pawn(op_color);
                            pawn.setCell(board.getCell(i, j));
                            list = pawn.check(board);
                        }
                        break;
                        case 'q': {
                            list.clear();
                            Queen queen = new Queen(op_color);
                            queen.setCell(board.getCell(i, j));
                            list = queen.check(board);
                        }
                        break;
                        case 'e': {
                            list.clear();
                            Elephant elephant = new Elephant(op_color);
                            elephant.setCell(board.getCell(i, j));
                            list = elephant.check(board);
                        }
                        break;
                        case 't': {
                            list.clear();
                            Tower tower = new Tower(op_color);
                            tower.setCell(board.getCell(i, j));
                            list = tower.check(board);
                        }
                        break;
                        case 'h': {
                            list.clear();
                            Horse horse = new Horse(op_color);
                            horse.setCell(board.getCell(i, j));
                            list = horse.check(board);
                        }
                        break;
                    }
                    for (int ind = 0; ind < list.size(); ind++)
                        if ((list.get(ind) == board.getCell(x, y)) && (list.get(ind).getEat())) {
                            return true;
                        }
                }
            }
        }
        return false;
    }


    public ArrayList<Cell> check(Field board) {
        ArrayList<Cell> checks = new ArrayList<Cell>();
        int x = cell.getX();
        int y = cell.getY();
        if (color == 'b') {
            Figure buf = board.getCell(0, 7).getFigure();
            if ((buf != null) && (buf.getType() == 't') && (buf.getColor()==color) && (!getCheck(board, x, y)) && ((this.getCheck_col() == 0) && (buf.getCheck_col() == 0)) && ((board.getCell(0, 5).getFigure() == null) && (board.getCell(0, 6).getFigure() == null))) {
                if (!getCheck(board, x, (y+2))) {
                    checks.add(board.getCell(x, (y+2)));
                    castling_s = true;
                }
            }else castling_s = false;
        }else{
            Figure buf = board.getCell(7, 7).getFigure();
            if ((buf != null) && (buf.getType() == 't') && (buf.getColor()==color) && (!getCheck(board, x, y)) && ((this.getCheck_col() == 0) && (buf.getCheck_col() == 0)) && ((board.getCell(7, 5).getFigure() == null) && (board.getCell(7, 6).getFigure() == null))) {
                if (!getCheck(board, x ,(y+2))){
                    checks.add(board.getCell(x, (y+2)));
                    castling_s = true;
                }
            }else castling_s = false;
        }

        if (color == 'b') {
            Figure buf = board.getCell(0, 0).getFigure();
            if ((buf != null) && (buf.getType() == 't') && (buf.getColor()==color) && (!getCheck(board, x, y)) && ((this.getCheck_col() == 0) && (buf.getCheck_col() == 0)) && (((board.getCell(0, 1).getFigure() == null))&&(board.getCell(0, 2).getFigure() == null) && (board.getCell(0, 3).getFigure() == null))) {
                if (!getCheck(board, x, (y-2))) {
                    checks.add(board.getCell(x, (y-2)));
                    castling_l = true;
                }
            }else castling_l = false;
        }else{
            Figure buf = board.getCell(7, 7).getFigure();
            if ((buf != null) && (buf.getType() == 't') && (buf.getColor()==color) && (!getCheck(board, x, y)) && ((this.getCheck_col() == 0) && (buf.getCheck_col() == 0)) && (((board.getCell(7, 1).getFigure() == null))&&(board.getCell(7, 2).getFigure() == null) && (board.getCell(7, 3).getFigure() == null))) {
                if (!getCheck(board, x ,(y-2))){
                    checks.add(board.getCell(x, (y-2)));
                    castling_l = true;
                }
            }else castling_l = false;
        }

        if (((x + 1) < 8) && (!getCheck(board, (x + 1), y))) {
            if (board.getCell((x + 1), y).getFigure() != null) {
                if (color != board.getCell((x + 1), y).getFigure().getColor()) {
                    board.getCell((x + 1), y).setEat(true);
                    checks.add(board.getCell((x + 1), y));
                }
            } else
                checks.add(board.getCell((x + 1), y));
        }
        if (((x - 1) > -1) && (!getCheck(board, (x - 1), y))) {
            if (board.getCell((x - 1), y).getFigure() != null) {
                if (color != board.getCell((x - 1), y).getFigure().color) {
                    board.getCell((x - 1), y).setEat(true);
                    checks.add(board.getCell((x - 1), y));
                }
            } else
                checks.add(board.getCell((x - 1), y));
        }
        if (((y + 1) < 8) && (!getCheck(board, x, (y + 1)))) {
            if (board.getCell(x, (y + 1)).getFigure() != null) {
                if (color != board.getCell(x, (y + 1)).getFigure().color) {
                    board.getCell(x, (y + 1)).setEat(true);
                    checks.add(board.getCell(x, (y + 1)));
                }
            } else
                checks.add(board.getCell(x, (y + 1)));
        }
        if (((y - 1) > -1) && (!getCheck(board, x, (y - 1)))) {
            if (board.getCell(x, (y - 1)).getFigure() != null) {
                if (color != board.getCell(x, (y - 1)).getFigure().color) {
                    board.getCell(x, (y - 1)).setEat(true);
                    checks.add(board.getCell(x, (y - 1)));
                }
            } else
                checks.add(board.getCell(x, (y - 1)));
        }
        if (((x + 1) < 8) && ((y + 1) < 8) && (!getCheck(board, (x + 1), (y + 1)))) {
            if (board.getCell((x + 1), (y + 1)).getFigure() != null) {
                if (color != board.getCell((x + 1), (y + 1)).getFigure().color) {
                    board.getCell((x + 1), (y + 1)).setEat(true);
                    checks.add(board.getCell((x + 1), (y + 1)));
                }
            } else
                checks.add(board.getCell((x + 1), (y + 1)));
        }
        if (((x + 1) < 8) && ((y - 1) > -1) && (!getCheck(board, (x + 1), (y - 1)))) {
            if (board.getCell((x + 1), (y - 1)).getFigure() != null) {
                if (color != board.getCell((x + 1), (y - 1)).getFigure().color) {
                    board.getCell((x + 1), (y - 1)).setEat(true);
                    checks.add(board.getCell((x + 1), (y - 1)));
                }
            } else
                checks.add(board.getCell((x + 1), (y - 1)));
        }
        if (((x - 1) > -1) && ((y + 1) < 8) && (!getCheck(board, (x - 1), (y + 1)))) {
            if (board.getCell((x - 1), (y + 1)).getFigure() != null) {
                if (color != board.getCell((x - 1), (y + 1)).getFigure().color) {
                    board.getCell((x - 1), (y + 1)).setEat(true);
                    checks.add(board.getCell((x - 1), (y + 1)));
                }
            } else
                checks.add(board.getCell((x - 1), (y + 1)));
        }
        if (((x - 1) > -1) && ((y - 1) > -1) && (!getCheck(board, (x - 1), (y - 1)))) {
            if (board.getCell((x - 1), (y - 1)).getFigure() != null) {
                if (color != board.getCell((x - 1), (y - 1)).getFigure().color) {
                    board.getCell((x - 1), (y - 1)).setEat(true);
                    checks.add(board.getCell((x - 1), (y - 1)));
                }
            } else
                checks.add(board.getCell((x - 1), (y - 1)));
        }
        return checks;
    }
}
