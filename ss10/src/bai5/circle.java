package bai5;

public class circle {
    double radius;
    public double getArea(){
        return  radius * radius*Math.PI;
    }
    double getRadius(){
        return radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
}
