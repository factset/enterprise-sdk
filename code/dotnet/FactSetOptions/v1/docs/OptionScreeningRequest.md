# FactSet.SDK.FactSetOptions.Model.OptionScreeningRequest
Options Screening Request allowing for up to three Conditions using AND Logic. |conditions|description| |- --|- --| |P_OPT_UNDERLYING_SECURITY_E|Underlying Security Equal To| |P_OPT_STRIKE_PRICE_E|Strike Price Equal To| |P_OPT_EXP_DATEN_E|Expiration Date (YYYYMMDD) Equal To| |P_OPT_VOLUME_G|Volume Greater Than| |P_OPT_VOLUME_GE|Volume Greater Than or Equal To| |P_OPT_VOLUME_L|Volume Less Than| |P_OPT_VOLUME_LE|Volume Less Than or Equal To| |P_OPT_VOLUME_E|Volume Equal To| |P_OPT_OPTION_TYPE_E|Option Type (1= Equity, 2=Index)| |P_OPT_CALL_OR_PUT_E|Call or Put (0=Call, 1=Put)| 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | [**ExchangeScreeningId**](ExchangeScreeningId.md) |  | 
**ConditionOne** | **string** | The primary condition. | 
**ConditionOneValue** | **string** |  | 
**ConditionTwo** | **string** |  | [optional] 
**ConditionTwoValue** | **string** |  | [optional] 
**ConditionThree** | **string** |  | [optional] 
**ConditionThreeValue** | **string** |  | [optional] 
**Date** | **string** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

