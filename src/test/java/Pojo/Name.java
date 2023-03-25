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

    public String title;
    public String first;
    public String last;
}
