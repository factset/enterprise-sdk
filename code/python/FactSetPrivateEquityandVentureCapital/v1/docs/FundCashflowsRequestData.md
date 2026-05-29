# FundCashflowsRequestData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[str]** | List of fund entity identifiers, which can be retrieved from the /universe endpoint | 
**start_date** | **date** | Specifies the start date for the requested date range, formatted as YYYY-MM-DD. Future dates (T+1) are not accepted in this endpoint. | [optional] 
**end_date** | **date** | Specifies the end date for the requested date range, formatted as YYYY-MM-DD. Future dates (T+1) are not accepted in this endpoint. | [optional] 
**cf_type** | **str** | Cash flow type filter | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


