

# RedemptionPricesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  | 
**categories** | [**CategoriesEnum**](#CategoriesEnum) | Filters the list of Redemption Prices Categories -   * **CALL** &#x3D; Call prices.   * **PUT** &#x3D; Put prices.   * **SF** &#x3D; Sinking Fund prices.  | 



## Enum: CategoriesEnum

Name | Value
---- | -----
ALL | &quot;ALL&quot;
CALL | &quot;CALL&quot;
PUT | &quot;PUT&quot;
SF | &quot;SF&quot;


## Implemented Interfaces

* Serializable


