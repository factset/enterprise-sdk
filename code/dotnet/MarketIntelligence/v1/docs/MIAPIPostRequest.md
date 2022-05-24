# FactSet.SDK.MarketIntelligence.Model.MIAPIPostRequest
Post request allows users to pass the necessary parameters such as the report name, identifier, id type, time zone, and report content.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportName** | **string** | report name | [optional] 
**Identifier** | **string** | Index or portfolio for which the report to be created. | [optional] 
**IdType** | **string** | identifier type | [optional] 
**TimeZone** | **string** | Time zone for the report (this shall be utilized if a user wants to use the report via API and also from Workstation/web). | [optional] 
**Content** | [**List&lt;PostRequestExample&gt;**](PostRequestExample.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

