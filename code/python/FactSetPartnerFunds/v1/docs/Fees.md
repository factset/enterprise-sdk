# Fees

Fees data

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**InvalidIdErrorObject**](InvalidIdErrorObject.md) |  | [optional] 
**request_id** | **str** | The input identifier. | [optional] 
**is_pre_authorized_investment_plan** | **bool** | Indicator for the pre authorized contribution plan eligibility. | [optional] 
**is_systematic_withdrawl_plan** | **bool** | Indicator for the Systematic withdrawn plan eligibility. | [optional] 
**backend_fees** | **str** | Lists the values showing how the backend fees apply during the redemption. | [optional] 
**rrsp_annual_admin_fee** | **float, none_type** | An annual fee charged to unit holder’s account for the administration of RRSP accounts. | [optional] 
**rrif_annual_admin_fee** | **float, none_type** | An annual fee charged to unit holder’s account for the administration of RRIF accounts. | [optional] 
**switch_fees** | **str** | Lists the fees for switching investment among different funds, within the same fund family. | [optional] 
**rrsp_withdrawal_fee** | **float, none_type** | A fee charged to unit holders who has used automatic withdrawal plan to contribute to their RRSP account | [optional] 
**rrif_withdrawal_fee** | **float, none_type** | A fee charged to unit holders who has used automatic withdrawal plan to contribute to their RRIF account. | [optional] 
**trailer_fees** | **str** | Lists the maximum trailer fees charged to each load. | [optional] 
**swp_min_balance** | **float, none_type** | Minimum balance and withdrawal amounts for SWP&#39;s. | [optional] 
**load** | **str, none_type** | Load type of the fund. | [optional] 
**is_no_load** | **bool** | Indicator for the &#x60;No Load&#x60; fund type. | [optional] 
**max_front_end_percent** | **float, none_type** | The Fund purchaser has the option to choose what the maximums are for front end load type. | [optional] 
**max_back_end_percent** | **float, none_type** | The Fund purchaser has the option to choose what the maximums are for back end load. | [optional] 
**other_fees** | **str** | Lists any other fees associated with Fund. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


