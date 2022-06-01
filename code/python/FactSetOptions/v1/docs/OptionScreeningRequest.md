# OptionScreeningRequest

Options Screening Request allowing for up to three Conditions using AND Logic. |conditions|description| |---|---| |P_OPT_UNDERLYING_SECURITY_E|Underlying Security Equal To| |P_OPT_STRIKE_PRICE_E|Strike Price Equal To| |P_OPT_EXP_DATEN_E|Expiration Date (YYYYMMDD) Equal To| |P_OPT_VOLUME_G|Volume Greater Than| |P_OPT_VOLUME_GE|Volume Greater Than or Equal To| |P_OPT_VOLUME_L|Volume Less Than| |P_OPT_VOLUME_LE|Volume Less Than or Equal To| |P_OPT_VOLUME_E|Volume Equal To| |P_OPT_OPTION_TYPE_E|Option Type (1= Equity, 2=Index)| |P_OPT_CALL_OR_PUT_E|Call or Put (0=Call, 1=Put)| 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**ExchangeScreeningId**](ExchangeScreeningId.md) |  | 
**condition_one** | **str** | The primary condition. | 
**condition_one_value** | **str** |  | 
**condition_two** | **str** |  | [optional] 
**condition_two_value** | **str** |  | [optional] 
**condition_three** | **str** |  | [optional] 
**condition_three_value** | **str** |  | [optional] 
**date** | **str** |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


