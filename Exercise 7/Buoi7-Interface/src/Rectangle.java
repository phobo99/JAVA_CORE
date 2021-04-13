public class Rectangle extends Geometry implements IRectangle {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPremter() {
        // TODO Auto-generated method stub
        return (width + length) * 2;
    }

    @Override
    public double getDiagonal() {
        // TODO Auto-generated method stub
        return (float) Math.sqrt(width * width + length * length);
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return (width + length) * 2;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Hinh chu nhat: "+"\nChieu dai = "+length+"\nChieu rong = "+width+"\nDuong cheo = "+getDiagonal()+"\nChu vi = "+getPremter()+"\nDien tich = "+getArea();
    }
}
