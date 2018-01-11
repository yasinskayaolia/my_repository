package model;

public class ContactData {
  private final String fname;
  private final String lname;
  private final String email;
  private final String mobile;

  public ContactData(String fname, String lname, String email, String mobile) {
    this.fname = fname;
    this.lname = lname;
    this.email = email;
    this.mobile = mobile;
  }

  public String getFname() {
    return fname;
  }

  public String getLname() {
    return lname;
  }

  public String getEmail() {
    return email;
  }

  public String getMobile() {
    return mobile;
  }
}
