# factsetownership.FundHoldingsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | List of Fund identifiers. | 
**date** | **String** | Date of holdings expressed in YYYY-MM-DD format. | [optional] 
**topn** | **String** | Limits number of holdings or holders displayed by the top *n* securities. Default is ALL, or use integer to limit number. | [optional] [default to &#39;ALL&#39;]
**assetType** | [**AssetType**](AssetType.md) |  | [optional] 
**currency** | **String** | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**batch** | [**Batch**](Batch.md) |  | [optional] 


