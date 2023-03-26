package Pojo;


import lombok.Data;
 @Data
public class Results {

        public String getGender() {
                return gender;
        }

        public Name getName() {
                return name;
        }

        public Location getLocation() {
                return location;
        }

        public String getEmail() {
                return email;
        }

        public Login getLogin() {
                return login;
        }

        public Dob getDob() {
                return dob;
        }

        public Registered getRegistered() {
                return registered;
        }

        public String getPhone() {
                return phone;
        }

        public String getCell() {
                return cell;
        }

        public Id getId() {
                return id;
        }

        public Picture getPicture() {
                return picture;
        }

        public String getNat() {
                return nat;
        }

         private String gender;
         private Name name;
         private Location location;
         private String email;
         private Login login;
         private Dob dob;
         private Registered registered;
         private String phone;
         private String cell;
         private Id id;
         private Picture picture;
         private String nat;
    }



