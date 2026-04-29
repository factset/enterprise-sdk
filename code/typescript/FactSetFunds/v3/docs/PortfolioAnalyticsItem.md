# factsetfunds.PortfolioAnalyticsItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**requestId** | **String** | The requested Id sent as input. | [optional] 
**date** | **Date** | The date in YYYY-MM-DD format. | [optional] 
**analyticsType** | [**MarketCapitalizationType**](MarketCapitalizationType.md) |  | 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**assetAllocationName** | **String** | Returns the asset type in the fund&#39;s portfolio. Data is returned for both Mutual Funds and ETFs. | [optional] 
**assetAllocationWeight** | **Number** | Returns the asset type&#39;s weight in the fund&#39;s portfolio. Data is returned for both Mutual Funds and ETFs | [optional] 
**sector** | **String** | Sector data based on FactSet RBICS classification. | [optional] 
**sectorWeightagePercentage** | **Number** | The percentage weight of the sector in the fund&#39;s portfolio, based on FactSet RBICS classification. | [optional] 
**geographicSuperregion** | **String** | The normalized geographic super region name corresponding to a top geographic revenue exposure for the fund or index.  Examples of super regions include \&quot;Americas\&quot;, \&quot;Europe\&quot;, or \&quot;Asia Pacific\&quot;.  Used in conjunction with &#x60;geographicRevenuePercentage&#x60; to show concentrations of revenue exposure by broad geographic areas.  | [optional] 
**geographicRevenuePercentage** | **Number** | The aggregated percent of total fund or index revenue that is derived from the associated geographic region or country, as determined by FactSet Market Aggregate Geographic Revenue (GeoRev) methodology. The revenue percentages are estimated using normalized company disclosures and FactSet’s proprietary algorithm, providing consistent, comparable country and region-level exposures for the fund or index. | [optional] 
**largeCapPercent** | **Number** | Percentage of the aggregate that is composed of large-cap holdings. Large cap is defined as having a company market value greater than 12.9 billion USD | [optional] 
**midCapPercent** | **Number** | Percentage of the aggregate that is composed of Mid-cap holdings. Mid cap is defined as having a company market value greater than 2.7 billion USD but less than 12.9 billion USD. | [optional] 
**smallCapPercent** | **Number** | Percentage of the aggregate that is composed of Small-cap holdings. Small cap is defined as having a company market value greater than 600 million USD but less than 2.7 billion USD | [optional] 
**microCapPercent** | **Number** | Percentage of the aggregate that is composed of Micro-cap holdings. Micro cap is defined as having a company market value less than 600 million USD. | [optional] 


