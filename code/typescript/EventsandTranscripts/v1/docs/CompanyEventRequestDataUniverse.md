# eventsandtranscripts.CompanyEventRequestDataUniverse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbols** | **[String]** | Companies to return in the response.   - Only Tickers type can support multiple entries.  | 
**type** | **String** | NOTE:  - SEDOLs and ISINs are supported with the type tickers.  - Etf: Requires additionl access to get the data.   - AllCompanies: While using this, we should not pass any symbols in the symbols field.  | 



## Enum: TypeEnum


* `Tickers` (value: `"Tickers"`)

* `Index` (value: `"Index"`)

* `Etf` (value: `"Etf"`)

* `AllCompanies` (value: `"AllCompanies"`)




