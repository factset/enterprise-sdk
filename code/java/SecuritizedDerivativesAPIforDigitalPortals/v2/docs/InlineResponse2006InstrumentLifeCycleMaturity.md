

# InlineResponse2006InstrumentLifeCycleMaturity

Maturity data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **LocalDate** | Date of the securitized derivative&#39;s maturity. The value is empty if the instrument is perpetual. |  [optional]
**remainingTermDays** | **BigDecimal** | Remaining term to maturity expressed in days. The value is empty if the instrument is perpetual. |  [optional]
**perpetual** | **Boolean** | If &#x60;true&#x60;, the securitized derivative is perpetual, i.e. it does not mature, therefore the attributes &#x60;date&#x60; and &#x60;remainingTermDays&#x60; are &#x60;null&#x60;. |  [optional]


## Implemented Interfaces

* Serializable


