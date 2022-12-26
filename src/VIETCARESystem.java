import java.util.List;

public class System {
    private List<Customer> customerList;
    private List<Customer> blackList;
    private List<Customer> discountCustomerList;
    private List<Rental> rentalList;
    private List<Branch> branchList;
    private List<Car> carList;
    private List<Model> modelList;

    public void addCustomer(Customer customer){
        customerList.add(customer);
    }
    public void addBranch(Branch branch){
        branchList.add(branch);
    }
    public void addModel(Model model){
        modelList.add(model);
    }
    public void addCar(Car car){
        carList.add(car);
    }
}
