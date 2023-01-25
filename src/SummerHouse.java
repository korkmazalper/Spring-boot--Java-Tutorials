import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SummerHouse extends Residence {

    public SummerHouse(String residenceID, float areaInSquareMeter, int numberOfLivingRooms, int numberOfRooms, float price) {
        super(residenceID, areaInSquareMeter, numberOfLivingRooms, numberOfRooms, price);
    }
    /**
     *
     * @param residenceID indicates the unique ID of the residence.
     * @param areaInSquareMeter indicates the area of the summer house objects.
     * @param numberOfLivingRooms indicates the number of the living rooms of the summer house objects.
     * @param numberOfRooms indicates the number of rooms of the summer house.
     * @param price indicated the prices of the summer house.
     * @return the created summer house object.
     */
    public static SummerHouse createHouse(String residenceID, float areaInSquareMeter, int numberOfLivingRooms, int numberOfRooms, float price) {
        if (areaInSquareMeter > 0 && numberOfRooms > 0 && price > 0 && numberOfLivingRooms >= 0) {
            SummerHouse house = new SummerHouse(residenceID, areaInSquareMeter, numberOfLivingRooms, numberOfRooms, price);
            if (house != null) {
                getListOfAll().add(house);
            }
            return house;
        }
        return null;
    }
    /**
     *
     * @return the list of all summer houses.
     */
    public List<Residence> getListOfAllSummerHouses(){
        return Residence.getListOfAll().stream().filter(x -> x.getClass().getSimpleName().equals("SummerHouse")).collect(Collectors.toList());
    }
    /**
     *
     * @return the total price of all summer houses.
     */
    public double getTotalPriceOfSummerHouses(){
        return Residence.getTotalPrices( getListOfAllSummerHouses());
    }
    /**
     *
     * @return average area of all summer houses.
     */
    public double averageAreaOfSummerHouses(){
        return Residence.getAverageAreaOfResidences( getListOfAllSummerHouses());
    }
    /**
     *
     * @param numberOfRooms indicates the filter to be applied to limit the number of rooms of the summer houses to be selected.
     * @return the list of the summer houses having specified number of rooms in the parameter of the method.
     */
    public List<Residence> filterByNumberOfRooms(int numberOfRooms){
        return super.filterByNumberOfRooms(getListOfAllSummerHouses(),numberOfRooms);
    }
    /**
     *
     * @param numberOfLivingRooms indicates the filter to be applied to limit the number of living rooms of the summer houses to be selected.
     * @return the list of the summer houses having specified number of living rooms in the parameter of the method.
     */
    public List<Residence> filterByNumberOfLivingRooms(int numberOfLivingRooms){
        return super.filterByNumberOfLivingRooms(getListOfAllSummerHouses(),numberOfLivingRooms);
    }



}
