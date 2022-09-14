# MarketValue


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**date** | **date, none_type** | Ending date for the period expressed in YYYY-MM-DD format. | [optional] 
**currency** | **str, none_type** | Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**entity_market_value** | **float, none_type** | Aggregate market value across all share classes and includes non-traded shares which are added to the calculation basis by the proportion of their nominal or par value. Values are in base units. To value non-traded shares, the price of the parent equity provides the most appropriate approximation of what the non-traded shares would be worth in the open market. For unique companies with an ADR as the parent equity, since it is the only traded security associated with that company, when calculating company-level market value, the price of the ADR is used, but is scaled by the ADR ratio since there&#39;s not always a one-to-one relationship between ADR shares and the non-traded shares which they represent. For more details visit [Online Assistant Page #16867](https://my.apps.factset.com/oa/pages/16867).  | [optional] 
**entity_market_value_ex_non_traded** | **float, none_type** | Aggregate across all share classes and excludes non-traded shares. Values are in base units. For more details visit [Online Assistant Page #16867](https://my.apps.factset.com/oa/pages/16867). | [optional] 
**security_market_value** | **float, none_type** | Returns the security level market value calculated as the share price multiplied by the number of shares at the security level. **Note:** History is available back to Oct-1999 for North American securities, and 1-Jan-2001 for non-North American securities. | [optional] 
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


