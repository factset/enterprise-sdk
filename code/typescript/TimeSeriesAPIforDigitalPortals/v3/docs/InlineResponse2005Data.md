# timeseriesapifordigitalportals.InlineResponse2005Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**range** | [**InlineResponse200DataRange**](InlineResponse200DataRange.md) |  | [optional] 
**quality** | **String** | Quality of the price. | [optional] 
**prices** | [**[InlineResponse2005DataPrices]**](InlineResponse2005DataPrices.md) | Time series of prices. For the attributes first, last, low, high, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for their unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). | [optional] 



## Enum: QualityEnum


* `DLY` (value: `"DLY"`)

* `EOD` (value: `"EOD"`)




