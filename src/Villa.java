import java.util.ArrayList;
import java.util.List;

public class Villa extends Residence {

    public Villa(String residenceID, float areaInSquareMeter, int numberOfLivingRooms, int numberOfRooms, float price) {
        super(residenceID, areaInSquareMeter, numberOfLivingRooms, numberOfRooms, price);
    }

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
    public List<Villa> getListOfAllVillas(){
        List<Villa> villas= new ArrayList<>();
        for (Residence residence: Residence.getListOfAll()) {
            if(residence.getClass().getSimpleName().equals(this.getClass().getSimpleName())){
                villas.add( (Villa) residence);
            }
        }
        return villas;
    }
    public double getTotalPriceOfVillas(){
        return Residence.getTotalPrices( getListOfAllVillas());
    }
    public double averageAreaOfVillas(){
        return Residence.getAverageAreaOfResidences( getListOfAllVillas());
    }

    public List<Residence> filterByNumberOfRooms(int numberOfRooms){
        return super.filterByNumberOfRooms(getListOfAllVillas(),numberOfRooms);
    }

    public List<Residence> filterByNumberOfLivingRooms(int numberOfLivingRooms){
        return super.filterByNumberOfLivingRooms(getListOfAllVillas(),numberOfLivingRooms);
    }

}
