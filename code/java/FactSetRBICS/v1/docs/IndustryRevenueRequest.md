

# IndustryRevenueRequest

Industry Revenue Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rbicsIds** | **java.util.List&lt;String&gt;** | RBICS Level 6 Sub-Industry ID Filter. **Note**: Only Level 6 IDs are supported for this endpoint. A complete list of valid Level 6 IDs can be retrieved using the &#x60;/structure&#x60; endpoints. | 
**startDate** | **LocalDate** | Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The &#x60;startDate&#x60; must be equal to or before the &#x60;endDate&#x60;. Future dates (T+1) are not accepted in this endpoint. &lt;br&gt; Note: &lt;br&gt; - If omitted while &#x60;endDate&#x60; is specified: Data will be fetched from the earliest available record up to the specified end date. &lt;br&gt; - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data. |  [optional]
**endDate** | **LocalDate** | Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The &#x60;endDate&#x60; must be equal to or after the &#x60;startDate&#x60;. Future dates (T+1) are not accepted in this endpoint. &lt;br&gt; Note: &lt;br&gt; - If omitted (with &#x60;startDate&#x60; specified): Data will be returned from the specified start date up to the most recent available date. &lt;br&gt; - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data. |  [optional]


## Implemented Interfaces

* Serializable


