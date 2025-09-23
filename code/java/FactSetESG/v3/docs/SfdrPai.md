

# SfdrPai

SFDR PAI Indicators Response Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E). |  [optional]
**requestId** | **String** | Identifier that was used for the request. |  [optional]
**subTopicCode** | **String** | Codes for the General, Mandatory and Additional PAI indicators |  [optional]
**subTopicName** | **String** | Names for the General, Mandatory and Additional PAI indicators |  [optional]
**indicatorType** | **String** | The type of indicator - General, Additional &amp; Mandatory |  [optional]
**periodEndDate** | **LocalDate** | The Reporting period end date expressed in YYYY-MM-DD format |  [optional]
**reportingPeriod** | **String** | The reporting period of the company expressed in YYYY format |  [optional]
**standardizedUnit** | **String** | The units of measurements for the indicators |  [optional]
**standardizedValue** | **String** | The PAI calculations based on the company-reported data, some metrics sourced from Factset Databases and Truvalue SASB Spotlights |  [optional]
**currency** | **String** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). |  [optional]
**error** | [**InvalidIdErrorObject**](InvalidIdErrorObject.md) |  |  [optional]


## Implemented Interfaces

* Serializable


