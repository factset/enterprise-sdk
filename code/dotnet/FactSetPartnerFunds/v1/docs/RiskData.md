# FactSet.SDK.FactSetPartnerFunds.Model.RiskData
Risk data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The input identifier. | [optional] 
**Error** | [**InvalidIdErrorObject**](InvalidIdErrorObject.md) |  | [optional] 
**AsOfDate** | **DateTime?** | Date when fund risk data was reported by vendor. | [optional] 
**RiskRating** | **string** | Rating that fund company assesses to their own funds via the prospectus. | [optional] 
**RiskProspectus** | **string** | A summary highlighting the key risks and investor suitability for the investment product. | [optional] 
**RiskResponseInfo** | [**List&lt;RiskResponseInfo&gt;**](RiskResponseInfo.md) | Array of risk metrics by year. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

