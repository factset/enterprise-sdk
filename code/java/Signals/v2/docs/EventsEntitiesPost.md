

# EventsEntitiesPost


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | [**DateTimeInterval**](DateTimeInterval.md) | A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. |  [optional]
**updated** | [**DateTimeInterval**](DateTimeInterval.md) | A date/time (UTC) interval for filtering signal events based on their last updated date. Defaults to NOW - 24 hours if omitted. |  [optional]
**signalIds** | **String** | Comma delimited string of signalIds |  [optional]
**themes** | **String** | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. |  [optional]
**categories** | **String** | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. |  [optional]
**userRelevanceScore** | [**RelevanceScoreRange**](RelevanceScoreRange.md) | A range for filtering signal events based on their relevancy score. |  [optional]


## Implemented Interfaces

* Serializable


