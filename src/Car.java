public class Car {
    private String idCar;
    private StatusCar status;
    private String color;
    private int yearOfProduction;
    private String idBranch;
    private String modelNum;
    private int cost;
    private Boolean economy;
    private SizeCar size;
    private Boolean stationWagon;
    private Boolean van;
    private Boolean fourWheel;
    private Boolean sportOrLuxury;

    public Car(String idCar, StatusCar status){
        this.idCar = idCar;
        this.status = status;
    }
    public Car(String idCar, String color, int yearOfProduction, String idBranch, String modelNum, int cost, Boolean economy, SizeCar size, Boolean stationWagon, Boolean van, Boolean fourWheel, Boolean sportOrLuxury) {
        this.idCar = idCar;
        this.status = StatusCar.RENTREADY;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.idBranch = idBranch;
        this.modelNum = modelNum;
        this.cost = cost;
        this.economy = economy;
        this.size = size;
        this.stationWagon = stationWagon;
        this.van = van;
        this.fourWheel = fourWheel;
        this.sportOrLuxury = sportOrLuxury;
    }

    public void updateLocation(String idBranch){
        this.idBranch = idBranch;
    }
    public void updateAfterService(){
        this.status = StatusCar.RENTREADY;
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public String getIdBranch() {
        return idBranch;
    }

    public void setIdBranch(String idBranch) {
        this.idBranch = idBranch;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    @Override
    public String toString() {
        return "Car{" +
                "idCar='" + idCar + '\'' +
                ", status=" + status +
                ", color='" + color + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", idBranch='" + idBranch + '\'' +
                ", modelNum='" + modelNum + '\'' +
                ", cost=" + cost +
                ", economy=" + economy +
                ", size=" + size +
                ", stationWagon=" + stationWagon +
                ", van=" + van +
                ", fourWheel=" + fourWheel +
                ", sportOrLuxury=" + sportOrLuxury +
                '}';
    }

    public StatusCar getStatus() {
        return status;
    }

    public void setStatus(StatusCar status) {
        this.status = status;
    }
}
