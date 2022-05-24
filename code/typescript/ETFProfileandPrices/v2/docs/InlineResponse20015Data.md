# etfprofileandprices.InlineResponse20015Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset** | **String** | Asset class of ETP holdings (Equity, Fixed Income, Currency, Commodities, Asset Allocation, or Alternatives), text and standardized value available. This data is available for all the regions. | [optional] 
**economicDevelopment** | **String** | The country development level of the ETP&#39;s holdings (Developed, Emerging, Frontier, or Blended), text and standardized value available. This data is available for all the regions. | [optional] 
**geography** | [**InlineResponse20015DataGeography**](InlineResponse20015DataGeography.md) |  | [optional] 
**category** | [**InlineResponse20015DataCategory**](InlineResponse20015DataCategory.md) |  | [optional] 



## Enum: AssetEnum


* `Equity` (value: `"Equity"`)

* `Alternatives` (value: `"Alternatives"`)

* `Fixed Income` (value: `"Fixed Income"`)

* `Commodities` (value: `"Commodities"`)

* `Currency` (value: `"Currency"`)

* `Asset Allocation` (value: `"Asset Allocation"`)





## Enum: EconomicDevelopmentEnum


* `Developed Markets` (value: `"Developed Markets"`)

* `Blended Development` (value: `"Blended Development"`)

* `Emerging Markets` (value: `"Emerging Markets"`)

* `Frontier Markets` (value: `"Frontier Markets"`)




