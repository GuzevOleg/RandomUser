package Pojo;

import lombok.Data;

@Data
public class Timezone {
    public String getOffset() {
        return offset;
    }

    public String getDescription() {
        return description;
    }

    private String offset;
    private String description;
}
