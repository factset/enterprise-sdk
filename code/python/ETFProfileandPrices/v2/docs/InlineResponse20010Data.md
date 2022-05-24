# InlineResponse20010Data

Profile analytics.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**as_of_date** | **date** | Date the analytics data was published. Available for the regions: US, Europe, and Canada. | [optional] 
**security_lending** | [**InlineResponse20010DataSecurityLending**](InlineResponse20010DataSecurityLending.md) |  | [optional] 
**risk** | [**InlineResponse20010DataRisk**](InlineResponse20010DataRisk.md) |  | [optional] 
**benchmark_name** | **str** | FactSet provides a neutral, broad market index that best represents an ETP segment, giving investors a measuring stick against which to compare a specific ETP. The fund&#39;s performance (for example, R2, beta, and standard deviation) and holdings are measured against it. Available for the regions: US and Europe. | [optional] 
**index_change** | [**InlineResponse20010DataIndexChange**](InlineResponse20010DataIndexChange.md) |  | [optional] 
**median_bid_ask_spread** | **float** | The exchange-traded fund’s median bid-ask spread, expressed as a percentage rounded to the nearest hundredth, computed by: (A) Identifying the exchange-traded fund’s national best bid and national best offer as of the end of each 10 second interval during each trading day of the last 30 calendar days; (B) Dividing the ifference between each such bid and offer by the midpoint of the national best bid and national best offer; and (C) Identifying the median of those values. Available for the regions: US. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


