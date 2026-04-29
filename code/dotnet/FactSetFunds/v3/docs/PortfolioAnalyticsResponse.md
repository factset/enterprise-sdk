# FactSet.SDK.FactSetFunds.Model.PortfolioAnalyticsResponse
Response containing asset allocation, sector weightage, geographic revenue and market capitalization data based on `analyticsType` parameter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**List&lt;PortfolioAnalyticsItem&gt;**](PortfolioAnalyticsItem.md) | Array of objects - type depends on &#x60;analyticsType&#x60; parameter: * ASSET_ALLOCATION: Array of AssetAllocation objects (allocation by asset class) * SECTOR_WEIGHTAGE: Array of SectorWeightage objects (allocation by sector) * GEOGRAPHIC_REVENUE: Array of Geographic Revenue Objects * MARKET_CAPITALIZATION: Array of Market Capitalization Objects | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

