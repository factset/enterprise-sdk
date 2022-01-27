# FactSet.SDK.FactSetTermsandConditions.Model.TermsAndConditionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  | 
**Fields** | **List&lt;string&gt;** | List of Terms and Conditions data items. | [optional] 
**Categories** | **List&lt;string&gt;** | Selects the Fixed Income metrics by major category - * **SECURITY_DETAILS** &#x3D; Detailed information about the security. * **COUPON_DETAILS** &#x3D; Coupon details. * **CONVERTIBLE_FEATURES** &#x3D; Features of convertible instruments. * **REDEMPTION_OPTIONS** &#x3D; Redemption options.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

