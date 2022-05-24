# factsetprivatemarkets.Field

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **String** | Data item to be used as &#x60;fields&#x60; input in &#x60;/factset-private-markets/v#/&#x60; endpoint. | [optional] 
**name** | **String** | Plain text name of the field. | [optional] 
**category** | **String** | Corresponding endpoint to input field item. For example, fields returning the category &#39;FINANCIALS&#39; should be used in the /financials endpoint. The same follows data items falling in the category for NON_PERIODIC, which would be used in the /non-periodic endpoint. | [optional] 
**factor** | **Number** | The factor for the field (e.g. 1000 &#x3D; thousands). | [optional] 
**sdfName** | **String** | The name of the data item as it appears in the Standard Data Feed (SDF). A null value represents items available only in API. | [optional] 


