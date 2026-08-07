# SeriesMetadata

Economic series metadata including identifier, name, classification, hierarchy path, and associated FDS codes.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**series_id** | **str** | Unique series identifier for this economic data series. Pass this as the &#x60;seriesId&#x60; parameter in the &#x60;/as-reported-economics&#x60; endpoint to retrieve time series data. | [optional] 
**series_name** | **str** | Display name of the economic series. | [optional] 
**fds_codes** | **[str]** | One or more FDS codes associated with this economic series. | [optional] 
**category** | **str** | Category classification for this economic series. Examples include Economic and Commodities, Interest Rates. | [optional] 
**subcategory** | **str** | Name of the deepest subcategory level for this economic series. | [optional] 
**subcategory_code** | **str** | Two-letter classification code for the subcategory. | [optional] 
**country_codes** | **[str]** | List of ISO country codes for which this series has data. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


