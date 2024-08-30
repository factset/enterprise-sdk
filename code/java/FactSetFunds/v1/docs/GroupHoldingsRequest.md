

# GroupHoldingsRequest

Returns Group Holdings Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | The requested Fund Identifier. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt;  | 
**asOfDate** | **String** | As of date for historical group holdings in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  |  [optional]
**group** | **Group** |  |  [optional]


## Implemented Interfaces

* Serializable


