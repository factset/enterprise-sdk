# FactSet.SDK.FactSetOptions.Model.SnapshotRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | Option Security Identifier. For more details visit [OA 12636 - Options Identifiers](https://my.apps.factset.com/oa/pages/12636#options)  | 
**Date** | **string** | The as of date for the option chain in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. | [optional] 
**Currency** | **string** | The ISO3 currency control for the requested option identifier. For a list of Currency ISOs, visit - [OA 1470](https://my.apps.factset.com/oa/pages/1470)  | [optional] 
**Calendar** | [**Calendar**](Calendar.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

