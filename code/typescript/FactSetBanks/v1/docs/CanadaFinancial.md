# factsetbanks.CanadaFinancial

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request (e.g., ticker or entity ID) | [optional] 
**entityProperName** | **String** | Institution legal name | [optional] 
**factsetEntityId** | **String** | FactSet entity identifier | [optional] 
**metric** | **String** | Metric code | [optional] 
**value** | **Number** | Metric value | [optional] 
**description** | **String** | Detailed description of the metric | [optional] 
**coverage** | [**CanadaCoverage**](CanadaCoverage.md) |  | 
**currency** | **String** | Currency code (ISO 4217). For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). | [optional] 
**reportEndDate** | **Date** | Date corresponding to the end of the report period in YYYY-MM-DD format | [optional] 
**reportPeriod** | **String** | Period used in the report. Format: &#x60;M#&#x60; where &#x60;#&#x60; is the month number (e.g., &#x60;M1&#x60; for January, &#x60;M12&#x60; for December). | [optional] 


