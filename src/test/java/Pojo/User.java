package Pojo;

import lombok.Data;

import java.util.List;
@Data
public class User {

    private List<Results> results;

    public List<Results> getResults() {
        return results;
    }

    public Info getInfo() {
        return info;
    }

    public Info info;




}