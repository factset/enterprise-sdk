

# GeographicRevenueAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analyticsType** | **GeographicRevenueType** |  | 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**geographicSuperregion** | **String** | The normalized geographic super region name corresponding to a top geographic revenue exposure for the fund or index.  Examples of super regions include \&quot;Americas\&quot;, \&quot;Europe\&quot;, or \&quot;Asia Pacific\&quot;.  Used in conjunction with &#x60;geographicRevenuePercentage&#x60; to show concentrations of revenue exposure by broad geographic areas.  |  [optional]
**geographicRevenuePercentage** | **Double** | The aggregated percent of total fund or index revenue that is derived from the associated geographic region or country, as determined by FactSet Market Aggregate Geographic Revenue (GeoRev) methodology. The revenue percentages are estimated using normalized company disclosures and FactSet’s proprietary algorithm, providing consistent, comparable country and region-level exposures for the fund or index. |  [optional]


## Implemented Interfaces

* Serializable


