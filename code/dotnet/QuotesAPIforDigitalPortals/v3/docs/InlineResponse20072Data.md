# FactSet.SDK.QuotesAPIforDigitalPortals.Model.InlineResponse20072Data
Instrument data with a list of regional-level data and assigned listing-level data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Instrument** | [**InlineResponse20072DataInstrument**](InlineResponse20072DataInstrument.md) |  | [optional] 
**PermanentIdentifier** | **string** | FactSet Permanent Identifier for an instrument. The format is six alpha numeric characters, excluding vowels, with an S suffix (XXXXXX-S). | [optional] 
**Regional** | [**List&lt;InlineResponse20072DataRegional&gt;**](InlineResponse20072DataRegional.md) | Regional-level data with assigned listing-level data. If the set of regional identifiers contains an element for which the attribute &#x60;isPrimary &#x3D; true&#x60;, then this element is the first one in the array. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

