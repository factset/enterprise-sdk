# StopLossRequestBody


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_path** | **str** | The account path of the portfolio you want to retrieve the data for. | 
**benchmark_path** | **str** | The path of the benchmark you want to retrieve the data for. | 
**period** | **str** | For which period you want to retrieve the data. | 
**attribute** | [**Attributes**](Attributes.md) |  | [optional] 
**sector** | **str** | Represents the sector based on the company&#39;s industry breakdown. | [optional] 
**region** | **str** | Region of domicile represents the region based on the company&#39;s primary listing. | [optional] 
**holdings** | [**StopLossHoldings**](StopLossHoldings.md) |  | [optional] 
**custom_classifications** | [**Classifications**](Classifications.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


