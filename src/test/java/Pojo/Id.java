package Pojo;

import lombok.Data;

@Data
public class Id {
    private String name;

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    private String value;
}
