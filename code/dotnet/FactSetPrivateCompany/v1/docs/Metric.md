# FactSet.SDK.FactSetPrivateCompany.Model.Metric
Metric Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_Metric** | **string** | Data item to be used as &#x60;metrics&#x60; input in &#x60;/factset-private-company/v#/&#x60; endpoint. | [optional] 
**Description** | **string** | Description of the metric. | [optional] 
**Category** | **string** | Corresponding endpoint to input metric item. For example, metrics returning the category &#39;FINANCIALS&#39; should be used in the &#x60;/financials&#x60; endpoint. The same follows data items falling in the category for NON_PERIODIC, which would be used in the &#x60;/non-periodic&#x60; endpoint. | [optional] 
**Factor** | **int?** | The factor for the metric (e.g. 1000 &#x3D; thousands). | [optional] 
**SdfName** | **string** | The name of the data item as it appears in the Standard Data Feed (SDF). A null value represents items available only in API. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

