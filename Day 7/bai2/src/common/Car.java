package common;

public class Car extends Vehicle {
    private int seatCnt;
    private int cc;

    public int getSeatCnt() {
        return seatCnt;
    }

    public void setSeatCnt(int seatCnt) {
        this.seatCnt = seatCnt;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getManufacturer() {
        return super.getManufacturer();
    }

    @Override
    public int getRelease() {
        return super.getRelease();
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public void setManufacturer(String manufacturer) {
        super.setManufacturer(manufacturer);
    }

    @Override
    public void setRelease(int release) {
        super.setRelease(release);
    }
}