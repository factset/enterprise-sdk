# FactSet.SDK.FactSetBenchmarks.Model.BenchmarkConstituent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | Benchmark Id | [optional] 
**Date** | **DateTime?** | Date of weight and shares. | [optional] 
**FsymSecurityId** | **string** | FactSet Security Identifier (-S). If Cash or Generic Id holding, response will just pass through generic id (e.g. CASH_USD). | [optional] 
**FsymRegionalId** | **string** | FactSet Regional Identifier (-R). If Cash or Generic Id holding, response will just pass through generic id (e.g. CASH_USD). | [optional] 
**Currency** | **string** | Currency code for prices. | [optional] 
**WeightClose** | **double?** | Weight of Security in benchmark (percent). | [optional] 
**AdjHolding** | **double?** | Shares held adjusted. Units in Millions. | [optional] 
**UnadjHolding** | **double?** | Shares held unadjusted. Units in Millions. | [optional] 
**Price** | **double?** | Price of shares held. | [optional] 
**AdjMarketValue** | **double?** | Market value adjusted. Market Value represented in Millions. | [optional] 
**RequestId** | **string** | Identifier specified in the request | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

