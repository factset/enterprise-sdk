# FactSet.SDK.FactSetMergersandAcquisitions.Model.DealCompany

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DealId** | **string** | Identifier for the deal. | [optional] 
**Target** | [**Target**](Target.md) |  | [optional] 
**Buyers** | [**List&lt;Participant&gt;**](Participant.md) | Array of participants in the deal who are buyers. | [optional] 
**Sellers** | [**List&lt;Participant&gt;**](Participant.md) | Array of participants in the deal who are sellers. | [optional] 
**DealType** | **string** | Type of deal. | [optional] 
**AnnounceDate** | **DateTime** | Date the deal was announced. If the deal has a status of &#x60;rumor&#x60; or &#x60;rumor cancelled&#x60;, then this may be the same as &#x60;rumorDate&#x60;. | [optional] 
**CloseDate** | **DateTime?** | Date the deal was closed. | [optional] 
**TransactionValue** | **decimal?** | Base Equity Value plus the value of the target’s outstanding net debt (where applicable). The target&#39;s outstanding net debt is defined as the total amount of short and long term interest-bearing debt less any cash and cash equivalents. The target&#39;s outstanding net debt will only be included in the Transaction Value calculation if a.) the acquirer is seeking to own 100% of the target, b.) the target is a non-financial company; and c.) the target&#39;s outstanding net debt is publicly disclosed (or the acquirer publicly states it is assuming a specific amount of liabilities). Otherwise, Transaction Value will be equal to the amount paid for the portion of the target acquired (Base Equity Value) and will exclude the target&#39;s outstanding net debt. Amounts returned are in USD. | [optional] 
**Status** | **string** | Status of the deal  | [optional] 
**RequestId** | **string** | Identifier that was used for the request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

