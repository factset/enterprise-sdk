# RiskData

Risk data

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The input identifier. | [optional] 
**error** | [**InvalidIdErrorObject**](InvalidIdErrorObject.md) |  | [optional] 
**as_of_date** | **date, none_type** | Date when fund risk data was reported by vendor. | [optional] 
**risk_rating** | **str, none_type** | Rating that fund company assesses to their own funds via the prospectus. | [optional] 
**risk_prospectus** | **str, none_type** | A summary highlighting the key risks and investor suitability for the investment product. | [optional] 
**risk_response_info** | [**[RiskResponseInfo]**](RiskResponseInfo.md) | Array of risk metrics by year. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


