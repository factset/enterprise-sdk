# FactSet.SDK.FactSetMacroeconomics.Model.ReferenceItem
Reference item representing either an indicator, country, FDS code, or timezone. The structure depends on the requested type parameter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemType** | **ItemTypeTimezone** |  | 
**Code** | **string** | Time zone value in GMT offset format for use with the &#x60;timeZone&#x60; parameter.  | 
**Name** | **string** | Human-readable display name for the country. | 
**Country** | **string** | Country name. | 
**EventName** | **string** | Name of the economic event associated with this FDS code. | 
**SourceName** | **string** | Source organization or data provider. | 
**Description** | **string** | IANA time zone name or abbreviation representing the GMT offset. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

