

# PostNewsArticleListRequestDataFilterRange

Time range for matching the news article's date. At most one of the attributes `start` or `end` may be `null`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **OffsetDateTime** | The starting point of the time range (inclusive), or &#x60;null&#x60; to indicate that the time range extends indefinitely into the past. | 
**end** | **OffsetDateTime** | The ending point of the time range (exclusive), or &#x60;null&#x60; to indicate that the time range extends indefinitely into the future. | 


## Implemented Interfaces

* Serializable


