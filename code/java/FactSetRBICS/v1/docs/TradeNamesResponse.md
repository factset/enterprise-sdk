

# TradeNamesResponse

TradeNames Response. Always includes a top-level `metadata` object with request-level aggregate counts. The contents of each `data` item depend on the `responseFormat` chosen in the request. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**TradeNamesMetadata**](TradeNamesMetadata.md) |  |  [optional]
**data** | **java.util.List&lt;TradeName&gt;** | Array of TradeName objects, one per requested identifier. The presence of &#x60;summary&#x60; and &#x60;tradeNames&#x60; on each item is controlled by the request &#x60;responseFormat&#x60;.  |  [optional]


## Implemented Interfaces

* Serializable


