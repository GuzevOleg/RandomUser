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

        public String gender;
        public Name name;
        public Location location;
        public String email;
        public Login login;
        public Dob dob;
        public Registered registered;
        public String phone;
        public String cell;
        public Id id;
        public Picture picture;
        public String nat;
    }



