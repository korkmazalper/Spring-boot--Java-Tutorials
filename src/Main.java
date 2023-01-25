/**
 * @author korkmaz alper
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        House house1 = House.createHouse("1", 12, 3, 2, 1);
        House house2 = House.createHouse("2", 24, 1, 3, 2);
        House house3 = House.createHouse("3", 36, 0, 1, 3);
        Villa villa1 = Villa.createVilla("4", 432, 3, 5, 2);
        Villa villa2 = Villa.createVilla("5", 432, 3, 5, 2);
        Villa villa3 = Villa.createVilla("6", 432, 2, 6, 2);
        System.out.println(house1.toString());
        System.out.println(Residence.getListOfAll());
        System.out.println(house1.getListOfAllHouses());
        System.out.println(villa1.getListOfAllVillas());
        System.out.println("================================");
        System.out.println(house1.getTotalPriceOfHouses());
        System.out.println(house1.averageAreaOfHouses());
        System.out.println(house1.filterByNumberOfRooms(2));
        System.out.println(house1.filterByNumberOfLivingRooms(0));
        System.out.println("================================");
        System.out.println("================================");
        System.out.println(villa1.getTotalPriceOfVillas());
        System.out.println(villa1.averageAreaOfVillas());
        System.out.println(villa1.filterByNumberOfRooms(5));
        System.out.println(villa1.filterByNumberOfLivingRooms(3));
        System.out.println("================================");
        SummerHouse summerHouse1 = SummerHouse.createHouse("s1", 76, 2, 2, 5);
        SummerHouse summerHouse2 = SummerHouse.createHouse("s2", 76, 2, 1, 5);
        SummerHouse summerHouse3 = SummerHouse.createHouse("s3", 76, 3, 1, 5);
        System.out.println("================================");
        System.out.println(summerHouse3.getTotalPriceOfSummerHouses());
        System.out.println(summerHouse3.averageAreaOfSummerHouses());
        System.out.println(summerHouse3.filterByNumberOfRooms(2));
        System.out.println(summerHouse3.filterByNumberOfLivingRooms(2));
        System.out.println("================================");
        System.out.println("House List");
        System.out.println(house1.getListOfAllHouses());
        System.out.println("Villa List");
        System.out.println(villa1.getListOfAllVillas());
        System.out.println("SummerHouse List");
        System.out.println(summerHouse1.getListOfAllSummerHouses());


    }
}
