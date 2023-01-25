import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class House extends Residence {

    public House(String residenceID, float areaInSquareMeter, int numberOfLivingRooms, int numberOfRooms, float price) {
        super(residenceID, areaInSquareMeter, numberOfLivingRooms, numberOfRooms, price);
    }

    /**
     *
     * @param residenceID indicates the unique ID of the residence.
     * @param areaInSquareMeter indicates the area of the house objects.
     * @param numberOfLivingRooms indicates the number of the living rooms of the house objects.
     * @param numberOfRooms indicates the number of rooms of the house.
     * @param price indicated the prices of the house.
     * @return the created House object.
     */
    public static House createHouse(String residenceID, float areaInSquareMeter, int numberOfLivingRooms, int numberOfRooms, float price) {
        if (areaInSquareMeter > 0 && numberOfRooms > 0 && price > 0 && numberOfLivingRooms >= 0) {
            House house = new House(residenceID, areaInSquareMeter, numberOfLivingRooms, numberOfRooms, price);
            if (house != null) {
                getListOfAll().add(house);
            }
            return house;
        }
        return null;
    }

    /**
     *
     * @return the list of all house objects.
     */
    public List<Residence> getListOfAllHouses(){
        return Residence.getListOfAll().stream().filter(x -> x.getClass().getSimpleName().equals("House")).collect(Collectors.toList());
    }

    /**
     *
     * @return the total price of all house objects.
     */
    public double getTotalPriceOfHouses(){
        return Residence.getTotalPrices( getListOfAllHouses());
    }

    /**
     *
     * @return average area of all houses.
     */
    public double averageAreaOfHouses(){
        return Residence.getAverageAreaOfResidences( getListOfAllHouses());
    }

    /**
     *
     * @param numberOfRooms indicates the filter to be applied to limit the number of rooms of the houses to be selected.
     * @return the list of the houses having specified number of rooms in the parameter of the method.
     */

    public List<Residence> filterByNumberOfRooms(int numberOfRooms){
        return super.filterByNumberOfRooms(getListOfAllHouses(),numberOfRooms);
    }

    /**
     *
     * @param numberOfLivingRooms indicates the filter to be applied to limit the number of living rooms of the houses to be selected.
     * @return the list of the houses having specified number of living rooms in the parameter of the method.
     */
    public List<Residence> filterByNumberOfLivingRooms(int numberOfLivingRooms){
        return super.filterByNumberOfLivingRooms(getListOfAllHouses(),numberOfLivingRooms);
    }



}
