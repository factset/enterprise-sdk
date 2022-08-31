# FactSet.SDK.FactSetPrivateMarkets.Model.Field

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_Field** | **string** | Data item to be used as &#x60;fields&#x60; input in &#x60;/factset-private-markets/v#/&#x60; endpoint. | [optional] 
**Name** | **string** | Plain text name of the field. | [optional] 
**Category** | **string** | Corresponding endpoint to input field item. For example, fields returning the category &#39;FINANCIALS&#39; should be used in the /financials endpoint. The same follows data items falling in the category for NON_PERIODIC, which would be used in the /non-periodic endpoint. | [optional] 
**Factor** | **int?** | The factor for the field (e.g. 1000 &#x3D; thousands). | [optional] 
**SdfName** | **string** | The name of the data item as it appears in the Standard Data Feed (SDF). A null value represents items available only in API. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

