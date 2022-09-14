# FactSet.SDK.FactSetPrices.Model.Price

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**Date** | **DateTime?** | Ending date for the period expressed in YYYY-MM-DD format. | [optional] 
**AdjDate** | **DateTime?** | Date of last split for which prices and volume have been adjusted. Use /factset-prices/v#/splits endpoint for details regarding the split. | [optional] 
**Currency** | **string** | Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**_Price** | **double?** | Closing Price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET. | [optional] 
**PriceOpen** | **double?** | Open price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET. | [optional] 
**PriceHigh** | **double?** | High closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET. | [optional] 
**PriceLow** | **double?** | Low closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET. | [optional] 
**Volume** | **double?** | Returns the cumulative volume over dates requested. Data is returned in thousands. | [optional] 
**RequestId** | **string** | Identifier that was used for the request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

