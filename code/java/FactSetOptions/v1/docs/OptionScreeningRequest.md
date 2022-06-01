

# OptionScreeningRequest

Options Screening Request allowing for up to three Conditions using AND Logic. |conditions|description| |---|---| |P_OPT_UNDERLYING_SECURITY_E|Underlying Security Equal To| |P_OPT_STRIKE_PRICE_E|Strike Price Equal To| |P_OPT_EXP_DATEN_E|Expiration Date (YYYYMMDD) Equal To| |P_OPT_VOLUME_G|Volume Greater Than| |P_OPT_VOLUME_GE|Volume Greater Than or Equal To| |P_OPT_VOLUME_L|Volume Less Than| |P_OPT_VOLUME_LE|Volume Less Than or Equal To| |P_OPT_VOLUME_E|Volume Equal To| |P_OPT_OPTION_TYPE_E|Option Type (1= Equity, 2=Index)| |P_OPT_CALL_OR_PUT_E|Call or Put (0=Call, 1=Put)| 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **ExchangeScreeningId** |  | 
**conditionOne** | [**ConditionOneEnum**](#ConditionOneEnum) | The primary condition. | 
**conditionOneValue** | **String** |  | 
**conditionTwo** | [**ConditionTwoEnum**](#ConditionTwoEnum) |  |  [optional]
**conditionTwoValue** | **String** |  |  [optional]
**conditionThree** | [**ConditionThreeEnum**](#ConditionThreeEnum) |  |  [optional]
**conditionThreeValue** | **String** |  |  [optional]
**date** | **String** |  |  [optional]



## Enum: ConditionOneEnum

Name | Value
---- | -----
UNDERLYING_SECURITY_E | &quot;P_OPT_UNDERLYING_SECURITY_E&quot;
STRIKE_PRICE_E | &quot;P_OPT_STRIKE_PRICE_E&quot;
EXP_DATEN_E | &quot;P_OPT_EXP_DATEN_E&quot;
VOLUME_G | &quot;P_OPT_VOLUME_G&quot;
VOLUME_GE | &quot;P_OPT_VOLUME_GE&quot;
VOLUME_L | &quot;P_OPT_VOLUME_L&quot;
VOLUME_LE | &quot;P_OPT_VOLUME_LE&quot;
VOLUME_E | &quot;P_OPT_VOLUME_E&quot;
OPTION_TYPE_E | &quot;P_OPT_OPTION_TYPE_E&quot;
CALL_OR_PUT_E | &quot;P_OPT_CALL_OR_PUT_E&quot;



## Enum: ConditionTwoEnum

Name | Value
---- | -----
UNDERLYING_SECURITY_E | &quot;P_OPT_UNDERLYING_SECURITY_E&quot;
STRIKE_PRICE_E | &quot;P_OPT_STRIKE_PRICE_E&quot;
EXP_DATEN_E | &quot;P_OPT_EXP_DATEN_E&quot;
VOLUME_G | &quot;P_OPT_VOLUME_G&quot;
VOLUME_GE | &quot;P_OPT_VOLUME_GE&quot;
VOLUME_L | &quot;P_OPT_VOLUME_L&quot;
VOLUME_LE | &quot;P_OPT_VOLUME_LE&quot;
VOLUME_E | &quot;P_OPT_VOLUME_E&quot;
OPTION_TYPE_E | &quot;P_OPT_OPTION_TYPE_E&quot;
CALL_OR_PUT_E | &quot;P_OPT_CALL_OR_PUT_E&quot;



## Enum: ConditionThreeEnum

Name | Value
---- | -----
UNDERLYING_SECURITY_E | &quot;P_OPT_UNDERLYING_SECURITY_E&quot;
STRIKE_PRICE_E | &quot;P_OPT_STRIKE_PRICE_E&quot;
EXP_DATEN_E | &quot;P_OPT_EXP_DATEN_E&quot;
VOLUME_G | &quot;P_OPT_VOLUME_G&quot;
VOLUME_GE | &quot;P_OPT_VOLUME_GE&quot;
VOLUME_L | &quot;P_OPT_VOLUME_L&quot;
VOLUME_LE | &quot;P_OPT_VOLUME_LE&quot;
VOLUME_E | &quot;P_OPT_VOLUME_E&quot;
OPTION_TYPE_E | &quot;P_OPT_OPTION_TYPE_E&quot;
CALL_OR_PUT_E | &quot;P_OPT_CALL_OR_PUT_E&quot;


## Implemented Interfaces

* Serializable


