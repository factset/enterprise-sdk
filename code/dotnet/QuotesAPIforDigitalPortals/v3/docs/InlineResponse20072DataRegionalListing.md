# FactSet.SDK.QuotesAPIforDigitalPortals.Model.InlineResponse20072DataRegionalListing
Listing-level data with a list of notations. If the set of listing identifiers contains an element for which the attribute `isPrimary = true`, then this element is the first one in the array.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsPrimary** | **bool?** | Indicates whether the listing identifier is the one for the primary listing among all listings with the same regional identifier (&#x60;true&#x60;) or not (&#x60;false&#x60;). | [optional] 
**PermanentIdentifier** | **string** | FactSet Permanent Identifier for a notation. The format is six alpha numeric characters, excluding vowels, with an L suffix (XXXXXX-L). | [optional] 
**TickerExchange** | **string** | FactSet market symbol of the notation, usually consisting of the ticker (e.g. \&quot;FDS\&quot; for FactSet Research Systems Inc.) and the three-character code of the exchange on which the listing is traded (example: FDS-NYS). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

