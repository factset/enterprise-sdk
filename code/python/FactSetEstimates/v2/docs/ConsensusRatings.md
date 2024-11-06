# ConsensusRatings


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** |  | [optional] 
**estimate_date** | **date, none_type** | Date of estimate expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**buy_count** | **int, none_type** | The number of Buy ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus. | [optional] 
**overweight_count** | **int, none_type** | The number of overweight ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus. | [optional] 
**hold_count** | **int, none_type** | The number of Hold ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus. | [optional] 
**underweight_count** | **int, none_type** | The number of underweight ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus. | [optional] 
**sell_count** | **int, none_type** | The number of Sell ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus. | [optional] 
**ratings_nest_total** | **int, none_type** | The total number of ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus. | [optional] 
**ratings_note** | **float, none_type** | The mean average of ratings for the fiscal dates indicated, where each underlying rating is given a numerical score and then aggregated to a mean consensus - __*Individual Ratings Scores*__ |Value|Rating Description| |---|---| |1|Buy| |1.5|overWeight| |2|Hold| |2.5|underWeight| |3|Sell|  | [optional] 
**ratings_note_text** | **str, none_type** | The mean textual rating for the fiscal dates indicated. The text rating is assigned by falling within the below defined ranges -  __*Textual Ranges for Average*__ |Value|Rating Description| |---|---| |&lt; 1.25|Buy| |&lt; 1.75|overWeight| |&lt; 2.25|Hold| |&lt; 2.75|underWeight| |&lt;&#x3D; 3|Sell|  | [optional] 
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


