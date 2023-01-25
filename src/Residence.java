import java.util.ArrayList;
import java.util.List;

public abstract class Residence {
    private String residenceID;
    private float areaInSquareMeter;
    private int numberOfLivingRooms;
    private int numberOfRooms;
    private double price;
    /**
     * Warning: The static List variable is used to simplify the problem. In real projects it is not advised to be used.
     * This usage causes various problems. The first one is that the garbage collector can not delete the objects in the list.
     * That means some extra solutions to delete this objects from the list should be considered when an object is deleted.
     */
    private static List<Residence> listOfAll =new ArrayList<>();

    public static List<Residence> getListOfAll() {
        return listOfAll;
    }

    public void setListOfAllResidence(List<Residence> listOfAllResidence) {
        this.listOfAll = listOfAllResidence;
    }

    public Residence() {
    }

    public Residence(String residenceID, float areaInSquareMeter, int numberOfLivingRooms, int numberOfRooms, double price) {
        this.residenceID = residenceID;
        this.areaInSquareMeter = areaInSquareMeter;
        this.numberOfLivingRooms = numberOfLivingRooms;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
    }

    /**
     *
     * @param recidences indicates the list of objects of type Residence or of that inherited from Residence.
     * @return total price of all items given in the List of type Residence or the types that inherit Residence.
     * @param <T> indicates the generics types
     */
    public static <T extends Residence> double getTotalPrices(List<T> recidences){
        double totalPrice=0;
        for (Residence r : recidences) {
            totalPrice+=r.getPrice();
        }
        return totalPrice;
    }

    /**
     *
     * @param residences indicates the list of objects of type Residence or of that inherited from Residence.
     * @return the average area of the items given in the List of type Residence or the types that inherit Residence.
     * @param <T> indicates the generics types
     */
    public static <T extends Residence> double getAverageAreaOfResidences(List<T> residences){
        double totalAreaOfResidecences=0;
        for (Residence r : residences) {
            totalAreaOfResidecences+=r.getAreaInSquareMeter();
        }
        return totalAreaOfResidecences/residences.size();
    }

    /**
     *
     * @param residences indicates the list of objects of type Residence or of that inherited from Residence.
     * @param numberOfRooms indicates the number of rooms to be filtered.
     * @return filter the List of Residences or the Object inherited from Residence with respect to numberOfRooms.
     * @param <T> indicates the generics types
     */
    public static <T extends Residence> List<Residence> filterByNumberOfRooms(List<T> residences, int numberOfRooms){
        List<Residence> filteredList=new ArrayList<>();
        for (Residence r : residences) {
            if(r.getNumberOfRooms()==numberOfRooms){
                filteredList.add(r);
            }
        }
       return filteredList;
    }

    /**
     *
     * @param residences indicates the list of objects of type Residence or of that inherited from Residence.
     * @param numberOfLivingRooms indicates the number of living rooms to be filtered.
     * @return filter the List of Residences or the Object inherited from Residence with respect to numberOfLivingRooms.
     * @param <T> indicates the generics types
     */
    public static <T extends Residence> List<Residence> filterByNumberOfLivingRooms(List<T> residences, int numberOfLivingRooms){
        List<Residence> filteredList=new ArrayList<>();
        for (Residence r : residences) {
            if(r.getNumberOfLivingRooms()==numberOfLivingRooms){
                filteredList.add(r);
            }
        }
        return filteredList;
    }
    public double getUnitPricePerMeter(){
        return getPrice()/getAreaInSquareMeter();
    }

    public String getResidenceID() {
        return residenceID;
    }

    public void setResidenceID(String residenceID) {
        this.residenceID = residenceID;
    }

    public float getAreaInSquareMeter() {
        return areaInSquareMeter;
    }

    public void setAreaInSquareMeter(float areaInSquareMeter) {
        this.areaInSquareMeter = areaInSquareMeter;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }

    public void setNumberOfLivingRooms(int numberOfLivingRooms) {
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "residenceID='" + residenceID + '\'' +
                ", areaInSquareMeter=" + areaInSquareMeter +
                ", numberOfLivingRooms=" + numberOfLivingRooms +
                ", numberOfRooms=" + numberOfRooms +
                ", price=" + price +
                '}';
    }


}
