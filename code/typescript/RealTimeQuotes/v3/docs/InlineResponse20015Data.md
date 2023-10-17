# realtimequotes.InlineResponse20015Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | ISO 3166-1 alpha-2 code of the country. This attribute is set for each country, may be set for miscellaneous regions and is empty for regions of other types. | [optional] 
**name** | **String** | Name of the region. | [optional] 
**type** | **String** | Type of the region. | [optional] 
**nestedRegions** | [**[InlineResponse20015DataNestedRegions]**](InlineResponse20015DataNestedRegions.md) | Nested regions of this region. | [optional] 



## Enum: TypeEnum


* `continent` (value: `"continent"`)

* `country` (value: `"country"`)

* `subdivision` (value: `"subdivision"`)

* `misc` (value: `"misc"`)

* `compound` (value: `"compound"`)




