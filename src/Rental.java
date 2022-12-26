public class Rental {
    private String rentalNum;
    private StatusRental status;
    private int startMileage;
    private int endMileage;
    private Car car;
    private Requirement requirement;
    private String returnDate;
    private String returnTime;

    public Rental(String rentalNum, StatusRental status, int startMileage, Car car, Requirement requirement) {
        this.rentalNum = rentalNum;
        this.status = status;
        this.startMileage = startMileage;
        this.endMileage = startMileage;
        this.car = car;
        car.setStatus(status == StatusRental.RESERVED ? StatusCar.RESERVED : StatusCar.PICKEDUP);
        this.requirement = requirement;
    }

    public String getRentalNum() {
        return rentalNum;
    }

    public void setRentalNum(String rentalNum) {
        this.rentalNum = rentalNum;
    }

    public StatusRental getStatus() {
        return status;
    }

    public void setStatus(StatusRental status) {
        this.status = status;
    }

    public int getEndMileage() {
        return endMileage;
    }

    public void setEndMileage(int endMileage) {
        this.endMileage = endMileage;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }
    public void setCar(){
        this.car.setStatus(StatusCar.RETURNED);
    }

    public Requirement getRequirement() {
        return requirement;
    }

    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }
    public void updateRequirement(String idBranch){
        requirement.setReturnBranch(idBranch);
    }

    @Override
    public String toString() {
        return "Rental{" +
                "rentalNum='" + rentalNum + '\'' +
                ", status=" + status +
                ", startMileage=" + startMileage +
                ", endMileage=" + endMileage +
                ", car=" + car +
                ", requirement=" + requirement +
                ", returnDate='" + returnDate + '\'' +
                ", returnTime='" + returnTime + '\'' +
                '}';
    }
}
