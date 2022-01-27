

# DebtInstrumentNotationScreenerSearchDataValidationMarketPriority

Sequence of markets specifying the priority order of the markets for the selection of one notation per instrument. If for a given instrument with two matching notations, A and B, the market of notation A precedes the market of notation B in this list or if the market of notation B is not in this list, A is selected. If neither of the markets is in this list, the notation with the highest trading volume, averaged over one month, is selected.          The list does not restrict the request to only those markets (use the parameter `market.selection` for that purpose).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.Set&lt;BigDecimal&gt;** | List of market identifiers. |  [optional]


## Implemented Interfaces

* Serializable


