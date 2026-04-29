# FactSet.SDK.FactSetFunds.Model.PortfolioAnalyticsItem
Response item that can be one of: AssetAllocation or SectorWeightage. The actual schema depends on the `analyticsType` parameter. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Date** | **DateTime?** | The date in YYYY-MM-DD format. | [optional] 
**AnalyticsType** | **MarketCapitalizationType** |  | 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**AssetAllocationName** | **string** | Returns the asset type in the fund&#39;s portfolio. Data is returned for both Mutual Funds and ETFs. | [optional] 
**AssetAllocationWeight** | **double?** | Returns the asset type&#39;s weight in the fund&#39;s portfolio. Data is returned for both Mutual Funds and ETFs | [optional] 
**Sector** | **string** | Sector data based on FactSet RBICS classification. | [optional] 
**SectorWeightagePercentage** | **double?** | The percentage weight of the sector in the fund&#39;s portfolio, based on FactSet RBICS classification. | [optional] 
**GeographicSuperregion** | **string** | The normalized geographic super region name corresponding to a top geographic revenue exposure for the fund or index.  Examples of super regions include \&quot;Americas\&quot;, \&quot;Europe\&quot;, or \&quot;Asia Pacific\&quot;.  Used in conjunction with &#x60;geographicRevenuePercentage&#x60; to show concentrations of revenue exposure by broad geographic areas.  | [optional] 
**GeographicRevenuePercentage** | **double?** | The aggregated percent of total fund or index revenue that is derived from the associated geographic region or country, as determined by FactSet Market Aggregate Geographic Revenue (GeoRev) methodology. The revenue percentages are estimated using normalized company disclosures and FactSet’s proprietary algorithm, providing consistent, comparable country and region-level exposures for the fund or index. | [optional] 
**LargeCapPercent** | **double?** | Percentage of the aggregate that is composed of large-cap holdings. Large cap is defined as having a company market value greater than 12.9 billion USD | [optional] 
**MidCapPercent** | **double?** | Percentage of the aggregate that is composed of Mid-cap holdings. Mid cap is defined as having a company market value greater than 2.7 billion USD but less than 12.9 billion USD. | [optional] 
**SmallCapPercent** | **double?** | Percentage of the aggregate that is composed of Small-cap holdings. Small cap is defined as having a company market value greater than 600 million USD but less than 2.7 billion USD | [optional] 
**MicroCapPercent** | **double?** | Percentage of the aggregate that is composed of Micro-cap holdings. Micro cap is defined as having a company market value less than 600 million USD. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

