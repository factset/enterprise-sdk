# FundamentalRequestBody

Fundamentals request body elements

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**IdsBatchMax30000**](IdsBatchMax30000.md) |  | 
**metrics** | [**Metrics**](Metrics.md) |  | 
**periodicity** | [**Periodicity**](Periodicity.md) |  | [optional] 
**fiscal_period** | [**FiscalPeriod**](FiscalPeriod.md) |  | [optional] 
**currency** | **str** | Currency code for currency values. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).  | [optional]  if omitted the server will use the default value of "LOCAL"
**update_type** | [**UpdateType**](UpdateType.md) |  | [optional] 
**batch** | [**Batch**](Batch.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


