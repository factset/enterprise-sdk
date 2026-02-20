

# InlineResponse2003


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**java.util.List&lt;BulkDeleteRespItem&gt;**](BulkDeleteRespItem.md) | A list of the various backend responses needed for the bulk delete. These typically contain data points that failed to be deleted, and are in the order of: &lt;br&gt;Delete values by symbol, date, and field + delete values by symbol and field &lt;br&gt;Delete dates by field + delete dates &lt;br&gt;Delete dates by symbol &lt;br&gt;Delete fields &lt;br&gt;Delete symbols |  [optional]


## Implemented Interfaces

* Serializable


