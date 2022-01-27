# factsetesg.SasbScores

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **Date** | Date for the period requested expressed in YYYY-MM-DD format. | [optional] 
**fsymId** | **String** | FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E). | [optional] 
**requestId** | **String** | Identifier that was used for the request. | [optional] 
**sasbCategory** | **String** | The specific SASB &#39;category&#39; the score is referring to. | [optional] 
**sasbScore** | **Object** | The SASB Score value for the given &#39;scoreType&#39; and &#39;category&#39;. When scoreType &#x3D; ESG_RANK, the data type will be string, otherwise data type will be a number with double format. | [optional] 
**scoreType** | **String** | The name of the specific SASB Score type being shown in the response. This will be represented by the scoreTypes input: PULSE, INSIGHT, MOMENTUM, ART_VOL_TTM, CAT_VOL_TTM, or DYNAMIC_MAT. | [optional] 


