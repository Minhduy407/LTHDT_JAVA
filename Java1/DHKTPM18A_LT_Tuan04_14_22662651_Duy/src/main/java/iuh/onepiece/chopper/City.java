/*
@class java.lang.String 9/11/2023
@12:57 PM
@version 4.0
@author Huynh Le Minh Duy
@Copyright by ChopperTeam.
*/
package iuh.onepiece.chopper;

public class City extends Location{
    private String country;
    private String continent;
    public City(){
        this("No name",0,0.0,"No country","No continent");
    }
    public City(String name, int population, double area, String country, String continent){
        super(name,population,area);
        setCountry(country);
        setContinent(continent);
    }
    public void setCountry(String country){
        if(country == null || country.trim().equals("")){
            throw new IllegalArgumentException("Country must not be empty");
        }
        this.country = country;
    }
    public void setContinent(String continent){
        if(continent == null || continent.trim().equals("")){
            throw new IllegalArgumentException("Continent must not be empty");
        }
        this.continent = continent;
    }
    public String getCountry(){
        return this.country;
    }
    public String getContinent(){
        return this.continent;
    }
    public String toString(){
        return String.format("%-20s%-20d%-20.2f%-20s%-20s",getName(),getPopulation(),getArea(),getCountry(),getContinent());
    }
}
