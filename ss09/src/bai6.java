class Point2D{
    public double x;
    public double y;
    public Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double  getX(){
        return x;
    }
    public double  getY(){
        return y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public double distanceTo(Point2D p){
        return Math.sqrt(Math.pow(p.x-x,2)+Math.pow(p.y-y,2));
    }
    public void displayPoint(){
        System.out.println("x = "+x+", y = "+y);
    }
}
public class bai6 {
    public static void main(String[] args) {
        Point2D a=new Point2D(1,2);
        Point2D b=new Point2D(3,1);
        System.out.println("Khoảng cách giữa 2 điểm đó là: "+ a.distanceTo(b));
        a.setX(2);
        a.setY(2);
        a.displayPoint();
    }
}
