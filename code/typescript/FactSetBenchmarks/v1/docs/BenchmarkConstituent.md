# factsetbenchmarks.BenchmarkConstituent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Benchmark Id | [optional] 
**date** | **Date** | Date of weight and shares. | [optional] 
**fsymSecurityId** | **String** | FactSet Security Identifier (-S). If Cash or Generic Id holding, response will just pass through generic id (e.g. CASH_USD). | [optional] 
**fsymRegionalId** | **String** | FactSet Regional Identifier (-R). If Cash or Generic Id holding, response will just pass through generic id (e.g. CASH_USD). | [optional] 
**currency** | **String** | Currency code for prices. | [optional] 
**weightClose** | **Number** | Weight of Security in benchmark (percent). | [optional] 
**adjHolding** | **Number** | Shares held adjusted. Units in Millions. | [optional] 
**unadjHolding** | **Number** | Shares held unadjusted. Units in Millions. | [optional] 
**price** | **Number** | Price of shares held. | [optional] 
**adjMarketValue** | **Number** | Market value adjusted. Market Value represented in Millions. | [optional] 
**requestId** | **String** | Identifier specified in the request | [optional] 


