# ShortInterest

Short Interest response object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | FactSet Security Identifier of Security. Identifies the security level id requested. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. | [optional] 
**request_id** | **str** | Security Identifier that was used in the request. | [optional] 
**short_interest_shares** | **int, none_type** | The total number of shares of a stock that have been sold short and not yet covered. A large increase or decrease in a stock&#39;s short interest from the previous month is often considered a good indicator of investor sentiment. | [optional] 
**days_to_cover** | **float, none_type** | Defines how many days, given the stock&#39;s average trading volume, that it would take short sellers to cover their positions. The higher the ratio, the longer it would take to buy back the borrowed shares. | [optional] 
**short_interest_pct** | **float, none_type** | The number of shares currently outstanding for the stock. | [optional] 
**short_interest_float_pct** | **float, none_type** | Number of shares outstanding (See Shares O/S) less closely held shares, which are those positions held by Insider/Stake Holders | [optional] 
**as_of_date** | **date, none_type** | Date on which the specified data or information is accurate or relevant. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


