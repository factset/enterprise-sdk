# DCSRequestBody

DCS Totals Request Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**Ids**](Ids.md) |  | 
**start_date** | **date** | The date of the period requested in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**metrics** | [**Metrics**](Metrics.md) |  | 
**end_date** | **date** | The date of the period requested in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**currency** | **str** | Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  | [optional]  if omitted the server will use the default value of "LOCAL"
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


