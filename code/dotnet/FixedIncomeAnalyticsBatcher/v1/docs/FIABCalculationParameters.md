# FactSet.SDK.FixedIncomeAnalyticsBatcher.Model.FIABCalculationParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Fiabdocument** | **string** | FiabDocument (optional) - FIAB document to use as a template. Should  be a path to a FIAB document. Expects a GUI-style path (Client:/foo/bar) | [optional] 
**Account** | [**FIABIdentifier**](FIABIdentifier.md) |  | 
**Dates** | [**FIABDateParameters**](FIABDateParameters.md) |  | 
**Msl** | **string** | Master Security List. Analytics results will be written to the selected MSL. Expects a GUI-style path (Client:/foo/bar) | [optional] 
**Fisettingsdocument** | **string** | FISettingsDocument (optional) - The given @FIS document will be used to  configure analytics assumptions and settings. Expects a GUI-style path (Client:/foo/bar) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

