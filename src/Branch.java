import java.util.ArrayList;
import java.util.List;

public class Branch {
    private String idBranch;
    private List<String> carList;
    private List<String> listNeighboringBranch;

    public Branch(String idBranch, List<String> carList, List<String> listNeighboringBranch) {
        this.idBranch = idBranch;
        this.carList = carList;
        this.listNeighboringBranch = listNeighboringBranch;
    }

    public Branch(String idBranch) {
        this.idBranch = idBranch;
        this.carList = new ArrayList<>();
        this.listNeighboringBranch = new ArrayList<>();
    }
    public void printInspectedCar(){

    }
    public void printAvailableCar(){

    }

    public String getIdBranch() {
        return idBranch;
    }

    public void setIdBranch(String idBranch) {
        this.idBranch = idBranch;
    }

    public List<String> getCarList() {
        return carList;
    }

    public void setCarList(List<String> carList) {
        this.carList = carList;
    }

    public List<String> getListNeighboringBranch() {
        return listNeighboringBranch;
    }

    public void setListNeighboringBranch(List<String> listNeighboringBranch) {
        this.listNeighboringBranch = listNeighboringBranch;
    }
    public void addListNeighboringBranch(String a) {
        List<String>temp = this.listNeighboringBranch;
        temp.add(a);
        setListNeighboringBranch(temp);
    }
    public void addCarList(String a) {
        List<String>temp = this.carList;
        temp.add(a);
        setCarList(temp);
    }

    @Override
    public String toString() {
        return "Branch{" +
                "idBranch='" + idBranch + '\'' +
                ", carList=" + carList +
                ", listNeighboringBranch=" + listNeighboringBranch +
                '}';
    }
}
