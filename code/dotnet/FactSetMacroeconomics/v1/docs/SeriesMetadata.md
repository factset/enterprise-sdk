# FactSet.SDK.FactSetMacroeconomics.Model.SeriesMetadata
Economic series metadata including identifier, name, classification, hierarchy path, and associated FDS codes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SeriesId** | **string** | Unique series identifier for this economic data series. Pass this as the &#x60;seriesId&#x60; parameter in the &#x60;/as-reported-economics&#x60; endpoint to retrieve time series data. | [optional] 
**SeriesName** | **string** | Display name of the economic series. | [optional] 
**FdsCodes** | **List&lt;string&gt;** | One or more FDS codes associated with this economic series. | [optional] 
**Category** | **string** | Category classification for this economic series. Examples include Economic and Commodities, Interest Rates. | [optional] 
**Subcategory** | **string** | Name of the deepest subcategory level for this economic series. | [optional] 
**SubcategoryCode** | **string** | Two-letter classification code for the subcategory. | [optional] 
**CountryCodes** | **List&lt;string&gt;** | List of ISO country codes for which this series has data. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

