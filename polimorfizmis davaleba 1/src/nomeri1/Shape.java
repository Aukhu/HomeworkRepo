package nomeri1;

public  class Shape {
    private int sideNum ;
    private double length ;

    public Shape(double length, int sideNum) {
        this.length = length;
        this.sideNum = sideNum;
    }



    public int getSideNum() {
        return sideNum;
    }

    public void setSideNum(int sideNum) {
        this.sideNum = sideNum;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double Perimeter(){
        return sideNum*length ;
    }

}
