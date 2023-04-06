# FactSet.SDK.FactSetESG.Model.SasbScores

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Date** | **DateTime?** | Date for the period requested expressed in YYYY-MM-DD format. | [optional] 
**FsymId** | **string** | FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E). | [optional] 
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**SasbCategory** | **string** | The specific SASB &#39;category&#39; the score is referring to. | [optional] 
**SasbScore** | **Object** | The SASB Score value for the given &#39;scoreType&#39; and &#39;category&#39;. When scoreType &#x3D; ESG_RANK, the data type will be string, otherwise data type will be a number with double format. | [optional] 
**ScoreType** | **string** | The name of the specific SASB Score type being shown in the response. This will be represented by the scoreTypes input: PULSE, INSIGHT, MOMENTUM, ART_VOL_TTM, CAT_VOL_TTM, or DYNAMIC_MAT. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

