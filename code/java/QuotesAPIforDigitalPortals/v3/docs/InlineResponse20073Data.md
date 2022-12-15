

# InlineResponse20073Data

Instrument data with a list of regional-level data and assigned listing-level data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idInstrument** | **String** | MDG identifier of the instrument. |  [optional]
**sourceIdentifier** | **String** | Identifier used in the request. |  [optional]
**permanentIdentifier** | **String** | FactSet Permanent Identifier for an instrument. The format is six alpha numeric characters, excluding vowels, with an S suffix (XXXXXX-S). |  [optional]
**regional** | [**java.util.List&lt;InlineResponse20072DataRegional&gt;**](InlineResponse20072DataRegional.md) | Regional-level data with assigned listing-level data. If the set of regional identifiers contains an element for which the attribute &#x60;isPrimary &#x3D; true&#x60;, then this element is the first one in the array. |  [optional]


## Implemented Interfaces

* Serializable


