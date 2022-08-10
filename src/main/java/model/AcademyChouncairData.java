package model;

public class AcademyChouncairData {

    public AcademyChouncairData(String firsname, String lastname, String email, String birthmonth, String birthday, String birthyear, String city, String zip, String user) {
        this.firsname = firsname;
        this.lastname = lastname;
        this.email = email;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.city = city;
        this.zip = zip;
        User = user;
    }

    private String firsname;

    public String getFirsname() {
        return firsname;
    }

    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthmonth() {
        return birthmonth;
    }

    public void setBirthmonth(String birthmonth) {
        this.birthmonth = birthmonth;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(String birthyear) {
        this.birthyear = birthyear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    private String lastname;
    private String email;
    private String birthmonth;
    private String birthday;
    private String birthyear;
    private String city;
    private String zip;
    private String User;

}


         //   Enter.theValue("spa").into(By.cssSelector("input.ui-select-search")),
