package Rectangle_Point;

public class Rectangle {

    public Point bottomLeft;
    public Point topRight;


    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public Rectangle(Point bottomLeft, int width, int height) {
        this.bottomLeft = bottomLeft;
        this.topRight = new Point(bottomLeft.getX() + width, bottomLeft.getY() + height);
    }

    public Rectangle(){

    }

    public static int getArea(Rectangle rectangle){
        int height=0;
        int width = 0;

        height = rectangle.topRight.getY() - rectangle.bottomLeft.getY();
        width = rectangle.topRight.getX() - rectangle.bottomLeft.getX();


        int area=height * width;
        return area;
    }

    public static int getPerimeter(Rectangle rectangle){
        int perimeter = 0;
        perimeter = (rectangle.getHeight(rectangle)*2)+(rectangle.getWidth(rectangle)*2);

        return perimeter;
    }

    public int getHeight(Rectangle rectangle) {
        return rectangle.topRight.getY()-rectangle.bottomLeft.getY();
    }

    public int getWidth(Rectangle rectangle) {
        return rectangle.topRight.getX()-rectangle.bottomLeft.getX();
    }

    public void move(int deltaX, int deltaY) {
        this.bottomLeft.setX(bottomLeft.getX()+deltaX);
        this.bottomLeft.setY(bottomLeft.getY()+deltaY);

        this.topRight.setX(bottomLeft.getX()+deltaX);
        this.topRight.setY(bottomLeft.getY()+deltaY);
    }

    public String toString(){

        System.out.println("The Rectangle_Point.Rectangle: ");

        System.out.println(("("+bottomLeft.getX()) + ", "+bottomLeft.getY() + ")" +"("+topRight.getX()+","+topRight.getY()+")");

        String rec =  "The Rectangle_Point.Rectangle: "+(("("+bottomLeft.getX()) + ", "+bottomLeft.getY() + ")" +"("+topRight.getX()+","+topRight.getY()+")");
        return rec;
    }

    public static void main(String[] args){
        Point a = new Point(0,0);
        Point b = new Point(4,4);
        Rectangle rectangle = new Rectangle(a,b);
        Rectangle rectangle2 = new Rectangle(a,4,5);

        System.out.println(rectangle2.toString());

        System.out.println("area: "+getArea(rectangle2));
        System.out.println("area: "+getArea(rectangle));

        int recPerim=0;
        recPerim = getPerimeter(rectangle);

        System.out.println("perim: "+getPerimeter(rectangle));

        System.out.println(rectangle.toString());
    }
}
