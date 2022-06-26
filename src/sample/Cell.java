package sample;

/**
 * Created by Денис on 06.07.2017.
 */
public class Cell {
    private Figure figure;
    private int x;
    private int y;
    private boolean eat;
    private char color;
    Cell(){
        this.x = 0;
        this.y = 0;
        this.color = ' ';
        this.eat = false;
        if(figure!=null)
            figure.setCell(this);
    }
    Cell(Figure figure,int x,int y,char color){
        this.figure = figure;
        this.x = x;
        this.y = y;
        this.color = color;
        this.eat = false;
        if(figure!=null)
        figure.setCell(this);
    }
    Cell(Figure figure,int x,int y,char color,boolean eat){
        this.figure = figure;
        this.x = x;
        this.y = y;
        this.color = color;
        this.eat = eat;
        if(figure!=null)
            figure.setCell(this);
    }
    Cell copy(){
        Cell c=new Cell();
        c.figure = this.figure;
        c.x = this.x;
        c.y = this.y;
        c.color = this.color;
        c.eat = this.eat;
        return c;
    }
    void setX(int x){this.x=x;}
    void setY(int y){this.y=y;}
    int getX(){return x;}
    int getY(){return y;}
    public Figure getFigure(){return figure;}
    void setFigure(Figure figure){
        this.figure = figure;
        if (figure!=null){
        figure.setCell(this);
        }
        //else
           // figure.setCell(figure.getCell());
    }
    char getColor(){return color;}
    public void setEat(boolean eat){this.eat = eat;}
    public boolean getEat(){return eat;}
}
