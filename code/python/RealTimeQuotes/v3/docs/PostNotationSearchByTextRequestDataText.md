# PostNotationSearchByTextRequestDataText

Text-related parameters.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | Full-text search string. It may be enclosed in double quotes (\&quot;). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \&quot; daimler\&quot;. If only two characters are submitted, the search is executed as an exact search. | 
**attributes** | **[str]** | List of attributes to be searched in. The value &#x60;allEntitled&#x60; cannot appear with any other value. | [optional]  if omitted the server will use the default value of ["allEntitled"]
**minimum_match_score** | **float** | Minimum match score for the text string. The match score has a value between 0 and 1 (inclusive), where a higher value indicates a better match than a lower one.      Examples for the two most relevant thresholds:       0.25: Exact substring match after case-folding and modifier elimination - \&quot;Münchner Rück\&quot; is a match for the search string \&quot;Munch\&quot; but not for \&quot;Muench\&quot;.        0.50: Exact substring match - \&quot;Münchner Rück\&quot; is a match for the search string \&quot;Münch\&quot; but not for \&quot;Munch\&quot; or \&quot;münch\&quot;. | [optional]  if omitted the server will use the default value of 0.25
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


