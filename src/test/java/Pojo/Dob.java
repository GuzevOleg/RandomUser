package Pojo;

import lombok.Data;

import java.util.Date;
@Data
public class Dob {

    public Date getDate() {
        return date;
    }

    public int getAge() {
        return age;
    }

    private Date date;
    private int age;
}
