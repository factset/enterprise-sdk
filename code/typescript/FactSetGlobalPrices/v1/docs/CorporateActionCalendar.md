# factsetglobalprices.CorporateActionCalendar

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | FactSet Event Identifier. This is a unique identifier for each event. | [optional] 
**fsymId** | **String** | FactSet Permanent Identifier for the company/security associated with the event. | [optional] 
**requestId** | **String** | The identifier for the company or security will only be returned when IDs are included in the request. Acceptable identifiers include Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent IDs. | [optional] 
**identifier** | **String** | The ticker-region of the company or security. This field is returned regardless of any of the IDs provided. | [optional] 
**companyName** | **String** | The name of the company/security associated with the event. | [optional] 
**exchangeCode** | **String** | The exchange code where the event occurred. For a list of valid exchange codes, refer to the &#x60;/meta/exchanges&#x60; endpoint. | [optional] 
**exchangeName** | **String** | Exchange where the security/company associated with the event is traded. | [optional] 
**country** | **String** | The ISO Alpha-2 code of the country where the event occurred. | [optional] 
**eventType** | **String** | The type of event. | [optional] 
**eventDate** | **Date** | The date of the event in **YYYY-MM-DD** format. | [optional] 
**eventDescription** | **String** | A brief description of the event. | [optional] 
**detailsRelativePath** | **String** | The relative path to retrieve detailed information about the event. | [optional] 
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  | [optional] 


