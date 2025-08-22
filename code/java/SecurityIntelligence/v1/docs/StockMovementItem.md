

# StockMovementItem

Model for stock movement data item.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | Title of the company summary | 
**content** | **String** | Detailed content of the company summary | 
**generatedTimestamp** | **OffsetDateTime** | Timestamp when the summary was generated in ISO 8601 format (YYYY-MM-DDTHH:MM:SSZ) | 
**references** | [**java.util.List&lt;Reference&gt;**](Reference.md) | List of references cited in the content | 
**competitors** | [**java.util.List&lt;Competitor&gt;**](Competitor.md) | List of competitor companies and their performance | 


## Implemented Interfaces

* Serializable


