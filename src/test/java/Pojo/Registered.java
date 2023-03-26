package Pojo;

import lombok.Data;

import java.util.Date;
@Data
public class Registered {
    private Date date;

    public Date getDate() {
        return date;
    }

    public Integer getAge() {
        return age;
    }

    private Integer age;
}
