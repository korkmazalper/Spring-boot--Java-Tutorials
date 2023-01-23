import java.util.ArrayList;
import java.util.List;

public class SummerHouse extends Residence {

    public SummerHouse(String residenceID, float areaInSquareMeter, int numberOfLivingRooms, int numberOfRooms, float price) {
        super(residenceID, areaInSquareMeter, numberOfLivingRooms, numberOfRooms, price);
    }

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
    public List<SummerHouse> getListOfAllSummerHouses(){
        List<SummerHouse> summerHouses= new ArrayList<>();
        for (Residence residence: Residence.getListOfAll()) {
            if(residence.getClass().getSimpleName().equals(this.getClass().getSimpleName())){
                summerHouses.add( (SummerHouse) residence);
            }
        }
        return summerHouses;
    }
    public double getTotalPriceOfSummerHouses(){
        return Residence.getTotalPrices( getListOfAllSummerHouses());
    }
    public double averageAreaOfSummerHouses(){
        return Residence.getAverageAreaOfResidences( getListOfAllSummerHouses());
    }

    public List<Residence> filterByNumberOfRooms(int numberOfRooms){
        return super.filterByNumberOfRooms(getListOfAllSummerHouses(),numberOfRooms);
    }

    public List<Residence> filterByNumberOfLivingRooms(int numberOfLivingRooms){
        return super.filterByNumberOfLivingRooms(getListOfAllSummerHouses(),numberOfLivingRooms);
    }



}
