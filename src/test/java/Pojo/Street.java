package Pojo;

import lombok.Data;

@Data
public class Street {

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    private Integer number;
    private String name;
}
