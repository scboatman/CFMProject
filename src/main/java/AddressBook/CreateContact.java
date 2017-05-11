package AddressBook;

import org.apache.wicket;
import org.apache.wicket.model.LoadableDetachableModel;


/**
 * Created by scbmo on 5/9/2017.
 */
public class CreateContact extends LoadableDetachableModel<Contact>{

    public Long id;
    public AddressBook.CreateContact createContactService;
    @override

    private void load()
  	{

 	}

    public CreateContact(Long id, AddressBook.CreateContact createContactService) {
        this.AddressBook.createContactService = createContactService;
        final AddressBook.Contact load = load();
        this.id = id;
        AddressBook.CreateContact createContact;
        this.createContactService = AddressBook.createContact;
    }
}
