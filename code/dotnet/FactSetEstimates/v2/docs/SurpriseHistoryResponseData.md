# FactSet.SDK.FactSetEstimates.Model.SurpriseHistoryResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**FsymId** | **string** | FactSet regional security identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**Periodicity** | **string** | Periodicity or frequency of the fiscal periods. | [optional] 
**EstimateType** | **string** | The requested estimate type | [optional] 
**SurpriseHistory** | [**List&lt;SurpriseHistory&gt;**](SurpriseHistory.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

