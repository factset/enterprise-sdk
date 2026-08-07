# FactSet.SDK.FactSetMacroeconomics.Model.Event
Economic event with common metadata and array of release records.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestedFdsCode** | **string** | FDS code provided in the &#x60;fdsCode&#x60; request parameter (echoed back). Returns &#x60;null&#x60; if &#x60;fdsCode&#x60; was not provided in the request. | [optional] 
**CountryCode** | **string** | ISO country code where the economic event occurred. Use the &#x60;/meta/events?type&#x3D;countries&#x60; endpoint to retrieve available country codes. This field echoes the &#x60;countryCode&#x60; filter supplied in the request and returns &#x60;null&#x60; when no &#x60;countryCode&#x60; filter is specified. | [optional] 
**Indicator** | **string** | Economic category or metric measured by this event. Use the &#x60;/meta/events?type&#x3D;indicators&#x60; endpoint to retrieve available indicators. This field echoes the &#x60;indicator&#x60; filter supplied in the request and returns &#x60;null&#x60; when no &#x60;indicator&#x60; filter is specified. | [optional] 
**Items** | [**List&lt;EventRelease&gt;**](EventRelease.md) | Array of release records for this economic event, including scheduled and historical releases. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

