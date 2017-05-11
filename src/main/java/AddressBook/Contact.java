package AddressBook;



import java.io.Serializable;

/*Model for Contacts*/

public class Contact implements Serializable {

    private String  FirstName;
    private String  LastName;
    private String  StreetAddress;
    private String  City;
    private String  State;
    private String  ZipCode;
    private Enum    PhoneNumber;


}
