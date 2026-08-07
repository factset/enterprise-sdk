

# Exposure

A single row of country exposure data for one entity, country, and metric.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request (e.g., ticker or entity ID) |  [optional]
**fiscalEndDate** | **LocalDate** | Fiscal period end date in YYYY-MM-DD format |  [optional]
**country** | **String** | ISO 3166-1 alpha-2 country code |  [optional]
**currency** | **String** | Currency code for financial values (ISO 4217). Null for percentage or count metrics. For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). |  [optional]
**entityProperName** | **String** | Institution legal name |  [optional]
**factsetEntityId** | **String** | FactSet entity identifier |  [optional]
**metric** | **String** | Metric code |  [optional]
**value** | **BigDecimal** | Metric value |  [optional]
**description** | **String** | Detailed description of the metric |  [optional]


## Implemented Interfaces

* Serializable


