# factsetglobalprices.StockDistribution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | FactSet Event Identifier. This is a unique identifier for each event. | [optional] 
**fsymId** | **String** | FactSet Permanent Identifier for the company/security associated with the event. | [optional] 
**requestId** | **String** | The identifier for the company or security will only be returned when IDs are included in the request. Acceptable identifiers include Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent IDs. | [optional] 
**identifier** | **String** | The ticker-region of the company or security. This field is returned regardless of any of the IDs provided. | [optional] 
**companyName** | **String** | Name of the company/security that declared the distribution. | [optional] 
**exchangeCode** | **String** | The exchange code where the event occurred. For a list of valid exchange codes, refer to the &#x60;/meta/exchanges&#x60; endpoint. | [optional] 
**exchangeName** | **String** | Exchange where the security/company associated with the event is traded. | [optional] 
**country** | **String** | The ISO Alpha-2 code of the country where the event occurred. | [optional] 
**eventType** | **String** | A brief description of the corporate action type. | [optional] 
**announcementDate** | **Date** | Date Event was announced in YYYY-MM-DD format. | [optional] 
**recordDate** | **Date** | Date of Record for distribution in YYYY-MM-DD format. | [optional] 
**payDate** | **Date** | Date of Payment for distribution in YYYY-MM-DD format. | [optional] 
**effectiveDate** | **Date** | Effective Date or Ex-Date of distribution in YYYY-MM-DD format. | [optional] 
**priceAdjFactor** | **Number** | The price adjustment factor associated with the bonus or stock dividend event. | [optional] 
**eventDescription** | **String** | Textual description identifying the event. | [optional] 
**distIdentifier** | **String** | The identifier of the distributed company associated with the event. | [optional] 
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  | [optional] 


