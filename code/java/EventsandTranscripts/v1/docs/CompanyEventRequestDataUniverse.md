

# CompanyEventRequestDataUniverse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbols** | **java.util.List&lt;String&gt;** | Companies to return in the response.   - Only Tickers type can support multiple entries.  | 
**type** | [**TypeEnum**](#TypeEnum) | NOTE:  - Etf: Requires additionl access to get the data.   - AllCompanies: While using this, we should not pass any symbols in the symbols field.  | 



## Enum: TypeEnum

Name | Value
---- | -----
TICKERS | &quot;Tickers&quot;
INDEX | &quot;Index&quot;
ETF | &quot;Etf&quot;
ALLCOMPANIES | &quot;AllCompanies&quot;


## Implemented Interfaces

* Serializable


