package Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Name {

    public String getTitle() {
        return title;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    private String title;
    private String first;
    private String last;
}
