# TermsAndConditionsRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[str]** | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  | 
**fields** | **[str]** | List of Terms and Conditions data items. | [optional] 
**categories** | **[str]** | Selects the Fixed Income metrics by major category - * **SECURITY_DETAILS** &#x3D; Detailed information about the security. * **COUPON_DETAILS** &#x3D; Coupon details. * **CONVERTIBLE_FEATURES** &#x3D; Features of convertible instruments. * **REDEMPTION_OPTIONS** &#x3D; Redemption options.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


