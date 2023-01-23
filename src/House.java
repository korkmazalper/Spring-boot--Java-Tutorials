import java.util.ArrayList;
import java.util.List;

public class House extends Residence {

    public House(String residenceID, float areaInSquareMeter, int numberOfLivingRooms, int numberOfRooms, float price) {
        super(residenceID, areaInSquareMeter, numberOfLivingRooms, numberOfRooms, price);
    }

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
    public List<House> getListOfAllHouses(){
        List<House> houses= new ArrayList<>();
        for (Residence residence: Residence.getListOfAll()) {
            if(residence.getClass().getSimpleName().equals(this.getClass().getSimpleName())){
                houses.add( (House) residence);
            }
        }
        return houses;
    }
    public double getTotalPriceOfHouses(){
        return Residence.getTotalPrices( getListOfAllHouses());
    }
    public double averageAreaOfHouses(){
        return Residence.getAverageAreaOfResidences( getListOfAllHouses());
    }

    public List<Residence> filterByNumberOfRooms(int numberOfRooms){
        return super.filterByNumberOfRooms(getListOfAllHouses(),numberOfRooms);
    }

    public List<Residence> filterByNumberOfLivingRooms(int numberOfLivingRooms){
        return super.filterByNumberOfLivingRooms(getListOfAllHouses(),numberOfLivingRooms);
    }



}
