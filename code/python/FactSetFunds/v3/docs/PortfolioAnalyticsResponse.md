# PortfolioAnalyticsResponse

Response containing asset allocation, sector weightage, geographic revenue and market capitalization data based on `analyticsType` parameter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**[PortfolioAnalyticsItem]**](PortfolioAnalyticsItem.md) | Array of objects - type depends on &#x60;analyticsType&#x60; parameter: * ASSET_ALLOCATION: Array of AssetAllocation objects (allocation by asset class) * SECTOR_WEIGHTAGE: Array of SectorWeightage objects (allocation by sector) * GEOGRAPHIC_REVENUE: Array of Geographic Revenue Objects * MARKET_CAPITALIZATION: Array of Market Capitalization Objects | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


