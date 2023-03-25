package apiTest;

import Pojo.User;
import api.RandomUserApi;
import io.restassured.RestAssured;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class RandomUserApiTest {
    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = "https://randomuser.me";
    }

    @Test
    public void generateUserGenderFemaleTest() {
        User user = RandomUserApi.sendUri("gender", "female")
                .body()
                .as(User.class);
        MatcherAssert.assertThat(user.getResults().get(0).getGender(), equalTo("female"));
    }

    @Test
    public void generateUserNatBRTest() {
        User user = RandomUserApi.sendUri("nat", "BR")
                .body()
                .as(User.class);
        MatcherAssert.assertThat(user.getResults().get(0).getNat(), equalTo("BR"));
    }
    @Test
    public void сheckVersionInfoTest() {
        User user = RandomUserApi.sendUri("", "1.4")
                .body()
                .as(User.class);
        MatcherAssert.assertThat(user.getInfo().getVersion(), equalTo("1.4"));
    }

    @Test
    public void generateThreeUserTest() {
        User user = RandomUserApi.sendUri("nat", "CA", "results", "3")
                .body()
                .as(User.class);
        MatcherAssert.assertThat(user.getResults().get(0).getNat(), equalTo("CA"));
        MatcherAssert.assertThat(user.getResults().get(1).getNat(), equalTo("CA"));
        MatcherAssert.assertThat(user.getResults().get(2).getNat(), equalTo("CA"));
    }
    @Test
    public void generateUserSpecialPasswordTest(){
        int lenPassword = 32;
        User user = RandomUserApi.sendUri("password","special,32")
                .body().as(User.class);
        MatcherAssert.assertThat(user.getResults().get(0).getLogin().getPassword().length(), equalTo(lenPassword));

    }
    @Test
    public void generateUserWithoutParamsTest(){
        User user = RandomUserApi.sendUri("","")
                .body()
                .as(User.class);
        MatcherAssert.assertThat(user.getResults().get(0).getNat(), notNullValue());
    }


}