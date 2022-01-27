# FactorsRequest

Request object for requesting factors.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**Ids**](Ids.md) |  | 
**factors** | [**FactorsParam**](FactorsParam.md) |  | 
**start_date** | **str** | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**end_date** | **str** | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. **NOTE:** The input endDate must come AFTER the input startDate.  | 
**factor_groups** | [**FactorGroupsParam**](FactorGroupsParam.md) |  | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


