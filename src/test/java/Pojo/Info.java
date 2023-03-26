package Pojo;

import lombok.Data;

import java.util.List;

@Data
public class Info  {
    private String seed;

    public String getSeed() {
        return seed;
    }

    public int getResults() {
        return results;
    }

    public int getPage() {
        return page;
    }

    public String getVersion() {
        return version;
    }

    private int results;
    private int page;
    private String version;
}
