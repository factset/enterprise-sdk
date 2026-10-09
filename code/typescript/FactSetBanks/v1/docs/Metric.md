# factsetbanks.Metric

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metric** | **String** | Metric code identifier | [optional] 
**category** | **String** | Primary category of the metric | [optional] 
**subcategory** | **String** | Sub-category classification | [optional] 
**dataType** | **String** | Data type of metric values | [optional] 
**description** | **String** | Detailed description of the metric | [optional] 
**oaPageId** | **String** | Online Assistant page ID for methodology | [optional] 
**oaUrl** | **String** | Online Assistant URL for methodology | [optional] 
**subsidiary** | **Boolean** | Whether this metric requires a subsidiary entity identifier. Use &#x60;/search-entities&#x60; with the appropriate reportType to resolve the correct subsidiary identifier if true.  | [optional] [default to false]
**holding** | **Boolean** | Whether this metric requires a holding company (parent) entity identifier. Use &#x60;/search-entities&#x60; with the appropriate reportType to resolve the correct holding company identifier if true.  | [optional] [default to false]



## Enum: CategoryEnum


* `FINANCIALS` (value: `"FINANCIALS"`)

* `FILINGS` (value: `"FILINGS"`)

* `PERFORMANCE` (value: `"PERFORMANCE"`)

* `EXPOSURE` (value: `"EXPOSURE"`)





## Enum: SubcategoryEnum


* `US` (value: `"US"`)

* `CANADA` (value: `"CANADA"`)

* `AUSTRALIA` (value: `"AUSTRALIA"`)

* `CREDIT_UNION` (value: `"CREDIT_UNION"`)

* `INDUSTRY` (value: `"INDUSTRY"`)

* `SPECIALTY_FINANCE` (value: `"SPECIALTY_FINANCE"`)

* `TEN_D_AUTO_LOAN` (value: `"TEN_D_AUTO_LOAN"`)

* `TEN_D_CREDIT_CARD` (value: `"TEN_D_CREDIT_CARD"`)

* `UBPR` (value: `"UBPR"`)

* `COUNTRY` (value: `"COUNTRY"`)





## Enum: DataTypeEnum


* `string` (value: `"string"`)

* `number` (value: `"number"`)

* `date` (value: `"date"`)

* `boolean` (value: `"boolean"`)




