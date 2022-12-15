# InlineResponse2004DataRecommendation

Details of the recommendations.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**latest_update** | **date, none_type** | Date of the latest update. | [optional] 
**counts** | [**InlineResponse2003DataRecommendationCounts**](InlineResponse2003DataRecommendationCounts.md) |  | [optional] 
**consensus** | **float, none_type** | Recommendation consensus, that is the average value of all provided recommendations. Values are in the range from 1.0 to 5.0, whereby 1 represents the strongest buy recommendation, 3 a hold (neutral) recommendation and 5 the strongest sell recommendation.  | [optional] 
**change** | **float, none_type** | Recommendation change as the difference of the latest (&#x60;snapshot&#x3D;latest&#x60;) minus the historic value of the recommendation consensus (attribute &#x60;consensus&#x60;). Values are in the range from -4 to 4, whereby -4 represents a recommendation change from 5 to 1 and 4 represents a recommendation change from 1 to 5. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


