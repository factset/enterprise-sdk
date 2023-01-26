# spglobalfixedincomeevaluatedpricesandanalytics.BondPrices

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used for the request. | [optional] 
**fsymId** | **String** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**currency** | **String** | Returns the coupon currency .Available only  available for &#x60;corporate and asset-backed security bonds&#x60;. | [optional] 
**date** | **Date** | The date on which the price is calculated. | [optional] 
**cleanBidPrice** | **Number** | The bid price of the instrument. | [optional] 
**cleanMidPrice** | **Number** | The bid price of the instrument. | [optional] 
**cleanAskPrice** | **Number** | The bid price of the instrument. | [optional] 
**dirtyBidPrice** | **Number** | The price of the bond plus the interest that is accrued between coupon payments, based on the bid price. Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**dirtyMidPrice** | **Number** | The price of the bond plus the interest that is accrued between coupon payments, based on the mid price. Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**dirtyAskPrice** | **Number** | The price of the bond plus the interest that is accrued between coupon payments, based on the bid price. Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**pv** | **Number** | The present variation per one basis point change in yield, based on the mid price .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**bidPriceDate** | **Date** | The date the bid price is valued to. Available only  for &#x60;municipal bonds&#x60;. | [optional] 
**midPriceDate** | **Date** | The date the mid price is valued to. Available only  for &#x60;municipal bonds&#x60;. | [optional] 
**askPriceDate** | **Date** | The date the ask price is valued to. Available only  for &#x60;municipal bonds&#x60;. | [optional] 
**bidPriceType** | **String** | Bid price type for the given identifier. Available only  for &#x60;municipal bonds&#x60;. | [optional] 
**midPriceType** | **String** | Mid price type for the given identifier .Available only  for &#x60;municipal bonds&#x60;. | [optional] 
**askPriceType** | **String** | Ask price type for the given identifier .Available only  for &#x60;municipal bonds&#x60;. | [optional] 


