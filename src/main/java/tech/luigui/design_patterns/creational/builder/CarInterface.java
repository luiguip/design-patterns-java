package tech.luigui.design_patterns.creational.builder;

public interface CarInterface {
    public void setSeats(int seats) ;
    public int getSeats() ;
    public void setEngine(double engine) ;
    public double getEngine() ;
    public void setTripComputer(boolean tripComputer) ;
    public boolean getTripComputer() ;
    public void setGps(boolean gps) ;
    public boolean getGps() ;
}
