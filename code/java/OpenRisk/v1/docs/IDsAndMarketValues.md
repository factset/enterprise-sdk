

# IDsAndMarketValues

Security IDs and market values; the arrays must have the same number of items. Public security IDs such as SEDOL, CUSIP, ISIN, and Ticker are supported. If proprietary IDs are provided, they need to be mapped via composite assets. Market values are used to calculate weights and do not have to be normalized, but need to be denominated in the single same currency ISO.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** |  | 
**marketValues** | **java.util.List&lt;Double&gt;** |  | 


## Implemented Interfaces

* Serializable


