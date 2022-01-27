# factsettermsandconditions.RedemptionPricesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  | 
**categories** | **String** | Filters the list of Redemption Prices Categories -   * **CALL** &#x3D; Call prices.   * **PUT** &#x3D; Put prices.   * **SF** &#x3D; Sinking Fund prices.  | 



## Enum: CategoriesEnum


* `ALL` (value: `"ALL"`)

* `CALL` (value: `"CALL"`)

* `PUT` (value: `"PUT"`)

* `SF` (value: `"SF"`)




