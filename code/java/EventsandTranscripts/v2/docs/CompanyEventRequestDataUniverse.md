

# CompanyEventRequestDataUniverse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbols** | **java.util.List&lt;String&gt;** | Companies to return in the response | 
**type** | [**TypeEnum**](#TypeEnum) | * Tickers: Represents individual stock symbols, unique identifiers for company shares.  * Index: Refers to market indices, tracking stock group performance as benchmarks.  * Etf: Stands for Exchange Traded Funds, traded like stocks, tracking indices or sectors.  * AllCompanies: Encompasses all publicly traded companies available for investment or analysis. | 



## Enum: TypeEnum

Name | Value
---- | -----
TICKERS | &quot;Tickers&quot;
INDEX | &quot;Index&quot;
ETF | &quot;Etf&quot;
ALLCOMPANIES | &quot;AllCompanies&quot;


## Implemented Interfaces

* Serializable


