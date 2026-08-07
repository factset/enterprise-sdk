

# SpecialtyFinanceFOCUS

A single row of FOCUS report financial data for one broker-dealer and metric.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Request identifier, typically the entity identifier submitted in the request | 
**entityProperName** | **String** | Institution legal name |  [optional]
**factsetEntityId** | **String** | FactSet entity identifier |  [optional]
**metric** | **String** | Metric code |  [optional]
**value** | **BigDecimal** | Metric value |  [optional]
**description** | **String** | Detailed description of the metric |  [optional]
**fiscalEndDate** | **LocalDate** | Fiscal period end date in YYYY-MM-DD format |  [optional]
**currency** | **String** | Currency code (ISO 4217). For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). |  [optional]
**reportType** | **FOCUSReportType** |  | 


## Implemented Interfaces

* Serializable


