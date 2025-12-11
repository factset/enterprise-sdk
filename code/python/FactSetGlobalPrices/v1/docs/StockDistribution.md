# StockDistribution


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | FactSet Event Identifier. This is a unique identifier for each event. | [optional] 
**fsym_id** | **str** | FactSet Permanent Identifier for the company/security associated with the event. | [optional] 
**request_id** | **str, none_type** | The identifier for the company or security will only be returned when IDs are included in the request. Acceptable identifiers include Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent IDs. | [optional] 
**identifier** | **str, none_type** | The ticker-region of the company or security. This field is returned regardless of any of the IDs provided. | [optional] 
**company_name** | **str, none_type** | Name of the company/security that declared the distribution. | [optional] 
**exchange_code** | **str, none_type** | The exchange code where the event occurred. For a list of valid exchange codes, refer to the &#x60;/meta/exchanges&#x60; endpoint. | [optional] 
**exchange_name** | **str, none_type** | Exchange where the security/company associated with the event is traded. | [optional] 
**country** | **str, none_type** | The ISO Alpha-2 code of the country where the event occurred. | [optional] 
**event_type** | **str, none_type** | A brief description of the corporate action type. | [optional] 
**announcement_date** | **date, none_type** | Date Event was announced in YYYY-MM-DD format. | [optional] 
**record_date** | **date, none_type** | Date of Record for distribution in YYYY-MM-DD format. | [optional] 
**pay_date** | **date, none_type** | Date of Payment for distribution in YYYY-MM-DD format. | [optional] 
**effective_date** | **date, none_type** | Effective Date or Ex-Date of distribution in YYYY-MM-DD format. | [optional] 
**price_adj_factor** | **float, none_type** | The price adjustment factor associated with the bonus or stock dividend event. | [optional] 
**event_description** | **str, none_type** | Textual description identifying the event. | [optional] 
**dist_identifier** | **str, none_type** | The identifier of the distributed company associated with the event. | [optional] 
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


