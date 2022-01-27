# FactSet.SDK.QuotesAPIforDigitalPortals.Model.InlineResponse20084DataAsks

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Unique identifier of the order. Possible values depend on the values delivered by the supplier of the price information. | [optional] 
**Time** | **string** | Date and time of the latest change. | [optional] 
**Type** | **decimal** | Order type. | [optional] 
**Price** | **decimal** | Price value. The value is 0 if the attribute &#x60;type&#x60; is 1 (market order). See attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for the unit of the price value\&quot;. | [optional] 
**QuoteCondition** | **string** | Quote condition. Possible values depend on the values delivered by the supplier of the price information. | [optional] 
**Volume** | **decimal** | Volume of the order. | [optional] 
**MarketMaker** | **string** | Code of the market maker. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

