package bai5;

public class cylinder extends circle {
    double height;
    public double getVolume(){
        return Math.PI*height*radius*radius;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}

