# FactSet.SDK.FactSetBanks.Model.FilingUCC1
A single UCC-1 financing statement record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier as submitted in the request (e.g., ticker or entity ID) | [optional] 
**VendorFilingId** | **string** | Vendor filing identifier. Format varies by state. | [optional] 
**DebtorName** | **string** | Name of the party granting security interest. | [optional] 
**FilingState** | **string** | US state code where the UCC-1 was filed. | [optional] 
**EffectiveDate** | **DateTime** | Date when the financing statement becomes effective. | [optional] 
**ExpirationDate** | **DateTime** | Date when the financing statement expires (typically 5 years from effective date). | [optional] 
**EntityProperName** | **string** | Institution legal name | [optional] 
**FactsetEntityId** | **string** | FactSet entity identifier | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

