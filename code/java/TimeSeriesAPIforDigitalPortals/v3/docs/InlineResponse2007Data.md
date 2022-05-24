

# InlineResponse2007Data

Subsampled time series data for the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**range** | [**InlineResponse200DataRange**](InlineResponse200DataRange.md) |  |  [optional]
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. |  [optional]
**subsamples** | [**java.util.List&lt;InlineResponse2007DataSubsamples&gt;**](InlineResponse2007DataSubsamples.md) | List of summary records. For the attributes first, last, low, high, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for their unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). |  [optional]



## Enum: QualityEnum

Name | Value
---- | -----
DLY | &quot;DLY&quot;
EOD | &quot;EOD&quot;


## Implemented Interfaces

* Serializable


