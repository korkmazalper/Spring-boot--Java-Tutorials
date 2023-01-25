import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Villa extends Residence {

    public Villa(String residenceID, float areaInSquareMeter, int numberOfLivingRooms, int numberOfRooms, float price) {
        super(residenceID, areaInSquareMeter, numberOfLivingRooms, numberOfRooms, price);
    }
    /**
     *
     * @param residenceID indicates the unique ID of the residence.
     * @param areaInSquareMeter indicates the area of the villa objects.
     * @param numberOfLivingRooms indicates the number of the living rooms of the villa objects.
     * @param numberOfRooms indicates the number of rooms of the villa.
     * @param price indicated the prices of the villa.
     * @return the created House object.
     */
    public static Villa createVilla(String residenceID, float areaInSquareMeter, int numberOfLivingRooms, int numberOfRooms, float price) {
        if (areaInSquareMeter > 0 && numberOfRooms > 0 && price > 0 && numberOfLivingRooms >= 0) {
            Villa villa = new Villa(residenceID, areaInSquareMeter, numberOfLivingRooms, numberOfRooms, price);
            if (villa != null) {
                getListOfAll().add(villa);
            }
            return villa;
        }
        return null;
    }
    /**
     *
     * @return the list of all villas.
     */
    public List<Residence> getListOfAllVillas(){
       return Residence.getListOfAll().stream().filter(x -> x.getClass().getSimpleName().equals("Villa")).collect(Collectors.toList());
    }
    /**
     *
     * @return the total price of all villas.
     */
    public double getTotalPriceOfVillas(){
        return Residence.getTotalPrices( getListOfAllVillas());
    }
    /**
     *
     * @return average area of all villas.
     */
    public double averageAreaOfVillas(){
        return Residence.getAverageAreaOfResidences( getListOfAllVillas());
    }
    /**
     *
     * @param numberOfRooms indicates the filter to be applied to limit the number of rooms of the villas to be selected.
     * @return the list of the villas having specified number of rooms in the parameter of the method.
     */

    public List<Residence> filterByNumberOfRooms(int numberOfRooms){
        return super.filterByNumberOfRooms(getListOfAllVillas(),numberOfRooms);
    }
    /**
     *
     * @param numberOfLivingRooms indicates the filter to be applied to limit the number of living rooms of the villas to be selected.
     * @return the list of the villas having specified number of living rooms in the parameter of the method.
     */
    public List<Residence> filterByNumberOfLivingRooms(int numberOfLivingRooms){
        return super.filterByNumberOfLivingRooms(getListOfAllVillas(),numberOfLivingRooms);
    }

}
