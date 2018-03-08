package IO.Library;

public class HinhChuNhat implements Iterface_Hinh {
	private double dai;
    private double rong;
    private String color;

    public HinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }
    public double findarea(){
        return dai*rong;
    }
    public double primeter(){
        return ((dai+rong)*2);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }	

}
