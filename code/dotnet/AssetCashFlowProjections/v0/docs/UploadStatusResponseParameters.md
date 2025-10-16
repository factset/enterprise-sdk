# FactSet.SDK.AssetCashFlowProjections.Model.UploadStatusResponseParameters
Uploaded status response parameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AcfpStatus** | **string** | The ACFP status of the uploaded file, can be one of the following: - &#x60;pending&#x60;: File validation is pending. - &#x60;validating&#x60;:File is being validated. - &#x60;error&#x60;: File failed validation.  - &#x60;replicating&#x60;: File is being copied. - &#x60;good&#x60;: File is successfully validated. - &#x60;preparing&#x60;: File is being parsed.  - &#x60;uninitiated&#x60;: File upload is not initiated. | [optional] 
**AsOfDate** | **DateTime** | Scenario As of Date | [optional] 
**FileName** | **string** | Actuarial Scenario file name | [optional] 
**NumberOfScenarios** | **decimal** | Number of scenarios that are within a scenario file | [optional] 
**Status** | **string** | The status of the uploaded file, can be one of the following: | [optional] 
**Type** | **string** | Actuarial Scenario File Type | [optional] 
**UploadDateTime** | **DateTime** | The time stamp when the file is uploaded | [optional] 
**UploadId** | **string** | Unique Identifier for the file | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

