# etfprofileandprices.InlineResponse20010Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asOfDate** | **Date** | Date the analytics data was published. Available for the regions: US, Europe, and Canada. | [optional] 
**securityLending** | [**InlineResponse20010DataSecurityLending**](InlineResponse20010DataSecurityLending.md) |  | [optional] 
**risk** | [**InlineResponse20010DataRisk**](InlineResponse20010DataRisk.md) |  | [optional] 
**benchmarkName** | **String** | FactSet provides a neutral, broad market index that best represents an ETP segment, giving investors a measuring stick against which to compare a specific ETP. The fund&#39;s performance (for example, R2, beta, and standard deviation) and holdings are measured against it. Available for the regions: US and Europe. | [optional] 
**indexChange** | [**InlineResponse20010DataIndexChange**](InlineResponse20010DataIndexChange.md) |  | [optional] 
**medianBidAskSpread** | **Number** | The exchange-traded fund’s median bid-ask spread, expressed as a percentage rounded to the nearest hundredth, computed by: (A) Identifying the exchange-traded fund’s national best bid and national best offer as of the end of each 10 second interval during each trading day of the last 30 calendar days; (B) Dividing the ifference between each such bid and offer by the midpoint of the national best bid and national best offer; and (C) Identifying the median of those values. Available for the regions: US. | [optional] 


