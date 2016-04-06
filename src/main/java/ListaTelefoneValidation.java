import java.util.HashMap;

import org.mule.api.MuleEvent;
import org.mule.extension.validation.api.ValidationResult;
import org.mule.extension.validation.api.Validator;
import org.mule.DefaultMuleMessage ;


public class ListaTelefoneValidation implements Validator {

	@Override
	public ValidationResult validate(MuleEvent event) {
		// TODO Auto-generated method stub
		DefaultMuleMessage message = (DefaultMuleMessage) event.getMessage();
		HashMap<String, Object> payload = (HashMap<String, Object>) message.getPayload();
		HashMap <String, Object>  customer = (HashMap <String, Object>) payload.get("customerData"); 
		System.out.println(customer.get("phoneData"));
		return null;
	}

}
	