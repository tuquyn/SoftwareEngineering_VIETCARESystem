public class Requirement {
    private String pickUpBranch;
    private String returnBranch;
    private String pickUpDate;
    private String pickUpTime;
    private String returnDate;
    private String returnTime;
    private Boolean economy;
    private SizeCar size;
    private Boolean stationWagon;
    private Boolean van;
    private Boolean fourWheel;
    private Boolean sportOrLuxury;

    public Requirement(String pickUpBranch, String returnBranch, String pickUpDate, String pickUpTime, String returnDate, String returnTime, Boolean economy, SizeCar size, Boolean stationWagon, Boolean van, Boolean fourWheel, Boolean sportOrLuxury) {
        this.pickUpBranch = pickUpBranch;
        this.returnBranch = returnBranch;
        this.pickUpDate = pickUpDate;
        this.pickUpTime = pickUpTime;
        this.returnDate = returnDate;
        this.returnTime = returnTime;
        this.economy = economy;
        this.size = size;
        this.stationWagon = stationWagon;
        this.van = van;
        this.fourWheel = fourWheel;
        this.sportOrLuxury = sportOrLuxury;
    }
    public String getPickUpBranch() {
        return pickUpBranch;
    }

    public void setPickUpBranch(String pickUpBranch) {
        this.pickUpBranch = pickUpBranch;
    }

    public String getReturnBranch() {
        return returnBranch;
    }

    public void setReturnBranch(String returnBranch) {
        this.returnBranch = returnBranch;
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
}
