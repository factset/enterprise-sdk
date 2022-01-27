

# InlineResponse200DataLifeCycleMaturity

Maturity data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **LocalDate** | Date of the instrument&#39;s maturity. The value is empty if the instrument is perpetual. |  [optional]
**isPerpetual** | **Boolean** | If true, the instrument is perpetual, i.e. it does not mature, therefore the attribute &#x60;date&#x60; is null. |  [optional]
**isCallable** | **Boolean** | If true, the issuer may redeem the instrument prior to maturity. |  [optional]


## Implemented Interfaces

* Serializable


