public class Model {
    private String modelNum;
    private String description;
    private Type type;
    private int petrolConsump;
    private int numDoor;
    private String group;

    public Model(String modelNum, String description, Type type, int petrolConsump, int numDoor, String group) {
        this.modelNum = modelNum;
        this.description = description;
        this.type = type;
        this.petrolConsump = petrolConsump;
        this.numDoor = numDoor;
        this.group = group;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getPetrolConsump() {
        return petrolConsump;
    }

    public void setPetrolConsump(int petrolConsump) {
        this.petrolConsump = petrolConsump;
    }

    public int getNumDoor() {
        return numDoor;
    }

    public void setNumDoor(int numDoor) {
        this.numDoor = numDoor;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Model{" +
                "modelNum='" + modelNum + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", petrolConsump=" + petrolConsump +
                ", numDoor=" + numDoor +
                ", group='" + group + '\'' +
                '}';
    }
}
