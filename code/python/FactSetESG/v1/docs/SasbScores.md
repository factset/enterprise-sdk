# SasbScores


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **date** | Date for the period requested expressed in YYYY-MM-DD format. | [optional] 
**fsym_id** | **str** | FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E). | [optional] 
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**sasb_category** | **str** | The specific SASB &#39;category&#39; the score is referring to. | [optional] 
**sasb_score** | **{str: (bool, date, datetime, dict, float, int, list, str, none_type)}** | The SASB Score value for the given &#39;scoreType&#39; and &#39;category&#39;. When scoreType &#x3D; ESG_RANK, the data type will be string, otherwise data type will be a number with double format. | [optional] 
**score_type** | **str** | The name of the specific SASB Score type being shown in the response. This will be represented by the scoreTypes input: PULSE, INSIGHT, MOMENTUM, ART_VOL_TTM, CAT_VOL_TTM, or DYNAMIC_MAT. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


