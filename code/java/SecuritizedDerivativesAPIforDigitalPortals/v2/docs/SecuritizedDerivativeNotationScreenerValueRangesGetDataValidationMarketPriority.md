

# SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketPriority

Sequence of markets specifying the priority order of the markets for the selection of one notation per instrument. If for a given instrument with two matching notations, A and B, the market of notation A precedes the market of notation B in this list, A will be selected. The list does not restrict the request to only those markets (use the parameter `market.selection` for that purpose).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.Set&lt;BigDecimal&gt;** | List of market identifiers. |  [optional]


## Implemented Interfaces

* Serializable


