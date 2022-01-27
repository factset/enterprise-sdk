

# InlineResponse2002DataSensitivities

Price sensitivities of the debt instrument with respect to the prevailing market interest rate.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basePointValue** | **BigDecimal** | Base point value, which is the change of the debt instrument&#39;s price for a one base point change (nominally, not relatively) of the prevailing market interest rate. One base point is equivalent to 0,01 percent (1/100 of a percent). See attribute &#x60;price/valueUnit&#x60; for its value unit. |  [optional]
**modifiedDuration** | **BigDecimal** | Modified duration, which is the percentage change of the debt instrument&#39;s price for a one percent change (nominally, not relatively) of the prevailing market interest rate. |  [optional]
**elasticity** | **BigDecimal** | Yield elasticity, which is the ratio of the percentage change of the debt instrument&#39;s price for a one percent change (relatively, not nominally) of the prevailing market interest rate. |  [optional]
**convexity** | **BigDecimal** | Convexity, which is a measure for the change of the modified duration as the prevailing market interest rate changes. |  [optional]


## Implemented Interfaces

* Serializable


