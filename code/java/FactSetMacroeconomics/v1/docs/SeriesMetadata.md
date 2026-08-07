

# SeriesMetadata

Economic series metadata including identifier, name, classification, hierarchy path, and associated FDS codes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seriesId** | **String** | Unique series identifier for this economic data series. Pass this as the &#x60;seriesId&#x60; parameter in the &#x60;/as-reported-economics&#x60; endpoint to retrieve time series data. |  [optional]
**seriesName** | **String** | Display name of the economic series. |  [optional]
**fdsCodes** | **java.util.List&lt;String&gt;** | One or more FDS codes associated with this economic series. |  [optional]
**category** | **String** | Category classification for this economic series. Examples include Economic and Commodities, Interest Rates. |  [optional]
**subcategory** | **String** | Name of the deepest subcategory level for this economic series. |  [optional]
**subcategoryCode** | **String** | Two-letter classification code for the subcategory. |  [optional]
**countryCodes** | **java.util.List&lt;String&gt;** | List of ISO country codes for which this series has data. |  [optional]


## Implemented Interfaces

* Serializable


