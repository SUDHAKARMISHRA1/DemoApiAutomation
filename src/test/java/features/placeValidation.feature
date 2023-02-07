Feature: Validating Place API's

	@AddPlace
  Scenario Outline: Verify is place is being Successfully added using AddPlaceAPI
    Given Add Place Payload "<name>" "<language>" "<address>"
    When  User calls "addPlaceAPI" with "POST" http request
    Then  The API call got success with status code 200
    And   "status" in response body is "OK"
    And   "scope" in response body is "APP"
    And   verify place_Id created maps to "<name>" using "getPlaceAPI"


  Examples:
  
  |name		| language	|			address	      |
  |AAHouse| English   | World Cross Center|
  |ABHouse| Spanish   | World Trade Center|
  
  @DeletePlace
  Scenario: Verify if Delete Place Functionality is working
  Given     DeletePlace Payload
  When      User calls "deletePlaceAPI" with "POST" http request
  Then      The API call got success with status code 200
  And       "status" in response body is "OK"