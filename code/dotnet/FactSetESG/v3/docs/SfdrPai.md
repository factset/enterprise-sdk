# FactSet.SDK.FactSetESG.Model.SfdrPai
SFDR PAI Indicators Response Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E). | [optional] 
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**SubTopicCode** | **string** | Codes for the General, Mandatory and Additional PAI indicators | [optional] 
**SubTopicName** | **string** | Names for the General, Mandatory and Additional PAI indicators | [optional] 
**IndicatorType** | **string** | The type of indicator - General, Additional &amp; Mandatory | [optional] 
**PeriodEndDate** | **DateTime?** | The Reporting period end date expressed in YYYY-MM-DD format | [optional] 
**ReportingPeriod** | **string** | The reporting period of the company expressed in YYYY format | [optional] 
**StandardizedUnit** | **string** | The units of measurements for the indicators | [optional] 
**StandardizedValue** | **string** | The PAI calculations based on the company-reported data, some metrics sourced from Factset Databases and Truvalue SASB Spotlights | [optional] 
**Currency** | **string** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**Error** | [**InvalidIdErrorObject**](InvalidIdErrorObject.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

