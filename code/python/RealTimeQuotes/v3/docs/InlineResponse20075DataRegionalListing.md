# InlineResponse20075DataRegionalListing

Listing-level data with a list of notations. If the set of listing identifiers contains an element for which the attribute `isPrimary = true`, then this element is the first one in the array.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_primary** | **bool, none_type** | Indicates whether the listing identifier is the one for the primary listing among all listings with the same regional identifier (&#x60;true&#x60;) or not (&#x60;false&#x60;). | [optional] 
**permanent_identifier** | **str, none_type** | FactSet Permanent Identifier for a notation. The format is six alpha numeric characters, excluding vowels, with an L suffix (XXXXXX-L). | [optional] 
**ticker_exchange** | **str, none_type** | FactSet market symbol of the notation, usually consisting of the ticker (e.g. \&quot;FDS\&quot; for FactSet Research Systems Inc.) and the three-character code of the exchange on which the listing is traded (example: FDS-NYS). | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


