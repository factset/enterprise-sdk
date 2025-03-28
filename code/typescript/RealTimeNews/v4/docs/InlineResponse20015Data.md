# realtimenews.InlineResponse20015Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | ISO 3166-1 alpha-2 code of the country. This attribute is set for each country, may be set for miscellaneous regions and is empty for regions of other types. | [optional] 
**name** | **String** | Name of the region. | [optional] 
**type** | **String** | Type of the region. | Value | Description | | --- | --- | | continent | Regions that are considered to be a continent in the context of the Market Data Gateway. | | country | A region that represents a country that has been assigned an official ISO 3166-1 code. | | subdivision | A region that represents a subdivision of a country that has been assigned an official ISO 3166-2 code. | | misc | A miscellaneous region represents a region that is neither a continent, nor a country, nor a subdivision of a country. | | compound | A compound miscellaneous region consists of member regions which are uniquely and undoubtedly defined. |   | [optional] 
**nestedRegions** | [**[GetBasicRegionGetDataNestedRegionsItems]**](GetBasicRegionGetDataNestedRegionsItems.md) | Nested regions of this region. | [optional] 



## Enum: TypeEnum


* `continent` (value: `"continent"`)

* `country` (value: `"country"`)

* `subdivision` (value: `"subdivision"`)

* `misc` (value: `"misc"`)

* `compound` (value: `"compound"`)




