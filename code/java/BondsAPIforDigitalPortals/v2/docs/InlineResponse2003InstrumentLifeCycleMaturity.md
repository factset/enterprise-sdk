

# InlineResponse2003InstrumentLifeCycleMaturity

Maturity data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **LocalDate** | Date of the debt instrument&#39;s maturity. The value is empty if the instrument is perpetual. |  [optional]
**remainingTermYears** | **BigDecimal** | Remaining term to maturity expressed in years. |  [optional]
**perpetual** | **Boolean** | If &#x60;true&#x60;, the debt instrument is perpetual, i.e. it does not mature, therefore the attribute &#x60;date&#x60; is &#x60;null&#x60;. |  [optional]


## Implemented Interfaces

* Serializable


