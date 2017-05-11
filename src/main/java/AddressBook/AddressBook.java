package AddressBook;

import org.apache.wicket.Page;
import org.apache.wicket.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Application object for your web application.
 * If you want to run this application without deploying, run the Start class.
 * 
 * @see AddressBook.Start#main(String[])
 */
public class AddressBook extends WebApplication
{
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */

	public Class<? extends Page> getHomePage()
	{
		return null;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */

	public void init()
	{
		super.init();

		// add your configuration here
	}
}
