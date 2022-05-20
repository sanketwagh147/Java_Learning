class Shape {


    public static void main(String[] args) {
        
        Rectangle rec = new Rectangle(1, 2, 2, 4);
    }


    private int x;
    private int y;


    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int addition(int x, int y){
        return x + y;
    }

    
}

class Rectangle extends Shape{
    private int length;
    private int width;


    public Rectangle(int x, int y){
        this(x, y, 0, 0);
    }


    public Rectangle(int x, int y, int length, int width) {
        super(x, y);
        this.length = length;
        this.width = width;
    }


}