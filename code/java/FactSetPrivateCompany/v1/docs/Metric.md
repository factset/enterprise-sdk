

# Metric

Metric Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metric** | **String** | Data item to be used as &#x60;metrics&#x60; input in &#x60;/factset-private-company/v#/&#x60; endpoint. |  [optional]
**description** | **String** | Description of the metric. |  [optional]
**category** | **String** | Corresponding endpoint to input metric item. For example, metrics returning the category &#39;FINANCIALS&#39; should be used in the &#x60;/financials&#x60; endpoint. The same follows data items falling in the category for NON_PERIODIC, which would be used in the &#x60;/non-periodic&#x60; endpoint. |  [optional]
**factor** | **Integer** | The factor for the metric (e.g. 1000 &#x3D; thousands). |  [optional]
**sdfName** | **String** | The name of the data item as it appears in the Standard Data Feed (SDF). A null value represents items available only in API. |  [optional]


## Implemented Interfaces

* Serializable


