# FactSet.SDK.FactSetOwnership.Model.SecurityHoldersRequest
Security Holders Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | Security Requested for Holders information. | 
**HolderType** | [**HolderType**](HolderType.md) |  | [optional] 
**Date** | **string** | Date of holdings expressed in YYYY-MM-DD format. | [optional] 
**Topn** | **string** | Limits number of holdings or holders displayed by the top *n* securities. Default is ALL, or use integer to limit number. | [optional] [default to "ALL"]
**Currency** | **string** | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

