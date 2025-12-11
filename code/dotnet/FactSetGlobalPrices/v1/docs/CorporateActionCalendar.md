# FactSet.SDK.FactSetGlobalPrices.Model.CorporateActionCalendar

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | FactSet Event Identifier. This is a unique identifier for each event. | [optional] 
**FsymId** | **string** | FactSet Permanent Identifier for the company/security associated with the event. | [optional] 
**RequestId** | **string** | The identifier for the company or security will only be returned when IDs are included in the request. Acceptable identifiers include Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent IDs. | [optional] 
**Identifier** | **string** | The ticker-region of the company or security. This field is returned regardless of any of the IDs provided. | [optional] 
**CompanyName** | **string** | The name of the company/security associated with the event. | [optional] 
**ExchangeCode** | **string** | The exchange code where the event occurred. For a list of valid exchange codes, refer to the &#x60;/meta/exchanges&#x60; endpoint. | [optional] 
**ExchangeName** | **string** | Exchange where the security/company associated with the event is traded. | [optional] 
**Country** | **string** | The ISO Alpha-2 code of the country where the event occurred. | [optional] 
**EventType** | **string** | The type of event. | [optional] 
**EventDate** | **DateTime?** | The date of the event in **YYYY-MM-DD** format. | [optional] 
**EventDescription** | **string** | A brief description of the event. | [optional] 
**DetailsRelativePath** | **string** | The relative path to retrieve detailed information about the event. | [optional] 
**Error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

