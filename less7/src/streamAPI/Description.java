package streamAPI;

import java.util.List;

public class Description {
    private List<String> descr;

    Description(List<String> descr) {
        this.descr = descr;
    }
    public List<String> getDescr(){
        return descr;
    }
}
