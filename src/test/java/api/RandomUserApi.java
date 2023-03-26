package api;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
public  class RandomUserApi {
    final static String USERS_URI = "/api/";
    public static Response sendUri(String key, String params) {
        return  given()
                .queryParam(key, params)
                .header("Content-type", "application/json")
                .get(USERS_URI);
    }

    public static Response sendUri(String key, String params, String key2, String params2) {
        return  given()
                .queryParam(key, params)
                .queryParam(key2, params2)
                .header("Content-type", "application/json")
                .get(USERS_URI);
    }

    public static Response sendUri(String version) {
        return  given()
                .header("Content-type", "application/json")
                .get(USERS_URI + version );
    }
}