# FactSet.SDK.FactSetEstimates.Model.AnalystRating

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**AsOfMonth** | **string** | Ending date for the period requested expressed in YYYY-MM format. | [optional] 
**Currency** | **string** | The 3 digit ISO code for the currency. ​For a list of currency ISO codes, visit [Online Assistant Page#1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**RatingsCount** | [**RatingsCount**](RatingsCount.md) |  | [optional] 
**MeanRecommendation** | **string** | Specifies the average recommendation for a given security identifier for the period requested by the client. It represents the consensus of various analyst ratings. The corresponding date of validity for this data is detailed in the &#x60;asOfMonth&#x60; field. | [optional] 
**MeanRecommendationScale** | **double** | Mean recommendation scale for the period requested, calculated as an average of all recommendations converted into numeric values (e.g., Buy&#x3D;1, Sell&#x3D;3, Hold&#x3D;2, overWeight&#x3D;1.5, underWeight&#x3D;2.5) from various analysts for the period. | [optional] 
**TargetPrice** | [**TargetPrice**](TargetPrice.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

