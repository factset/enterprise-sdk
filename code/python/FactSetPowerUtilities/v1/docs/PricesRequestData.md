# PricesRequestData

Price query parameters. The `category` field selects the record shape returned. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**CategoryForward**](CategoryForward.md) |  | 
**delivery_year** | **int, none_type** | Filter by capacity delivery year. | [optional] 
**price_type** | **str, none_type** | Filter by forward price type. &#x60;AroundTheClock&#x60; availability is pending confirmation with the data team. | [optional] 
**ids** | [**LocationIds**](LocationIds.md) |  | [optional] 
**start_date** | **date** | Return forward price records with a trade date on or after this date (YYYY-MM-DD). | [optional] 
**end_date** | **date** | Return forward price records with a trade date on or before this date (YYYY-MM-DD). | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


