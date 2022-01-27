# factsettermsandconditions.TermsAndConditionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  | 
**fields** | **[String]** | List of Terms and Conditions data items. | [optional] 
**categories** | **[String]** | Selects the Fixed Income metrics by major category - * **SECURITY_DETAILS** &#x3D; Detailed information about the security. * **COUPON_DETAILS** &#x3D; Coupon details. * **CONVERTIBLE_FEATURES** &#x3D; Features of convertible instruments. * **REDEMPTION_OPTIONS** &#x3D; Redemption options.  | [optional] 



## Enum: [CategoriesEnum]


* `SECURITY_DETAILS` (value: `"SECURITY_DETAILS"`)

* `COUPON_DETAILS` (value: `"COUPON_DETAILS"`)

* `CONVERTIBLE_FEATURES` (value: `"CONVERTIBLE_FEATURES"`)

* `REDEMPTION_OPTIONS` (value: `"REDEMPTION_OPTIONS"`)




