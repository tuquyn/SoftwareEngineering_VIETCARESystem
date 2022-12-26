import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VIETCARESystem {
    private List<Customer> customerList;
    private List<Customer> blackList;
    private List<Customer> discountCustomerList;
    private List<Rental> rentalList;
    private List<Branch> branchList;
    private List<Car> carList;
    private List<Model> modelList;

    public Group group;
    public VIETCARESystem() {
        this.customerList = new ArrayList<>();
        this.blackList = new ArrayList<>();
        this.discountCustomerList = new ArrayList<>();
        this.rentalList = new ArrayList<>();
        this.branchList = new ArrayList<>();
        this.carList = new ArrayList<>();
        this.modelList = new ArrayList<>();
        this.group = new Group();
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public void pairBranches(Branch p, Branch q){
        p.addListNeighboringBranch(q.getIdBranch());
        q.addListNeighboringBranch(p.getIdBranch());
    }
    public void addBranch(Branch branch) {
        branchList.add(branch);
    }

    public void addModel(Model model) {
        modelList.add(model);
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public void addCar(Car car, String idBranch){
        for(Branch b : branchList)
            if(b.getIdBranch() == idBranch){
                b.addCarList(car.getIdCar());
                return;
            }
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Customer> getBlackList() {
        return blackList;
    }

    public void setBlackList(List<Customer> blackList) {
        this.blackList = blackList;
    }

    public List<Customer> getDiscountCustomerList() {
        return discountCustomerList;
    }

    public void setDiscountCustomerList(List<Customer> discountCustomerList) {
        this.discountCustomerList = discountCustomerList;
    }

    public List<Rental> getRentalList() {
        return rentalList;
    }

    public void setRentalList(List<Rental> rentalList) {
        this.rentalList = rentalList;
    }

    public List<Branch> getBranchList() {
        return branchList;
    }

    public void setBranchList(List<Branch> branchList) {
        this.branchList = branchList;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public List<Model> getModelList() {
        return modelList;
    }

    public void setModelList(List<Model> modelList) {
        this.modelList = modelList;
    }
    public void addRental(Rental rental){
        rentalList.add(rental);
    }
}
