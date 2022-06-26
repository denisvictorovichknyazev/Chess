package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import java.util.ArrayList;

public class Controller {
    @FXML
    Button button;
    @FXML
    Button button1;
    @FXML
    Button button2;
    @FXML
    Button button3;
    @FXML
    Button button4;
    @FXML
    Button button5;
    @FXML
    Button button6;
    @FXML
    Button button7;
    @FXML
    Button button8;
    @FXML
    Button button9;
    @FXML
    Button button10;
    @FXML
    Button button11;
    @FXML
    Button button12;
    @FXML
    Button button13;
    @FXML
    Button button14;
    @FXML
    Button button15;
    @FXML
    Button button16;
    @FXML
    Button button17;
    @FXML
    Button button18;
    @FXML
    Button button19;
    @FXML
    Button button20;
    @FXML
    Button button21;
    @FXML
    Button button22;
    @FXML
    Button button23;
    @FXML
    Button button24;
    @FXML
    Button button25;
    @FXML
    Button button26;
    @FXML
    Button button27;
    @FXML
    Button button28;
    @FXML
    Button button29;
    @FXML
    Button button30;
    @FXML
    Button button31;
    @FXML
    Button button32;
    @FXML
    Button button33;
    @FXML
    Button button34;
    @FXML
    Button button35;
    @FXML
    Button button36;
    @FXML
    Button button37;
    @FXML
    Button button38;
    @FXML
    Button button39;
    @FXML
    Button button40;
    @FXML
    Button button41;
    @FXML
    Button button42;
    @FXML
    Button button43;
    @FXML
    Button button44;
    @FXML
    Button button45;
    @FXML
    Button button46;
    @FXML
    Button button47;
    @FXML
    Button button48;
    @FXML
    Button button49;
    @FXML
    Button button50;
    @FXML
    Button button51;
    @FXML
    Button button52;
    @FXML
    Button button53;
    @FXML
    Button button54;
    @FXML
    Button button55;
    @FXML
    Button button56;
    @FXML
    Button button57;
    @FXML
    Button button58;
    @FXML
    Button button59;
    @FXML
    Button button60;
    @FXML
    Button button61;
    @FXML
    Button button62;
    @FXML
    Button button63;
    @FXML
    TextArea info;
    @FXML
    Label check_label;

    final int col = 8;
    Button[][] buts;
    Field board;
    byte check_counter = 1;
    Cell old_position;
    Cell new_position;
    boolean click_flag = false;
    ArrayList<Cell> checks = new ArrayList<Cell>();
    boolean check = false;
    boolean mate = false;
    boolean castling_l_flag = false;
    boolean castling_s_flag = false;
    boolean online_mode = false;
    int possible = 1;

    @FXML
    public void init() {
        check_label.setText("");
        info.clear();
        info.appendText("Начало партии\n");
        buts = new Button[col][col];
        buts[0][0] = button;
        buts[0][1] = button1;
        buts[0][2] = button2;
        buts[0][3] = button3;
        buts[0][4] = button4;
        buts[0][5] = button5;
        buts[0][6] = button6;
        buts[0][7] = button7;
        buts[1][0] = button8;
        buts[1][1] = button9;
        buts[1][2] = button10;
        buts[1][3] = button11;
        buts[1][4] = button12;
        buts[1][5] = button13;
        buts[1][6] = button14;
        buts[1][7] = button15;
        buts[2][0] = button16;
        buts[2][1] = button17;
        buts[2][2] = button18;
        buts[2][3] = button19;
        buts[2][4] = button20;
        buts[2][5] = button21;
        buts[2][6] = button22;
        buts[2][7] = button23;
        buts[3][0] = button24;
        buts[3][1] = button25;
        buts[3][2] = button26;
        buts[3][3] = button27;
        buts[3][4] = button28;
        buts[3][5] = button29;
        buts[3][6] = button30;
        buts[3][7] = button31;
        buts[4][0] = button32;
        buts[4][1] = button33;
        buts[4][2] = button34;
        buts[4][3] = button35;
        buts[4][4] = button36;
        buts[4][5] = button37;
        buts[4][6] = button38;
        buts[4][7] = button39;
        buts[5][0] = button40;
        buts[5][1] = button41;
        buts[5][2] = button42;
        buts[5][3] = button43;
        buts[5][4] = button44;
        buts[5][5] = button45;
        buts[5][6] = button46;
        buts[5][7] = button47;
        buts[6][0] = button48;
        buts[6][1] = button49;
        buts[6][2] = button50;
        buts[6][3] = button51;
        buts[6][4] = button52;
        buts[6][5] = button53;
        buts[6][6] = button54;
        buts[6][7] = button55;
        buts[7][0] = button56;
        buts[7][1] = button57;
        buts[7][2] = button58;
        buts[7][3] = button59;
        buts[7][4] = button60;
        buts[7][5] = button61;
        buts[7][6] = button62;
        buts[7][7] = button63;
        board = new Field();
        board.setCell(0, 0, new Cell(new Tower('b'), 0, 0, 'w'));
        board.setCell(0, 1, new Cell(new Horse('b'), 0, 1, 'b'));
        board.setCell(0, 2, new Cell(new Elephant('b'), 0, 2, 'w'));
        board.setCell(0, 3, new Cell(new Queen('b'), 0, 3, 'b'));
        board.setCell(0, 4, new Cell(new King('b'), 0, 4, 'w'));
        board.setCell(0, 5, new Cell(new Elephant('b'), 0, 5, 'b'));
        board.setCell(0, 6, new Cell(new Horse('b'), 0, 6, 'w'));
        board.setCell(0, 7, new Cell(new Tower('b'), 0, 7, 'b'));
        for (int j = 0; j < col; j++) {
            if ((j + 1) % 2 != 0) {
                board.setCell(1, j, new Cell(new Pawn('b'), 1, j, 'b'));
            } else
                board.setCell(1, j, new Cell(new Pawn('b'), 1, j, 'w'));
        }
        board.setCell(7, 0, new Cell(new Tower('w'), 7, 0, 'b'));
        board.setCell(7, 1, new Cell(new Horse('w'), 7, 1, 'w'));
        board.setCell(7, 2, new Cell(new Elephant('w'), 7, 2, 'b'));
        board.setCell(7, 3, new Cell(new Queen('w'), 7, 3, 'w'));
        board.setCell(7, 4, new Cell(new King('w'), 7, 4, 'b'));
        board.setCell(7, 5, new Cell(new Elephant('w'), 7, 5, 'w'));
        board.setCell(7, 6, new Cell(new Horse('w'), 7, 6, 'b'));
        board.setCell(7, 7, new Cell(new Tower('w'), 7, 7, 'w'));
        for (int j = 0; j < col; j++) {
            if ((j + 1) % 2 != 0) {
                board.setCell(6, j, new Cell(new Pawn('w'), 6, j, 'w'));
            } else
                board.setCell(6, j, new Cell(new Pawn('w'), 6, j, 'b'));
        }
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < col; j++) {
                if ((i + 1) % 2 == 0) {
                    if ((j + 1) % 2 != 0)
                        board.setCell(i, j, new Cell(null, i, j, 'b'));
                    else
                        board.setCell(i, j, new Cell(null, i, j, 'w'));
                } else {
                    if ((j + 1) % 2 == 0)
                        board.setCell(i, j, new Cell(null, i, j, 'b'));
                    else
                        board.setCell(i, j, new Cell(null, i, j, 'w'));
                }
            }

        }

    }

    public void paint() {
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < col; j++) {
                if (board.getCell(i, j).getFigure() == null) {
                    switch (board.getCell(i, j).getColor()) {
                        case 'b': {
                            buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/black_cell.png"))));
                        }
                        break;
                        case 'w': {
                            buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/white_cell.png"))));
                        }
                        break;
                    }
                } else if (board.getCell(i, j).getFigure().getType() == 't') {
                    switch (board.getCell(i, j).getFigure().getColor()) {
                        case 'b': {
                            if (board.getCell(i, j).getColor() == 'b') {
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/black_tower_bc.png"))));
                            } else
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/black_tower_wc.png"))));
                        }
                        break;
                        case 'w': {
                            if (board.getCell(i, j).getColor() == 'b') {
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/white_tower_bc.png"))));
                            } else
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/white_tower_wc.png"))));
                        }
                        break;
                    }
                } else if (board.getCell(i, j).getFigure().getType() == 'h') {
                    switch (board.getCell(i, j).getFigure().getColor()) {
                        case 'b': {
                            if (board.getCell(i, j).getColor() == 'b') {
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/black_horse_bc.png"))));
                            } else
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/black_horse_wc.png"))));
                        }
                        break;
                        case 'w': {
                            if (board.getCell(i, j).getColor() == 'b') {
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/white_horse_bc.png"))));
                            } else
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/white_horse_wc.png"))));
                        }
                        break;
                    }
                } else if (board.getCell(i, j).getFigure().getType() == 'e') {
                    switch (board.getCell(i, j).getFigure().getColor()) {
                        case 'b': {
                            if (board.getCell(i, j).getColor() == 'b') {
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/black_elephant_bc.png"))));
                            } else
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/black_elephant_wc.png"))));
                        }
                        break;
                        case 'w': {
                            if (board.getCell(i, j).getColor() == 'b') {
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/white_elephant_bc.png"))));
                            } else
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/white_elephant_wc.png"))));
                        }
                        break;
                    }

                } else if (board.getCell(i, j).getFigure().getType() == 'q') {
                    switch (board.getCell(i, j).getFigure().getColor()) {
                        case 'b': {
                            if (board.getCell(i, j).getColor() == 'b') {
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/black_queen_bc.png"))));
                            } else
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/black_queen_wc.png"))));
                        }
                        break;
                        case 'w': {
                            if (board.getCell(i, j).getColor() == 'b') {
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/white_queen_bc.png"))));
                            } else
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/white_queen_wc.png"))));
                        }
                        break;
                    }

                } else if (board.getCell(i, j).getFigure().getType() == 'k') {
                    switch (board.getCell(i, j).getFigure().getColor()) {
                        case 'b': {
                            if (board.getCell(i, j).getColor() == 'b') {
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/black_king_bc.png"))));
                            } else
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/black_king_wc.png"))));
                        }
                        break;
                        case 'w': {
                            if (board.getCell(i, j).getColor() == 'b') {
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/white_king_bc.png"))));
                            } else
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/white_king_wc.png"))));
                        }
                        break;
                    }

                } else if (board.getCell(i, j).getFigure().getType() == 'p') {
                    switch (board.getCell(i, j).getFigure().getColor()) {
                        case 'b': {
                            if (board.getCell(i, j).getColor() == 'b') {
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/black_pawn_bc.png"))));
                            } else {
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/black_pawn_wc.png"))));
                            }
                        }
                        break;
                        case 'w': {
                            if (board.getCell(i, j).getColor() == 'b') {
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/white_pawn_bc.png"))));
                            } else {
                                buts[i][j].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/white_pawn_wc.png"))));
                            }
                        }
                        break;
                    }
                }
            }
        }
    }

    public char getCurrent_color() {
        if (check_counter % 2 != 0) {
            return 'w';
        } else return 'b';
    }

    public char getOpposite_color() {
        if (check_counter % 2 != 0) {
            return 'b';
        } else return 'w';
    }

    public boolean contains(Cell c) {
        for (int i = 0; i < checks.size(); i++) {
            if ((c.getFigure() == checks.get(i).getFigure()) && (c.getX() == checks.get(i).getX()) && (c.getY() == checks.get(i).getY()) && (c.getEat() == checks.get(i).getEat()) && (c.getColor() == checks.get(i).getColor())) {
                return true;
            }
        }
        return false;
    }

    public void clearEat(Field board) {
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < col; j++) {
                board.getCell(i, j).setEat(false);
            }
        }
    }

    @FXML
    public void newgameClick(){
      init();
      paint();
    }
    @FXML
    public void newonlinegameClick_w(){
        init();
        paint();
        online_mode = true;
    }

    @FXML
    public void newonlinegameClick(){
       init();
       paint();
       online_mode = true;
//       Server server = new Server(this);
//       Thread myThready = new Thread(server);
//       myThready.start();
        receiving();
    }

    public void receiving(){
        Server server = new Server(this);
        Thread myThread = new Thread(server);
        myThread.start();
       // byte[] data = server.receive();

    }

    @FXML
    public void fieldClick() {
        if (!mate) {
            paint();
            for (byte i = 0; i < col; i++) {
                for (byte j = 0; j < col; j++) {
                    final byte ind1 = i;
                    final byte ind2 = j;
                    buts[i][j].addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent mouseEvent) {
                            Cell buf = board.getCell(ind1, ind2);
                            if ((buf.getFigure() != null) && (getCurrent_color() == buf.getFigure().getColor())) {
                                String image = "";
                                checks.clear();
                                King king = new King(getCurrent_color());
                                switch (buf.getFigure().getType()) {
                                    case 'p': {
                                        if (board.getCell(ind1, ind2).getFigure().getColor() == 'b') {
                                            image = "res/black_pawn_selected.png";
                                            Pawn pawn = new Pawn(getCurrent_color());
                                            old_position = board.getCell(ind1, ind2);
                                            pawn.setCell(old_position);
                                            checks = pawn.check(board);
                                            click_flag = true;
                                        } else {
                                            image = "res/white_pawn_selected.png";
                                            Pawn pawn = new Pawn(getCurrent_color());
                                            old_position = board.getCell(ind1, ind2);
                                            pawn.setCell(old_position);
                                            checks = pawn.check(board);
                                            click_flag = true;
                                        }
                                    }
                                    break;
                                    case 'q': {
                                        if (board.getCell(ind1, ind2).getFigure().getColor() == 'b') {
                                            image = "res/black_queen_selected.png";
                                            Queen queen = new Queen(getCurrent_color());
                                            old_position = board.getCell(ind1, ind2);
                                            queen.setCell(old_position);
                                            checks = queen.check(board);
                                            click_flag = true;
                                        } else {
                                            image = "res/white_queen_selected.png";
                                            Queen queen = new Queen(getCurrent_color());
                                            old_position = board.getCell(ind1, ind2);
                                            queen.setCell(old_position);
                                            checks = queen.check(board);
                                            click_flag = true;
                                        }
                                    }
                                    break;
                                    case 'k': {
                                        if (board.getCell(ind1, ind2).getFigure().getColor() == 'b') {
                                            image = "res/black_king_selected.png";
                                            old_position = board.getCell(ind1, ind2);
                                            king.setCell(old_position);
                                            checks = king.check(board);
                                            castling_l_flag = king.getCastling_l();
                                            castling_s_flag = king.getCastling_s();
                                            click_flag = true;
                                        } else {
                                            image = "res/white_king_selected.png";
                                            old_position = board.getCell(ind1, ind2);
                                            king.setCell(old_position);
                                            checks = king.check(board);
                                            castling_l_flag = king.getCastling_l();
                                            castling_s_flag = king.getCastling_s();
                                            click_flag = true;
                                        }
                                    }
                                    break;
                                    case 'e': {
                                        if (board.getCell(ind1, ind2).getFigure().getColor() == 'b') {
                                            image = "res/black_elephant_selected.png";
                                            Elephant elephant = new Elephant(getCurrent_color());
                                            old_position = board.getCell(ind1, ind2);
                                            elephant.setCell(old_position);
                                            checks = elephant.check(board);
                                            click_flag = true;
                                        } else {
                                            image = "res/white_elephant_selected.png";
                                            Elephant elephant = new Elephant(getCurrent_color());
                                            old_position = board.getCell(ind1, ind2);
                                            elephant.setCell(old_position);
                                            checks = elephant.check(board);
                                            click_flag = true;
                                        }
                                    }
                                    break;
                                    case 't': {
                                        if (board.getCell(ind1, ind2).getFigure().getColor() == 'b') {
                                            image = "res/black_tower_selected.png";
                                            Tower tower = new Tower(getCurrent_color());
                                            old_position = board.getCell(ind1, ind2);
                                            tower.setCell(old_position);
                                            checks = tower.check(board);
                                            click_flag = true;
                                        } else {
                                            image = "res/white_tower_selected.png";
                                            Tower tower = new Tower(getCurrent_color());
                                            old_position = board.getCell(ind1, ind2);
                                            tower.setCell(old_position);
                                            checks = tower.check(board);
                                            click_flag = true;
                                        }
                                    }
                                    break;
                                    case 'h': {
                                        if (board.getCell(ind1, ind2).getFigure().getColor() == 'b') {
                                            image = "res/black_horse_selected.png";
                                            Horse horse = new Horse(getCurrent_color());
                                            old_position = board.getCell(ind1, ind2);
                                            horse.setCell(old_position);
                                            checks = horse.check(board);
                                            click_flag = true;
                                        } else {
                                            image = "res/white_horse_selected.png";
                                            Horse horse = new Horse(getCurrent_color());
                                            old_position = board.getCell(ind1, ind2);
                                            horse.setCell(old_position);
                                            checks = horse.check(board);
                                            click_flag = true;
                                        }
                                    }
                                    break;
                                }
                                Field buf_board = new Field();
                                for (int iter1 = 0; iter1 < col; iter1++) {
                                    for (int iter2 = 0; iter2 < col; iter2++) {
                                        if ((board.getCell(iter1, iter2).getFigure() != null) && (board.getCell(iter1, iter2).getFigure().getType() == 'k') && (getCurrent_color() == board.getCell(iter1, iter2).getFigure().getColor())) {
                                            king.setCell(board.getCell(iter1, iter2));
                                        }
                                        buf_board.setCell(iter1, iter2, board.getCell(iter1, iter2).copy());
                                    }
                                }
                                checks = king.get_Possible(buf.getFigure(), checks, buf_board);
                                buts[ind1][ind2].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream(image))));
                                for (byte i = 0; i < checks.size(); i++) {
                                    if (board.getCell(checks.get(i).getX(), (checks.get(i).getY())).getEat()) {
                                        String color, figure = "", im = "";
                                        if (getCurrent_color() == 'b') {
                                            color = "w";
                                        } else color = "b";
                                        figure += checks.get(i).getFigure().type;
                                        im = "res/" + color + "_" + figure + "_eat" + ".png";
                                        buts[checks.get(i).getX()][checks.get(i).getY()].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream(im))));
                                    } else
                                        buts[checks.get(i).getX()][checks.get(i).getY()].graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("res/selected_cell.png"))));
                                }
                                return;
                            } else if ((click_flag) && (buf.getFigure() == null) && (contains(buf))) {
                                Cell cell = null;
                                check_label.setText("");
                                check = false;
                                Figure f = old_position.getFigure();
                                if ((((buf.getX() == 0) && (buf.getY() == 6)) || ((buf.getX() == 7) && (buf.getY() == 6))) && (f.getType() == 'k') && (castling_s_flag)) {
                                    info.appendText(check_counter+":0-0\n");
                                    check_counter++;
                                    checks.clear();
                                    castling_s_flag = false;
                                    castling_l_flag = false;
                                    click_flag = false;
                                    if (f.getColor() == 'b') {
                                        board.getCell(0, 5).setFigure(board.getCell(0, 7).getFigure());
                                        byte col = board.getCell(old_position.getX(), old_position.getY()).getFigure().getCheck_col();
                                        board.getCell(old_position.getX(), old_position.getY()).getFigure().setCheck_col(col++);
                                        board.getCell(0, 7).setFigure(null);
                                        buf.setFigure(f);
                                        board.getCell(0, 4).setFigure(null);
                                    } else {
                                        board.getCell(7, 5).setFigure(board.getCell(7, 7).getFigure());
                                        byte col = board.getCell(old_position.getX(), old_position.getY()).getFigure().getCheck_col();
                                        board.getCell(old_position.getX(), old_position.getY()).getFigure().setCheck_col(col++);
                                        board.getCell(7, 7).setFigure(null);
                                        buf.setFigure(f);
                                        board.getCell(7, 4).setFigure(null);
                                    }
                                    paint();
                                } else
                                if ((((buf.getX() == 0) && (buf.getY() == 2)) || ((buf.getX() == 7) && (buf.getY() == 2))) && (f.getType() == 'k') && (castling_l_flag)) {
                                    info.appendText(check_counter+":0-0-0\n");
                                    check_counter++;
                                    checks.clear();
                                    castling_s_flag = false;
                                    castling_l_flag = false;
                                    click_flag = false;
                                    if (f.getColor() == 'b') {
                                        board.getCell(0, 3).setFigure(board.getCell(0, 0).getFigure());
                                        byte col = board.getCell(old_position.getX(), old_position.getY()).getFigure().getCheck_col();
                                        board.getCell(old_position.getX(), old_position.getY()).getFigure().setCheck_col(col++);
                                        board.getCell(0, 0).setFigure(null);
                                        buf.setFigure(f);
                                        board.getCell(0, 4).setFigure(null);
                                    } else {
                                        board.getCell(7, 3).setFigure(board.getCell(7, 0).getFigure());
                                        byte col = board.getCell(old_position.getX(), old_position.getY()).getFigure().getCheck_col();
                                        board.getCell(old_position.getX(), old_position.getY()).getFigure().setCheck_col(col++);
                                        board.getCell(7, 0).setFigure(null);
                                        buf.setFigure(f);
                                        board.getCell(7, 4).setFigure(null);
                                    }
                                    paint();
                                }else{
                                    if ((f.getType() == 'k') || (f.getType() == 't')) {
                                        byte col = board.getCell(old_position.getX(), old_position.getY()).getFigure().getCheck_col();
                                        board.getCell(old_position.getX(), old_position.getY()).getFigure().setCheck_col(col++);
                                    }
                                    String figure="",pos1="",pos2="";
                                    buf.setFigure(old_position.getFigure());
                                    switch (old_position.getFigure().getType()){
                                        case 'k':{
                                            figure = "Кр";
                                        }break;
                                        case 'p':{
                                            figure = "п";
                                        }break;
                                        case 'q':{
                                            figure = "Ф";
                                        }break;
                                        case 't':{
                                            figure = "Л";
                                        }break;
                                        case 'h':{
                                            figure = "К";
                                        }break;
                                        case 'e':{
                                            figure = "С";
                                        }break;
                                    }
                                    switch (old_position.getY()){
                                        case 0:{
                                            pos1 = "a";
                                        }break;
                                        case 1:{
                                            pos1 = "b";
                                        }break;
                                        case 2:{
                                            pos1 = "c";
                                        }break;
                                        case 3:{
                                            pos1 = "d";
                                        }break;
                                        case 4:{
                                            pos1 = "e";
                                        }break;
                                        case 5:{
                                            pos1 = "f";
                                        }break;
                                        case 6:{
                                            pos1 = "g";
                                        }break;
                                        case 7:{
                                            pos1 = "h";
                                        }break;
                                    }
                                    cell = old_position.copy();
                                    old_position.setFigure(null);
                                    new_position = buf;
                                    if (new_position.getFigure().getType() == 'p') {
                                        if (new_position.getFigure().pawn_become_a_queen()) {
                                            new_position.getFigure().setType('q');
                                        }
                                    }
                                    switch (new_position.getY()){
                                        case 0:{
                                            pos2 = "a";
                                        }break;
                                        case 1:{
                                            pos2 = "b";
                                        }break;
                                        case 2:{
                                            pos2 = "c";
                                        }break;
                                        case 3:{
                                            pos2 = "d";
                                        }break;
                                        case 4:{
                                            pos2 = "e";
                                        }break;
                                        case 5:{
                                            pos2 = "f";
                                        }break;
                                        case 6:{
                                            pos2 = "g";
                                        }break;
                                        case 7:{
                                            pos2 = "h";
                                        }break;
                                    }
                                    info.appendText(check_counter+":"+figure+" "+pos1+(old_position.getX()+1)+"-"+pos2+(new_position.getX()+1)+"\n");
                                    board.setCell(ind1, ind2, new_position);
                                    paint();

                                    for (int i = 0; i < col; i++) {
                                        for (int j = 0; j < col; j++) {
                                            if ((board.getCell(i, j).getFigure() != null) && (board.getCell(i, j).getFigure().getType() == 'k') && (board.getCell(i, j).getFigure().getColor() == getOpposite_color())) {
                                                King king_op = new King(getOpposite_color());
                                                king_op.setCell(board.getCell(i, j));
                                                if (king_op.getCheck(board, i, j)) {
                                                    check = true;
                                                    break;
                                                }
                                            }
                                        }
                                    }

                                    check_counter++;
                                    checks.clear();
                                    click_flag = false;
                                    for (int i = 0; i < col; i++) {
                                        for (int j = 0; j < col; j++) {
                                            board.getCell(i, j).setEat(false);
                                        }
                                    }
                                }
                                if(online_mode){
                                byte[] data = {(byte)cell.getX(),(byte)old_position.getY(),(byte)new_position.getX(),(byte)new_position.getY(),check_counter};
                                Client client = new Client();
                                client.send(data);
                                receiving();
                                }
                            } else if ((buf.getFigure() != null) && (contains(buf)) && (buf.getEat()) && (getCurrent_color() != buf.getFigure().getColor()) && (buf.getFigure().getType() != 'k')) {
                                Figure f = old_position.getFigure();
                                Cell cell = null;
                                check = false;
                                check_label.setText("");
                                if ((f.getType() == 'k') || (f.getType() == 't')) {
                                    byte col = board.getCell(old_position.getX(), old_position.getY()).getFigure().getCheck_col();
                                    board.getCell(old_position.getX(), old_position.getY()).getFigure().setCheck_col(col++);
                                }
                                buf.setFigure(old_position.getFigure());
                                String figure="",pos1="",pos2="";
                                switch (old_position.getFigure().getType()){
                                    case 'k':{
                                        figure = "Кр";
                                    }break;
                                    case 'p':{
                                        figure = "п";
                                    }break;
                                    case 'q':{
                                        figure = "Ф";
                                    }break;
                                    case 't':{
                                        figure = "Л";
                                    }break;
                                    case 'h':{
                                        figure = "К";
                                    }break;
                                    case 'e':{
                                        figure = "С";
                                    }break;
                                }
                                switch (old_position.getY()){
                                    case 0:{
                                        pos1 = "a";
                                    }break;
                                    case 1:{
                                        pos1 = "b";
                                    }break;
                                    case 2:{
                                        pos1 = "c";
                                    }break;
                                    case 3:{
                                        pos1 = "d";
                                    }break;
                                    case 4:{
                                        pos1 = "e";
                                    }break;
                                    case 5:{
                                        pos1 = "f";
                                    }break;
                                    case 6:{
                                        pos1 = "g";
                                    }break;
                                    case 7:{
                                        pos1 = "h";
                                    }break;
                                }
                                cell = old_position.copy();
                                old_position.setFigure(null);
                                new_position = buf;
                                new_position.setFigure(buf.getFigure());
                                if ((new_position.getFigure() != null) && (new_position.getFigure().getType() == 'p')) {
                                    if (new_position.getFigure().pawn_become_a_queen()) {
                                        new_position.getFigure().setType('q');
                                    }
                                }
                                switch (new_position.getY()){
                                    case 0:{
                                        pos2 = "a";
                                    }break;
                                    case 1:{
                                        pos2 = "b";
                                    }break;
                                    case 2:{
                                        pos2 = "c";
                                    }break;
                                    case 3:{
                                        pos2 = "d";
                                    }break;
                                    case 4:{
                                        pos2 = "e";
                                    }break;
                                    case 5:{
                                        pos2 = "f";
                                    }break;
                                    case 6:{
                                        pos2 = "g";
                                    }break;
                                    case 7:{
                                        pos2 = "h";
                                    }break;
                                }
                                info.appendText(check_counter+":"+figure+" "+pos1+(old_position.getX()+1)+"-"+pos2+(new_position.getX()+1)+"\n");
                                board.setCell(ind1, ind2, new_position);
                                for (int i = 0; i < col; i++) {
                                    for (int j = 0; j < col; j++) {
                                        if ((board.getCell(i, j).getFigure() != null) && (board.getCell(i, j).getFigure().getType() == 'k') && (board.getCell(i, j).getFigure().getColor() == getOpposite_color())) {
                                            King king_op = new King(getOpposite_color());
                                            king_op.setCell(board.getCell(i, j));
                                            if (king_op.getCheck(board, i, j)) {
                                                check = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                paint();
                                check_counter++;
                                checks.clear();
                                click_flag = false;
                                for (int i = 0; i < col; i++) {
                                    for (int j = 0; j < col; j++) {
                                        if ((board.getCell(i, j).getFigure() != null) && (board.getCell(i, j).getFigure().getType() != 'k')) {
                                            board.getCell(i, j).setEat(false);
                                        }
                                    }
                                }
                                if(online_mode){
                                byte[] data = {(byte)cell.getX(),(byte)cell.getY(),(byte)new_position.getX(),(byte)new_position.getY(),check_counter};
                                Client client = new Client();
                                client.send(data);
                                receiving();
                                }
                            }
                            if (check) {
                                possible = 0;
                                String color;
                                check_label.setText("");
                                if(getOpposite_color()=='b'){
                                    color = "Черные";
                                }else
                                    color = "Белые";
                                check_label.setText(color+" объявили шах");
                                ArrayList<Cell> list = new ArrayList<Cell>();
                                King king = new King(getCurrent_color());
                                for (int i = 0; i < col; i++) {
                                    for (int j = 0; j < col; j++) {

                                        if (((board.getCell(i, j).getFigure() != null)) && (board.getCell(i, j).getFigure().getType() == 'k') && (getCurrent_color() == board.getCell(i, j).getFigure().getColor())) {
                                            king.setCell(board.getCell(i, j).copy());
                                            break;
                                        }
                                    }
                                }
                                Field buf_board = new Field();
                                for (int iter1 = 0; iter1 < col; iter1++) {
                                    for (int iter2 = 0; iter2 < col; iter2++) {
                                        buf_board.setCell(iter1, iter2, board.getCell(iter1, iter2).copy());
                                    }
                                }
                                int num = 0;
                                for (int i = 0; i < col; i++) {
                                    for (int j = 0; j < col; j++) {
                                        if ((board.getCell(i, j).getFigure() != null) && (board.getCell(i, j).getFigure().getColor() == getCurrent_color()))
                                            num++;
                                    }
                                }
                                for (int i = 0; i < col; i++) {
                                    if (num != 0) {
                                        for (int j = 0; j < col; j++) {
                                            Figure f = buf_board.getCell(i, j).getFigure();
                                            if ((f != null) && (f.getColor() == getCurrent_color())) {
                                                switch (f.getType()) {
                                                    case 'p': {
                                                        num--;
                                                        clearEat(buf_board);
                                                        list.clear();
                                                        Pawn pawn = new Pawn(getCurrent_color());
                                                        pawn.setCell(buf_board.getCell(i, j));
                                                        list = pawn.check(buf_board);
                                                    }
                                                    break;
                                                    case 'q': {
                                                        num--;
                                                        clearEat(buf_board);
                                                        list.clear();
                                                        Queen queen = new Queen(getCurrent_color());
                                                        queen.setCell(buf_board.getCell(i, j));
                                                        list = queen.check(buf_board);
                                                    }
                                                    break;
                                                    case 'k': {
                                                        num--;
                                                        clearEat(buf_board);
                                                        list.clear();
                                                        list = king.check(buf_board);
                                                    }
                                                    break;
                                                    case 'e': {
                                                        num--;
                                                        clearEat(buf_board);
                                                        list.clear();
                                                        Elephant elephant = new Elephant(getCurrent_color());
                                                        elephant.setCell(buf_board.getCell(i, j));
                                                        list = elephant.check(buf_board);
                                                    }
                                                    break;
                                                    case 't': {
                                                        num--;
                                                        clearEat(buf_board);
                                                        list.clear();
                                                        Tower tower = new Tower(getCurrent_color());
                                                        tower.setCell(buf_board.getCell(i, j));
                                                        list = tower.check(buf_board);
                                                    }
                                                    break;
                                                    case 'h': {
                                                        num--;
                                                        clearEat(buf_board);
                                                        list.clear();
                                                        Horse horse = new Horse(getCurrent_color());
                                                        horse.setCell(buf_board.getCell(i, j));
                                                        list = horse.check(buf_board);
                                                    }
                                                    break;
                                                }
                                                possible += king.get_Possible(f, list, buf_board).size();
                                            }
                                        }
                                    }
                                }
                                if (possible == 0) {
                                    check_label.setText("");
                                    if(getOpposite_color()=='b'){
                                        color = "Черные";
                                    }else
                                        color = "Белые";
                                    check_label.setText(color+" поставили мат."+"\n"+"Партия завершена.");
                                    mate = true;
                                    for (int k = 0; k < col; k++) {
                                        for (int l = 0; l < col; l++) {
                                            buts[k][l].setDisable(true);
                                        }
                                    }
                                }
                            }
                        }
                    });
                }
            }
        }

    }
}