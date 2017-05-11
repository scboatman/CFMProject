package AddressBook;


import com.sun.webkit.WebPage;
import org.apache.wicket.Application;

public class HomePage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));

		// TODO Add your page's components here

    }


}
