

# InlineResponse20070DataRegional


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isPrimary** | **Boolean** | Indicates whether the regional identifier is the primary regional identifier of the security (&#x60;true&#x60;) or not (&#x60;false&#x60;). |  [optional]
**permanentIdentifier** | **String** | FactSet Permanent Identifier for a set of one or more notations of the same region with the same value unit. The format is six alpha numeric characters, excluding vowels, with an R suffix (XXXXXX-R). |  [optional]
**tickerRegion** | **String** | FactSet regional symbol of the notation, consisting of the ticker and the two-character code of the country or region where the listing is traded (example: FDS-US). |  [optional]
**listing** | [**java.util.List&lt;InlineResponse20070DataListing&gt;**](InlineResponse20070DataListing.md) | Listing-level data with a list of notations. If the set of listing identifiers contains an element for which the attribute &#x60;isPrimary &#x3D; true&#x60;, then this element is the first one in the array. |  [optional]


## Implemented Interfaces

* Serializable


