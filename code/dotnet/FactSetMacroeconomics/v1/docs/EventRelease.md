# FactSet.SDK.FactSetMacroeconomics.Model.EventRelease
A single release record for an economic event, containing scheduled or historical release data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventDateTime** | **DateTime** | Scheduled release date and time in UTC. | [optional] 
**EventName** | **string** | Name of the economic event. | [optional] 
**Period** | **string** | Period identifier for the data covered by this release. Values may represent months (e.g., \&quot;Jan\&quot;, \&quot;Mar\&quot;), quarters (e.g., \&quot;Q1\&quot;, \&quot;Q4\&quot;), or other period formats such as \&quot;06/22\&quot;, depending on the economic indicator. | [optional] 
**Actual** | **string** | Officially released value for this economic indicator, including units. Returns null for upcoming events or where no official figure has been published. | [optional] 
**Prior** | **string** | Value from the immediately preceding period (including units), included for comparison with the current release. Returns null if not available. | [optional] 
**Consensus** | **string** | Consensus market estimate for this release (including units). Returns null for events without published estimates. | [optional] 
**Surprise** | **string** | A measure of how the actual released value compared to the market consensus estimate. Returns null if either &#x60;actual&#x60; or &#x60;consensus&#x60; is unavailable. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

