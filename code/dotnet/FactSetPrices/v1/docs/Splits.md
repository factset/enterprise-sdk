# FactSet.SDK.FactSetPrices.Model.Splits

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**Date** | **DateTime?** | Ex-Date of the split expressed in YYYY-MM-DD format. | [optional] 
**SplitFactor** | **double?** | Split adjustment factor for n splits ago. A 2-for-1 split returns .50, the number you would multiply the stock price by to adjust for the split. | [optional] 
**SplitComment** | **string** | Description for the type of split or spin off. | [optional] 
**RequestId** | **string** | Identifier that was used for the request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

