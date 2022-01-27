# RollingConsensusRequest

Request object for requesting rolling consensus estimates.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**Ids**](Ids.md) |  | 
**metrics** | [**Metrics**](Metrics.md) |  | 
**start_date** | **str** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint.  | [optional] 
**end_date** | **str** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**relative_fiscal_start** | **int** | Relative fiscal period, expressed as an integer, used to filter results. | [optional] 
**relative_fiscal_end** | **int** | Relative fiscal period, expressed as an integer, used to filter results. | [optional] 
**periodicity** | [**Periodicity**](Periodicity.md) |  | [optional] 
**currency** | **str** | Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


