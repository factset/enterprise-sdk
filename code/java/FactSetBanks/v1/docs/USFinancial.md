

# USFinancial

A single row of US regulatory financial data for one entity, period, and metric.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request (e.g., ticker or entity ID) |  [optional]
**entityProperName** | **String** | Institution legal name |  [optional]
**factsetEntityId** | **String** | FactSet entity identifier |  [optional]
**metric** | **String** | Metric code |  [optional]
**value** | **BigDecimal** | Metric value |  [optional]
**description** | **String** | Detailed description of the metric |  [optional]
**coverage** | **USCoverage** |  | 
**currency** | **String** | Currency code (ISO 4217). For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). |  [optional]
**bankTypeDescription** | **String** | Bank type description |  [optional]
**fiscalEndDate** | **LocalDate** | Fiscal period end date in YYYY-MM-DD format |  [optional]


## Implemented Interfaces

* Serializable


