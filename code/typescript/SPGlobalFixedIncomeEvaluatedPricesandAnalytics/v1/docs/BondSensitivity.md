# spglobalfixedincomeevaluatedpricesandanalytics.BondSensitivity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used for the request. | [optional] 
**fsymId** | **String** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**date** | **Date** | The date on which the price is calculated. | [optional] 
**bidConvexity** | **Number** | Measures the change of Duration with the change in yield,based on the bid price .Available only  for &#x60;corporate bonds&#x60; and &#x60;municipal bonds&#x60;. | [optional] 
**midConvexity** | **Number** | Measures the change of duration with the change in yield,based on the mid price .Available only  for &#x60;corporate bonds&#x60; | [optional] 
**askConvexity** | **Number** | Measures the change of duration with the change in yield,based on the ask price .Available only  for &#x60;corporate bonds&#x60; | [optional] 
**bidEffectiveConvexity** | **Number** | The effective convexity based on the bid price .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**midEffectiveConvexity** | **Number** | The effective convexity based on the mid price .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**askEffectiveConvexity** | **Number** |  The effective convexity based on the ask price. Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**bidEffectiveDuration** | **Number** | A duration calculation for bonds with embedded options,based on the bid price. Effective duration takes into account that expected cash flows fluctuate as interest rates change. Available only  for &#x60;corporate bonds&#x60; | [optional] 
**midEffectiveDuration** | **Number** | A duration calculation for bonds with embedded options,based on the mid price. Effective duration takes into account that expected cash flows fluctuate as interest rates change .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**askEffectiveDuration** | **Number** | A duration calculation for bonds with embedded options,based on the ask price. Effective duration takes into account that expected cash flows fluctuate as interest rates change. Available only  for &#x60;corporate bonds&#x60; | [optional] 
**bidMacaulayDuration** | **Number** | The weighted average maturity of bond, where the weights are relative discounted cash flows in each period,based on the bid price .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**midMacaulayDuration** | **Number** | The weighted average maturity of bond, where the weights are relative discounted cash flows in each period,based on the mid price .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**askMacaulayDuration** | **Number** | The weighted average maturity of bond, where the weights are relative discounted cash flows in each period,based on the ask price .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**bidModifiedDuration** | **Number** | The first derivative of the bond price, with respect to yield,based on the bid price. | [optional] 
**midModifiedDuration** | **Number** | The first derivative of the bond price, with respect to yield,based on the mid price. Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**askModifiedDuration** | **Number** | The first derivative of the bond price, with respect to yield,based on the ask price. Available only  for &#x60;corporate bonds&#x60;. | [optional] 


