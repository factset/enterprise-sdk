# SurpriseHistory


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_date** | **date, none_type** | Fiscal period end date for which the consensus estimate is being forecasted. | [optional] 
**currency** | **str, none_type** | Currency used for calculations, majority currency in which the analysts are contributing their estimates. For a list of supported ISO currency codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**high** | **float, none_type** | The highest estimate provided by the analysts for the specified period. | [optional] 
**low** | **float, none_type** | The lowest estimate provided by the analysts for the specified period. | [optional] 
**up** | **int, none_type** | Number of estimates revised upwards. | [optional] 
**down** | **int, none_type** | Number of estimates revised downwards. | [optional] 
**analyst_count** | **int, none_type** | The number of analysts who provided estimates for the given period. | [optional] 
**mean** | **float, none_type** | The average of all estimates provided by the analysts for the specified period. | [optional] 
**median** | **float, none_type** | The median of all estimates provided by the analysts for the specified period. | [optional] 
**standard_deviation** | **float, none_type** | Measure of the dispersion of estimates around the consensus value. | [optional] 
**actual** | **float, none_type** |  | [optional] 
**surprise_percent** | **float, none_type** | Percent difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145). | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


