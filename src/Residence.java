import java.util.ArrayList;
import java.util.List;

public abstract class Residence {
    private String residenceID;
    private float areaInSquareMeter;
    private int numberOfLivingRooms;
    private int numberOfRooms;
    private double price;
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
    public static <T extends Residence> double getTotalPrices(List<T> recidences){
        double totalPrice=0;
        for (Residence r : recidences) {
            totalPrice+=r.getPrice();
        }
        return totalPrice;
    }
    public static <T extends Residence> double getAverageAreaOfResidences(List<T> residences){
        double totalAreaOfResidecences=0;
        for (Residence r : residences) {
            totalAreaOfResidecences+=r.getAreaInSquareMeter();
        }
        return totalAreaOfResidecences/residences.size();
    }
    public static <T extends Residence> List<Residence> filterByNumberOfRooms(List<T> residences, int numberOfRooms){
        List<Residence> filteredList=new ArrayList<>();
        for (Residence r : residences) {
            if(r.getNumberOfRooms()==numberOfRooms){
                filteredList.add(r);
            }
        }
       return filteredList;
    }
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
