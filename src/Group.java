import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<String> list;
    public Group(){
        list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Group{" +
                "list=" + list +
                '}';
    }
}
