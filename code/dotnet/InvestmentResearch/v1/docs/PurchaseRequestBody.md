# FactSet.SDK.InvestmentResearch.Model.PurchaseRequestBody
Purchase request body elements

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DocumentIds** | **List&lt;string&gt;** | Requested document identifiers obtained from the &#x60;documentId&#x60; field of a &#x60;/search&#x60; response. Maximum 1000 IDs per request. | 
**Fields** | **List&lt;string&gt;** | Optional list of metadata fields to include in each returned document. When omitted, all fields are returned. At minimum, &#x60;documentId&#x60; and &#x60;purchaseLink&#x60; are always included regardless of this parameter. Valid values correspond to the property names of &#x60;PurchaseDocument&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

