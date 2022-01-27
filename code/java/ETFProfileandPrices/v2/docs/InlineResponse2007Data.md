

# InlineResponse2007Data

Class information of given ETP.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset** | [**AssetEnum**](#AssetEnum) | Asset class of ETP holdings (Equity, Fixed Income, Currency, Commodities, Asset Allocation, or Alternatives), text and standardized value available. This data is available for all the regions. |  [optional]
**economicDevelopment** | [**EconomicDevelopmentEnum**](#EconomicDevelopmentEnum) | The country development level of the ETP&#39;s holdings (Developed, Emerging, Frontier, or Blended), text and standardized value available. This data is available for all the regions. |  [optional]
**geography** | [**InlineResponse2007DataGeography**](InlineResponse2007DataGeography.md) |  |  [optional]
**category** | [**InlineResponse2007DataCategory**](InlineResponse2007DataCategory.md) |  |  [optional]



## Enum: AssetEnum

Name | Value
---- | -----
EQUITY | &quot;Equity&quot;
ALTERNATIVES | &quot;Alternatives&quot;
FIXED_INCOME | &quot;Fixed Income&quot;
COMMODITIES | &quot;Commodities&quot;
CURRENCY | &quot;Currency&quot;
ASSET_ALLOCATION | &quot;Asset Allocation&quot;



## Enum: EconomicDevelopmentEnum

Name | Value
---- | -----
DEVELOPED_MARKETS | &quot;Developed Markets&quot;
BLENDED_DEVELOPMENT | &quot;Blended Development&quot;
EMERGING_MARKETS | &quot;Emerging Markets&quot;
FRONTIER_MARKETS | &quot;Frontier Markets&quot;


## Implemented Interfaces

* Serializable


