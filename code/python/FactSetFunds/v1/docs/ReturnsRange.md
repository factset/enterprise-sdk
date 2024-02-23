# ReturnsRange


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. | [optional] 
**_return** | **float, none_type** | The Return calculated between two dates. The return type is determined by including or excluding dividends through the dividendAdjust parameter. | [optional] 
**return_start_date** | **date, none_type** | The start date of the return in YYYY-MM-DD format. *NOTE - the startDate cannot be less than the &#x60;priceFirstDate&#x60; which can be accessed in the /summary endpoint. | [optional] 
**return_end_date** | **date, none_type** | The end date of the return in YYYY-MM-DD format. The start date of the return in YYYY-MM-DD format. *NOTE - the startDate cannot be less than the &#x60;priceFirstDate&#x60; which can be accessed in the /summary endpoint. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


