# FactSet.SDK.FactSetPrices.Model.HighLow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdjDate** | **DateTime?** | Date of last split for which prices have been adjusted. | [optional] 
**Date** | **DateTime?** | Specific reference date for the period expressed in YYYY-MM-DD format. | [optional] 
**Period** | **string** | The period of measure requested using the period query parameter. | [optional] 
**FsymId** | **string** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**PriceHigh** | **double?** | High price over the period requested. This can represent the intra-day or closing price depending on the priceType requested. By default the price is as of closing in local trading currency, split adjusted and not spinoff adjusted. | [optional] 
**PriceLow** | **double?** | Low price over the period requested. This can represent the intra-day or closing price depending on the priceType requested. By default the price is as of closing in local trading currency, split adjusted and not spinoff adjusted. | [optional] 
**PriceHighDate** | **DateTime?** | Date in which the highest price occurred over the requested period  for the given id expressed in YYYY-MM-DD format. | [optional] 
**PriceLowDate** | **DateTime?** | Date in which the lowest price occurred over the requested period for the given id expressed in YYYY-MM-DD format. | [optional] 
**RequestId** | **string** | Identifier that was used for the request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

