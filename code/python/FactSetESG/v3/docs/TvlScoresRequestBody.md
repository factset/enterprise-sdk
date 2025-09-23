# TvlScoresRequestBody

TVL Scores Request Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**Ids**](Ids.md) |  | 
**score_type** | [**TvlScoreType**](TvlScoreType.md) |  | [optional] 
**fields** | [**Fields**](Fields.md) |  | [optional] 
**start_date** | **date** | The start date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity, but updated Daily. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**end_date** | **date** | The end date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity, but updated Daily. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**calendar** | [**Calendar**](Calendar.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


