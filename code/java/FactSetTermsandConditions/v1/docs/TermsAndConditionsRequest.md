

# TermsAndConditionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  | 
**fields** | **java.util.List&lt;String&gt;** | List of Terms and Conditions data items. |  [optional]
**categories** | [**java.util.List&lt;CategoriesEnum&gt;**](#java.util.List&lt;CategoriesEnum&gt;) | Selects the Fixed Income metrics by major category - * **SECURITY_DETAILS** &#x3D; Detailed information about the security. * **COUPON_DETAILS** &#x3D; Coupon details. * **CONVERTIBLE_FEATURES** &#x3D; Features of convertible instruments. * **REDEMPTION_OPTIONS** &#x3D; Redemption options.  |  [optional]



## Enum: java.util.List&lt;CategoriesEnum&gt;

Name | Value
---- | -----
SECURITY_DETAILS | &quot;SECURITY_DETAILS&quot;
COUPON_DETAILS | &quot;COUPON_DETAILS&quot;
CONVERTIBLE_FEATURES | &quot;CONVERTIBLE_FEATURES&quot;
REDEMPTION_OPTIONS | &quot;REDEMPTION_OPTIONS&quot;


## Implemented Interfaces

* Serializable


