# factsetprices.Price

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**date** | **Date** | Ending date for the period expressed in YYYY-MM-DD format. | [optional] 
**adjDate** | **Date** | Date of last split for which prices and volume have been adjusted. Use /factset-prices/v#/splits endpoint for details regarding the split. | [optional] 
**currency** | **String** | Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**price** | **Number** | Closing Price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET. | [optional] 
**priceOpen** | **Number** | Open price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET. | [optional] 
**priceHigh** | **Number** | High closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET. | [optional] 
**priceLow** | **Number** | Low closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET. | [optional] 
**volume** | **Number** | Returns the cumulative volume over dates requested. Data is returned in thousands. | [optional] 
**requestId** | **String** | Identifier that was used for the request. | [optional] 


