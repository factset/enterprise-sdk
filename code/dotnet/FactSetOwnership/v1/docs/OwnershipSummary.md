# FactSet.SDK.FactSetOwnership.Model.OwnershipSummary
Ownership Summary response object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier that was used in the request. | [optional] 
**FsymId** | **string** | FactSet Security Identifier of Fund. Identifies the security level id of the Fund requested (not-representing the underlying holding). Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. | [optional] 
**SharesOutstanding** | **double?** | Number of shares outstanding for the security. | [optional] 
**PercentTotalOutstanding** | **double?** | Position held as a percentage of the total outstanding shares of the security. | [optional] 
**PercentInstitutionalOutstanding** | **double?** | Position held by institutional holders as a percentage of total outstanding shares. | [optional] 
**PercentTopTenInstitutional** | **double?** | Position held by the top 10 institutional holders as a percentage of total outstanding shares. | [optional] 
**PercentInsiderOutstanding** | **double?** | Position held by insiders as a percentage of total outstanding shares. | [optional] 
**AsOfDate** | **DateTime?** | Date as of which the ownership data is current. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

