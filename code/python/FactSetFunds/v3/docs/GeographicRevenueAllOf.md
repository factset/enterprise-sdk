# GeographicRevenueAllOf


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analytics_type** | [**GeographicRevenueType**](GeographicRevenueType.md) |  | 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**geographic_superregion** | **str, none_type** | The normalized geographic super region name corresponding to a top geographic revenue exposure for the fund or index.  Examples of super regions include \&quot;Americas\&quot;, \&quot;Europe\&quot;, or \&quot;Asia Pacific\&quot;.  Used in conjunction with &#x60;geographicRevenuePercentage&#x60; to show concentrations of revenue exposure by broad geographic areas.  | [optional] 
**geographic_revenue_percentage** | **float, none_type** | The aggregated percent of total fund or index revenue that is derived from the associated geographic region or country, as determined by FactSet Market Aggregate Geographic Revenue (GeoRev) methodology. The revenue percentages are estimated using normalized company disclosures and FactSet’s proprietary algorithm, providing consistent, comparable country and region-level exposures for the fund or index. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


