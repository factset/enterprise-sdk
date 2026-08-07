# RateAllOf


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The identifier as submitted in the request (e.g., ticker or entity ID) | [optional] 
**as_of_date** | **date** | Date the rate became effective | [optional] 
**currency** | [**CurrencyCode**](CurrencyCode.md) |  | [optional] 
**deposit_product** | **str** | Deposit product type, e.g., \&quot;Savings\&quot;, \&quot;Certificate of Deposit\&quot;, \&quot;Fixed Rate IRA\&quot; | [optional] 
**term** | **str** | Product term, e.g., \&quot;0 Month\&quot;, \&quot;1 Year\&quot;, \&quot;18 Months\&quot;, \&quot;All\&quot; | [optional] 
**deposit_category** | **str, none_type** | Balance tier category, e.g., \&quot;Up to 2500\&quot;, \&quot;10000 to 100000\&quot;, \&quot;Over 250000\&quot;. Only present for product rates by balance tier. | [optional] 
**apy_rate** | **float, none_type** | Annual Percentage Yield rate. Only present for product rates by balance tier. | [optional] 
**prev_apy_rate** | **float, none_type** | Previous Annual Percentage Yield rate. Only present for product rates by balance tier and average product rates. | [optional] 
**national_apy_avg_rate** | **float, none_type** | National average Annual Percentage Yield rate. Available for product rates by balance tier and average product rates. | [optional] 
**apy_avg_rate** | **float, none_type** | Average Annual Percentage Yield rate. Only present for average product rates and location-specific rates. | [optional] 
**prev_apy_avg_rate** | **float, none_type** | Previous average Annual Percentage Yield rate. Only present for average product rates. | [optional] 
**state** | **str, none_type** | Two-letter US state or territory code (ISO 3166-2:US). Only present for location-specific rates. | [optional] 
**min_deposit** | **float, none_type** | Minimum deposit amount. Only present for location-specific rates. | [optional] 
**max_deposit** | **float, none_type** | Maximum deposit amount. 0 indicates no maximum. Only present for location-specific rates. | [optional] 
**online_desc** | **str, none_type** | Online availability indicator. Only present for location-specific rates. | [optional] 
**is_special_offer** | **bool, none_type** | Indicates whether the rate is a special promotional offer. Only present for location-specific rates. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


