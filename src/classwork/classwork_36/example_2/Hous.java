package classwork.classwork_36.example_2;

import classwork.classwork_36.ex_4.EnergyClassProvider;

public class Hous {
   private double square;//meters
    private double rentPrice;
    private char energyClass;
    private int rooms;
    private boolean garage;
    private double landArea;//in 100m2
    private int floors;

    public Hous() {
        this.square = -1;
        this.rentPrice = 0;
        this.energyClass = EnergyClassProvider.NOT_DEFINED;
        this.rooms = 0;
        this.garage = false;
        this.landArea = -1;
        this.floors = -1;

    }
    public Hous(double square,double rentPrice,char energyClass,int rooms, boolean garage,double landArea,int floors){
        this.square=square;
        this.rentPrice=rentPrice;
        this.energyClass=energyClass;
        this.rooms=rooms;
        this.garage=garage;
        this.landArea=landArea;
        this.floors=floors;

    }

    public double getSquare() {
        return square;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public char getEnergyClass() {
        return energyClass;
    }

    public int getRooms() {
        return rooms;
    }

    public boolean isGarage() {
        return garage;
    }

    public double getLandArea() {
        return landArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public void setEnergyClass(char energyClass) {
        this.energyClass = energyClass;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public void setLandArea(double landArea) {
        this.landArea = landArea;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}




