# FactSet.SDK.FactSetTermsandConditions.Model.RedemptionPrice
Redemption Price Data Items for a Fixed Income security.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Security identifier used in the request. | 
**FsymId** | **string** | FactSet Permanent Security Identifier. | 
**Date** | **DateTime** | Date of the Redemption Price. | 
**Category** | **string** | Redemption Price Category - * **CALL** &#x3D; Call prices. * **PUT** &#x3D; Put prices. * **SF** &#x3D; Sinking Fund prices.  | 
**MinAmt** | **double** | Sinking Fund minimum amount. | [optional] 
**Price** | **double** | Redemption price for the category. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

