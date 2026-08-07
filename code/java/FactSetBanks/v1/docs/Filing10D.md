

# Filing10D

A single row of Form 10-D securitization distribution report data for one entity and metric.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request (e.g., ticker or entity ID) |  [optional]
**ultimateParentProperName** | **String** | Ultimate parent company name |  [optional]
**factsetUltimateParentEntityId** | **String** | Ultimate parent FactSet entity identifier |  [optional]
**filingDate** | **LocalDate** | Date when the 10-D form was filed |  [optional]
**reportingMonth** | **String** | Month covered by the report |  [optional]
**reportingYear** | **Integer** | Year covered by the report |  [optional]
**currency** | **String** | Currency code for financial values (ISO 4217). Null for percentage or count metrics. For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). |  [optional]
**entityProperName** | **String** | Institution legal name |  [optional]
**factsetEntityId** | **String** | FactSet entity identifier |  [optional]
**metric** | **String** | Metric code |  [optional]
**value** | **BigDecimal** | Metric value |  [optional]
**description** | **String** | Detailed description of the metric |  [optional]


## Implemented Interfaces

* Serializable


