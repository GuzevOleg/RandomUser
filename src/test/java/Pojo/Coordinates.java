package Pojo;

import lombok.Data;

@Data
public class Coordinates {

        public String getLatitude() {
                return latitude;
        }

        public String getLongitude() {
                return longitude;
        }

        private String latitude;
        private String longitude;


}
