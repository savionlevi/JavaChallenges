package Rectangle_Point;

public class Point extends Rectangle{

        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX(){
            return this.x;

        }

        public int getY(){
            return this.y;

        }

        public void setX(int x){
            this.x=x;

        }

        public void  setY(int y){
            this.y = y;

        }

        public static void replaceXBetweenPoints(Point a, Point b) {
            int temp = a.getX();
            a.setX(b.getX());
            b.setX(temp);
        }

        public String toString(){
            return this.x+","+this.y;
        }

        public static void main(String[] args){
            Point coordinateOne = new Point(1,1);

            Point PointA = new Point(43,7);
            Point PointB = new Point(5,5);
            replaceXBetweenPoints(PointA, PointB);

            System.out.println(PointA.toString());
            System.out.println(PointB.toString());


        }
    }



