package common;

public class Moto extends Vehicle {
    private int cc;

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