# CorporateActionCalendar


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | FactSet Event Identifier. This is a unique identifier for each event. | [optional] 
**fsym_id** | **str** | FactSet Permanent Identifier for the company/security associated with the event. | [optional] 
**request_id** | **str, none_type** | The identifier for the company or security will only be returned when IDs are included in the request. Acceptable identifiers include Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent IDs. | [optional] 
**identifier** | **str, none_type** | The ticker-region of the company or security. This field is returned regardless of any of the IDs provided. | [optional] 
**company_name** | **str, none_type** | The name of the company/security associated with the event. | [optional] 
**exchange_code** | **str, none_type** | The exchange code where the event occurred. For a list of valid exchange codes, refer to the &#x60;/meta/exchanges&#x60; endpoint. | [optional] 
**exchange_name** | **str, none_type** | Exchange where the security/company associated with the event is traded. | [optional] 
**country** | **str, none_type** | The ISO Alpha-2 code of the country where the event occurred. | [optional] 
**event_type** | **str, none_type** | The type of event. | [optional] 
**event_date** | **date, none_type** | The date of the event in **YYYY-MM-DD** format. | [optional] 
**event_description** | **str, none_type** | A brief description of the event. | [optional] 
**details_relative_path** | **str, none_type** | The relative path to retrieve detailed information about the event. | [optional] 
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


