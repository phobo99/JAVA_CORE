public class Circle extends Geometry implements ICircle {
    private double radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getDiameter() {
        // TODO Auto-generated method stub
        return radius * 2;
    }

    @Override
    public double getPremter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Hinh tron:" + "\nBan kinh = " + radius + "\nDuong kinh = " + getDiameter() + "\nChu vi = " + getPremter() + "\nDien tich = " + getArea();
    }
}
