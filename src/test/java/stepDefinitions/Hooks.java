package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException {
		
		PleaceValidationSteps s = new PleaceValidationSteps();
		
		if(PleaceValidationSteps.place_id==null) {
		s.add_place_payload("Ram", "German", "Asia");
		s.user_calls_with_http_request("addPlaceAPI", "POST");
		s.verify_place_id_created_maps_to_using_get_place_api("Ram", "getPlaceAPI");
		}
	}
 
}
