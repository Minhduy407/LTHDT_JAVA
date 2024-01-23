/*
@class java.lang.String 9/11/2023
@12:57 PM
@version 4.0
@author Huynh Le Minh Duy
@Copyright by ChopperTeam.
*/
package iuh.onepiece.chopper;

public class Location {
    private String name;
    private int population;
    private double area;

    public Location(){
        this("No name",0,0.0);
    }
    public Location(String name, int population, double area){
        setName(name);
        setPopulation(population);
        setArea(area);
    }
    public void setName(String name){
        if(name == null || name.trim().equals("")){
            throw new IllegalArgumentException("Name must not be empty");
        }
        this.name = name;
    }
    public void setPopulation(int population){
        if(population < 0){
            throw new IllegalArgumentException("Population must be greater than or equal to 0");
        }
        this.population = population;
    }
    public void setArea(double area){
        if(area < 0){
            throw new IllegalArgumentException("Area must be greater than or equal to 0");
        }
        this.area = area;
    }
    protected String getName(){
        return this.name;
    }
    public int getPopulation(){
        return this.population;
    }
    public double getArea(){
        return this.area;
    }
    public String toString(){
        return String.format("%-20s%-20d%-20.2f",getName(),getPopulation(),getArea());
    }
}
