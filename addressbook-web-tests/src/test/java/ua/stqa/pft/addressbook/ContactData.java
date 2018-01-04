package ua.stqa.pft.addressbook;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private final String email;
  private final String mobile;

  public ContactData(String firstname, String lastname, String email, String mobile) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
    this.mobile = mobile;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getEmail() {
    return email;
  }

  public String getMobile() {
    return mobile;
  }
}
