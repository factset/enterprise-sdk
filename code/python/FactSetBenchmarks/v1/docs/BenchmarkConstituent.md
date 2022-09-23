# BenchmarkConstituent


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | Benchmark Id | [optional] 
**date** | **date, none_type** | Date of weight and shares. | [optional] 
**fsym_security_id** | **str, none_type** | FactSet Security Identifier (-S). If Cash or Generic Id holding, response will just pass through generic id (e.g. CASH_USD). | [optional] 
**fsym_regional_id** | **str, none_type** | FactSet Regional Identifier (-R). If Cash or Generic Id holding, response will just pass through generic id (e.g. CASH_USD). | [optional] 
**currency** | **str, none_type** | Currency code for prices. | [optional] 
**weight_close** | **float, none_type** | Weight of Security in benchmark (percent). | [optional] 
**adj_holding** | **float, none_type** | Shares held adjusted. Units in Millions. | [optional] 
**unadj_holding** | **float, none_type** | Shares held unadjusted. Units in Millions. | [optional] 
**price** | **float, none_type** | Price of shares held. | [optional] 
**adj_market_value** | **float, none_type** | Market value adjusted. Market Value represented in Millions. | [optional] 
**request_id** | **str** | Identifier specified in the request | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


