

# InlineResponse20010Data

Subsampled time series data for the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**range** | [**InlineResponse2004DataRange**](InlineResponse2004DataRange.md) |  |  [optional]
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. |  [optional]
**subsamples** | [**java.util.List&lt;InlineResponse20010DataSubsamples&gt;**](InlineResponse20010DataSubsamples.md) | List of summary records. For the attributes first, last, low, high, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for their unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). |  [optional]



## Enum: QualityEnum

Name | Value
---- | -----
RLT | &quot;RLT&quot;
DLY | &quot;DLY&quot;


## Implemented Interfaces

* Serializable


