

# InlineResponse20015Data

Details of a region.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | ISO 3166-1 alpha-2 code of the country. This attribute is set for each country, may be set for miscellaneous regions and is empty for regions of other types. |  [optional]
**name** | **String** | Name of the region. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of the region. |  [optional]
**nestedRegions** | [**java.util.List&lt;InlineResponse20015DataNestedRegions&gt;**](InlineResponse20015DataNestedRegions.md) | Nested regions of this region. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
CONTINENT | &quot;continent&quot;
COUNTRY | &quot;country&quot;
SUBDIVISION | &quot;subdivision&quot;
MISC | &quot;misc&quot;
COMPOUND | &quot;compound&quot;


## Implemented Interfaces

* Serializable


