# spglobalfixedincomeevaluatedpricesandanalytics.BondYield

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used for the request. | [optional] 
**fsymId** | **String** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**date** | **Date** | The date on which the price is calculated. | [optional] 
**bidYieldToMaturity** | **Number** | The yield to maturity of the bid price of the instrument. Available only for &#x60;corporate bonds&#x60; and &#x60;asset-backed security bonds&#x60;. | [optional] 
**midYieldToMaturity** | **Number** | The yield to maturity of the mid price of the instrument. Available only for &#x60;corporate bonds&#x60; and &#x60;asset-backed security bonds&#x60;. | [optional] 
**askYieldToMaturity** | **Number** | The yield to maturity of the ask price of the instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**bidYieldToWorst** | **Number** | The lowest yield, under all possible scenarios, of the bid price of the instrument. Available only for &#x60;corporate bonds&#x60; and &#x60;municipal bonds&#x60;. | [optional] 
**midYieldToWorst** | **Number** | The lowest yield, under all possible scenarios, of the mid price of the instrument. Available only for &#x60;corporate bonds&#x60; and &#x60;municipal bonds&#x60;. | [optional] 
**askYieldToWorst** | **Number** | The lowest yield, under all possible scenarios, of the ask price of the instrument. Available only for &#x60;corporate bonds&#x60; and &#x60;municipal bonds&#x60;. | [optional] 
**benchmarkBidYieldToMaturity** | **Number** | The bid yield to maturity of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**benchmarkMidYieldToMaturity** | **Number** | The mid yield to maturity of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**benchmarkAskYieldToMaturity** | **Number** | The ask yield to maturity of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**bidYieldToCall** | **Number** | The yield to call of the bid price of the instrument. Available only for &#x60;asset-backed security bonds&#x60;. | [optional] 
**midYieldToCall** | **Number** | The yield to call of the mid price of the instrument. Available only for &#x60;asset-backed security bonds&#x60;. | [optional] 
**yieldTWDate** | **Date** | The date used in the yield to worst calculation. Available only for &#39;corporate bonds&#39;. | [optional] 


