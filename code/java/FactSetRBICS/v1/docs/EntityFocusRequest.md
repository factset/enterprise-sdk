

# EntityFocusRequest

Entity Focus Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. Max Ids of 2500.  |  [optional]
**date** | **String** | Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity.  |  [optional]
**levels** | **java.util.List&lt;Integer&gt;** | List of RBICS industry levels to include in the response. **By default if left blank, all levels are returned.**  |  [optional]
**includeNames** | **Boolean** | Option to include or exclude industry Names and the L6 Description. True &#x3D; Include Names; False &#x3D; Exclude Names.  |  [optional]


## Implemented Interfaces

* Serializable


