import java.util.ArrayList;
import java.util.List;

public class VIETCARESystemTest {
    public static VIETCARESystem system = new VIETCARESystem();

    public VIETCARESystemTest(){
        addBranchTest();
        addBranchTest();
        addBranchTest();
        addBranchTest();

//        printAll(); // 1

        pairBranchesTest(system.getBranchList().get(0),system.getBranchList().get(1));
        pairBranchesTest(system.getBranchList().get(1),system.getBranchList().get(2));
        pairBranchesTest(system.getBranchList().get(3),system.getBranchList().get(1));

//        System.out.println();
//        printAll(); // 2

        addGroupTest("ABC");
//        System.out.println();
//        printAll(); // 3

        addModelTest("Most common kind", Type.automatic, 2, 4, "A");
        addModelTest("SUV", Type.manual, 3, 4, "C");
        addModelTest("Wagon", Type.automatic, 2, 2, "ABC");

//        System.out.println();
//        printAll(); // 4

        addCarTest("black",2020,system.getBranchList().get(0).getIdBranch(), system.getModelList().get(2).getModelNum(),
                10000, true, SizeCar.Compact, false, true, false, true);
        addCarTest("white",2017,system.getBranchList().get(3).getIdBranch(), system.getModelList().get(0).getModelNum(),
                50000, true, SizeCar.Medium, true, true, true, false);
        addCarTest("blue",2016,system.getBranchList().get(1).getIdBranch(), system.getModelList().get(1).getModelNum(),
                100000, true, SizeCar.Full, false, true, true, true);
//        System.out.println();
//        printAll(); // 5

        addCustomerTest("ndads@gmai.com",null, "An", "Nguyen", "4546864587");
        addCustomerTest("ngfdg@gmai.com",null, "Bao", "Tran", "4678877854");

//        System.out.println();
//        printAll(); // 6

//        listCarAvailableBranch(system.getBranchList().get(0).getIdBranch());
//        listCarAvailableGroup("A");

//        System.out.println();
        Requirement newRequirement = new Requirement(system.getBranchList().get(2).getIdBranch(), system.getBranchList().get(0).getIdBranch(), "25-12-2022","08am","26-12-2022","10pm",true,SizeCar.Full, true, true, true, true);
        Rental rental = new Rental(RandomNum.getAlphaNumericString(10), StatusRental.PICKEDUP, 900, system.getCarList().get(0), newRequirement);
        system.addRental(rental);
        recordReturn(rental.getRentalNum(), 1000, "26-12-2022", "10pm");
        updateReturnBranch(rental.getRentalNum(), system.getBranchList().get(3).getIdBranch());
        printAll();
    }
    public void printAll(){
        for (Branch b: system.getBranchList()
             ) {
            System.out.println(b);
        }
        System.out.println(system.group);
        for (Model m: system.getModelList()
        ) {
            System.out.println(m);
        }
        for (Car c: system.getCarList()
             ) {
            System.out.println(c);
        }
        for(Customer c: system.getCustomerList()){
            System.out.println(c);
        }

        listCarAvailableBranch(system.getBranchList().get(1).getIdBranch());
        listCarAvailableGroup("A");

        for(Rental r: system.getRentalList()){
            System.out.println(r);
        }
    }
    public void addBranchTest(){
        String newID = RandomID.getAlphaNumericString(10);
        for(Branch b : system.getBranchList())
            if(b.getIdBranch() == newID){
                addBranchTest();
                return;
            }
        system.addBranch(new Branch(newID));
    }
    public void pairBranchesTest(Branch p, Branch q){
        if(p.getListNeighboringBranch().contains(q) || q.getListNeighboringBranch().contains(p)) {
            return;
        }
        system.pairBranches(p,q);
    }
    public void addGroupTest(String a){
        if(system.group.getList().contains(a))return;
        system.group.getList().add(a);
    }
    public void addModelTest(String description, Type type, int petrolConsump, int numDoor, String group){
        String newNum = RandomNum.getAlphaNumericString(5);
        for(Model m : system.getModelList())
            if(m.getModelNum() == newNum){
                addModelTest(description,type,petrolConsump,numDoor,group);
                return;
            }
        Model newModel = new Model(newNum, description,type,petrolConsump,numDoor,group);
        system.addModel(newModel);
    }
    public void addCarTest(String color, int yearOfProduction, String idBranch, String modelNum, int cost, Boolean economy, SizeCar size, Boolean stationWagon, Boolean van, Boolean fourWheel, Boolean sportOrLuxury){
        String newID = RandomID.getAlphaNumericString(10);
        for(Car c : system.getCarList())
            if(c.getIdCar() == newID){
                addCarTest( color, yearOfProduction, idBranch, modelNum, cost, economy, size, stationWagon, van, fourWheel, sportOrLuxury);
                return;
            }
        Car newCar = new Car(newID, color, yearOfProduction, idBranch, modelNum, cost, economy, size, stationWagon, van, fourWheel, sportOrLuxury);
        system.addCar(newCar);
        system.addCar(newCar, idBranch);
    }
    public void addCustomerTest(String email, String phone, String firstName, String lastName, String driverLicense){
        String newID = RandomID.getAlphaNumericString(10);
        for(Customer c : system.getCustomerList())
            if(c.getIdCustomer() == newID){
                addCustomerTest(email, phone, firstName, lastName, driverLicense);
                return;
            }else
                if(c.getDriverLicense() == driverLicense) {
                    return;
                }
        for(Customer c : system.getBlackList())
            if(c.getIdCustomer() == newID || c.getDriverLicense() == driverLicense)return;

        system.addCustomer(new Customer(newID, email, phone, firstName, lastName, driverLicense));
    }
    public void listCarAvailableBranch(String idBranch){
        List<String> cars = new ArrayList<>();
        List<Car> result = new ArrayList<>();
        for(Branch b : system.getBranchList())
            if(b.getIdBranch() == idBranch) {
                cars = b.getCarList();
                        break;
            }
        for(Car car : system.getCarList())
            if(car.getStatus() == StatusCar.RENTREADY && cars.contains(car.getIdCar()))
                result.add(car);
        System.out.println(result);
    }
    public void listCarAvailableGroup(String groupName){
        List<String> modelList = new ArrayList<>();
        List<Car> result = new ArrayList<>();
        for(Model m : system.getModelList())
            if(m.getGroup() == groupName) {
                modelList.add(m.getModelNum());
                break;
            }
        for(Car car : system.getCarList())
            if(car.getStatus() == StatusCar.RENTREADY && modelList.contains(car.getModelNum()))
                result.add(car);
        System.out.println(result);
    }
    public void recordReturn(String rentalNum, int mileage, String returnDate, String returnTime){
        if(!system.getRentalList().contains(rentalNum))
            return;
        for(Rental r : system.getRentalList())
            if(r.getRentalNum() == rentalNum){
                r.setStatus(StatusRental.RETURNED);
                r.setEndMileage(mileage);
                r.setReturnDate(returnDate);
                r.setReturnTime(returnTime);
                r.setCar();
                break;
            }
    }
    public void updateReturnBranch(String rentalNum, String idBranch){
        if(!system.getRentalList().contains(rentalNum))return;
        for(Rental r : system.getRentalList())
            if(r.getRequirement().getReturnBranch() == idBranch){
                r.updateRequirement(idBranch);
                break;
            }
    }
}