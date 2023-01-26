

# BondSensitivity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used for the request. |  [optional]
**fsymId** | **String** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. |  [optional]
**date** | **LocalDate** | The date on which the price is calculated. |  [optional]
**bidConvexity** | **Double** | Measures the change of Duration with the change in yield,based on the bid price .Available only  for &#x60;corporate bonds&#x60; and &#x60;municipal bonds&#x60;. |  [optional]
**midConvexity** | **Double** | Measures the change of duration with the change in yield,based on the mid price .Available only  for &#x60;corporate bonds&#x60; |  [optional]
**askConvexity** | **Double** | Measures the change of duration with the change in yield,based on the ask price .Available only  for &#x60;corporate bonds&#x60; |  [optional]
**bidEffectiveConvexity** | **Double** | The effective convexity based on the bid price .Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**midEffectiveConvexity** | **Double** | The effective convexity based on the mid price .Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**askEffectiveConvexity** | **Double** |  The effective convexity based on the ask price. Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**bidEffectiveDuration** | **Double** | A duration calculation for bonds with embedded options,based on the bid price. Effective duration takes into account that expected cash flows fluctuate as interest rates change. Available only  for &#x60;corporate bonds&#x60; |  [optional]
**midEffectiveDuration** | **Double** | A duration calculation for bonds with embedded options,based on the mid price. Effective duration takes into account that expected cash flows fluctuate as interest rates change .Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**askEffectiveDuration** | **Double** | A duration calculation for bonds with embedded options,based on the ask price. Effective duration takes into account that expected cash flows fluctuate as interest rates change. Available only  for &#x60;corporate bonds&#x60; |  [optional]
**bidMacaulayDuration** | **Double** | The weighted average maturity of bond, where the weights are relative discounted cash flows in each period,based on the bid price .Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**midMacaulayDuration** | **Double** | The weighted average maturity of bond, where the weights are relative discounted cash flows in each period,based on the mid price .Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**askMacaulayDuration** | **Double** | The weighted average maturity of bond, where the weights are relative discounted cash flows in each period,based on the ask price .Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**bidModifiedDuration** | **Double** | The first derivative of the bond price, with respect to yield,based on the bid price. |  [optional]
**midModifiedDuration** | **Double** | The first derivative of the bond price, with respect to yield,based on the mid price. Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**askModifiedDuration** | **Double** | The first derivative of the bond price, with respect to yield,based on the ask price. Available only  for &#x60;corporate bonds&#x60;. |  [optional]


## Implemented Interfaces

* Serializable


