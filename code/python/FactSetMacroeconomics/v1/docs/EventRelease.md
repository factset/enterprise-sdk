# EventRelease

A single release record for an economic event, containing scheduled or historical release data.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_date_time** | **datetime** | Scheduled release date and time in UTC. | [optional] 
**event_name** | **str** | Name of the economic event. | [optional] 
**period** | **str, none_type** | Period identifier for the data covered by this release. Values may represent months (e.g., \&quot;Jan\&quot;, \&quot;Mar\&quot;), quarters (e.g., \&quot;Q1\&quot;, \&quot;Q4\&quot;), or other period formats such as \&quot;06/22\&quot;, depending on the economic indicator. | [optional] 
**actual** | **str, none_type** | Officially released value for this economic indicator, including units. Returns null for upcoming events or where no official figure has been published. | [optional] 
**prior** | **str, none_type** | Value from the immediately preceding period (including units), included for comparison with the current release. Returns null if not available. | [optional] 
**consensus** | **str, none_type** | Consensus market estimate for this release (including units). Returns null for events without published estimates. | [optional] 
**surprise** | **str, none_type** | A measure of how the actual released value compared to the market consensus estimate. Returns null if either &#x60;actual&#x60; or &#x60;consensus&#x60; is unavailable. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


