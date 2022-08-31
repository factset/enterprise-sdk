# FactSet.SDK.OpenRisk.Model.GenerateIDMappingRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AllowForcedRisklessAssets** | **bool** | Allow certain assets to be entirely riskless; certain models always override this to be true. Examples of asset types to which this applies includes offset cash. | [optional] [default to false]
**AssetTypes** | **Dictionary&lt;string, string&gt;** | **(since 1.4.0)** A mapping of security ID to its asset type as the standard asset type keys. When this input is in a request, it is used to (1) identify assets that use Underlying IDs from &#39;underlyingIds&#39; input, and (2) identify asset types compatible with automatic removal of their contribution of currency to risk unless any form of the &#39;removeCurrencyRisk&#39; input is also provided. When this input is used in the request, underlying IDs (provided via &#39;underlyingIds&#39; input) are only respected for the following standard asset type keys (all other underlying IDs will be discarded): refer to [OA:22019](https://my.apps.factset.com/oa/pages/22019) for compatible asset type keys and more details. | [optional] 
**Calendar** | **string** | Calendar code for risk model and holdings data to fetch and use. Ignored only for composite asset definitions provided as inputs via &#39;compositeAssets&#39; field. See also [OA:2012](https://my.apps.factset.com/oa/pages/2012#calendar) for global codes, \&quot;FIVEDAY\&quot; or \&quot;SEVENDAY\&quot; calendars and see [OA:16610](https://my.apps.factset.com/oa/pages/16610#country) for country codes (cf. &#39;Calendar Code&#39; column). | [optional] 
**CompositeAssets** | [**Dictionary&lt;string, IDsAndMarketValues&gt;**](IDsAndMarketValues.md) | IDs to be defined as composite assets with their constituents&#39; IDs and market values. The typical use case is for risk look-through of ETF or Funds&#39; constituents. When defining composite assets and creating portfolios which hold them, the IDs provided must be an exact match. | [optional] 
**Currency** | **string** | ISO-4217 currency code for risk model and holdings data to fetch and use. Ignored only for composite asset definitions provided as inputs via &#39;compositeAssets&#39; field. | [optional] 
**Date** | [**Date**](Date.md) |  | 
**Holdings** | [**Holdings**](Holdings.md) |  | 
**IndexMapping** | **SecurityIndexMapping** |  | [optional] 
**LaggingDates** | [**LaggingDates**](LaggingDates.md) |  | [optional] 
**RiskModel** | **string** | Model code | 
**RiskModelAppendData** | [**RiskModelAppendData**](RiskModelAppendData.md) |  | [optional] 
**UnderlyingIds** | **Dictionary&lt;string, string&gt;** | A map of security IDs to their underlying IDs. When &#39;assetTypes&#39; input is in a request, underlying IDs provided via this input are only respected for the following standard asset type keys (all other underlying IDs will be discarded): refer to [OA:22019](https://my.apps.factset.com/oa/pages/22019) for compatible asset type keys and more details. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

