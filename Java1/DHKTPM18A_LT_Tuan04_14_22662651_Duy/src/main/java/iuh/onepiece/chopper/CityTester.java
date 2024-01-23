/*
@class java.lang.String 9/11/2023
@6:35 PM
@version 4.0
@author Huynh Le Minh Duy
@Copyright by ChopperTeam.
*/
package iuh.onepiece.chopper;

public class CityTester {
    public static void main(String[] args) {
        City city = new City("Ho Chi Minh", 10000000, 1000.0, "Vietnam", "Asia");
        System.out.println(city);
        Location location = new Location("Ha Noi", 10000000, 2000.0);
        System.out.println(location);

    }
}
