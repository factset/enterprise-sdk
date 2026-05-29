# EntityStrategy


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str, none_type** | Entity identifier used in request | [optional] 
**is_gp** | **bool, none_type** | Whether entity is a GP | [optional] 
**geographic_focus** | [**EntityStrategyGeographicFocus**](EntityStrategyGeographicFocus.md) |  | [optional] 
**sector_focus** | [**EntityStrategySectorFocus**](EntityStrategySectorFocus.md) |  | [optional] 
**investment_instruments** | [**[InstrumentItem], none_type**](InstrumentItem.md) |  | [optional] 
**transaction_strategies** | [**[StrategyCodeItem], none_type**](StrategyCodeItem.md) |  | [optional] 
**control_criteria** | [**[ControlItem], none_type**](ControlItem.md) |  | [optional] 
**investor_roles** | [**[RoleItem], none_type**](RoleItem.md) |  | [optional] 
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


