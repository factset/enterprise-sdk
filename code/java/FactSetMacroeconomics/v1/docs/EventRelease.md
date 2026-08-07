

# EventRelease

A single release record for an economic event, containing scheduled or historical release data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventDateTime** | **OffsetDateTime** | Scheduled release date and time in UTC. |  [optional]
**eventName** | **String** | Name of the economic event. |  [optional]
**period** | **String** | Period identifier for the data covered by this release. Values may represent months (e.g., \&quot;Jan\&quot;, \&quot;Mar\&quot;), quarters (e.g., \&quot;Q1\&quot;, \&quot;Q4\&quot;), or other period formats such as \&quot;06/22\&quot;, depending on the economic indicator. |  [optional]
**actual** | **String** | Officially released value for this economic indicator, including units. Returns null for upcoming events or where no official figure has been published. |  [optional]
**prior** | **String** | Value from the immediately preceding period (including units), included for comparison with the current release. Returns null if not available. |  [optional]
**consensus** | **String** | Consensus market estimate for this release (including units). Returns null for events without published estimates. |  [optional]
**surprise** | **String** | A measure of how the actual released value compared to the market consensus estimate. Returns null if either &#x60;actual&#x60; or &#x60;consensus&#x60; is unavailable. |  [optional]


## Implemented Interfaces

* Serializable


