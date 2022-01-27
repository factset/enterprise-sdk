# Summaries


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. | [optional] 
**fsym_entity_id** | **str** | FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E), resolved from the requestId of the Fund requested. | [optional] 
**fsym_regional_id** | **str** | FactSet Regional Identifier. Six alpha-numeric characters, excluding vowels, with a -R suffix (XXXXXX-R), resolved from the requestId of the Fund requested. | [optional] 
**fsym_ticker_region** | **str** | FactSet Ticker-Region for the requested fund. | [optional] 
**fsym_ultimate_parent_id** | **str** | The FactSet Ultimate Parent Entity Identifer, with a -E suffix (XXXXXX-E). | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**active_flag** | **int** | Binary flag to indicate whether the fund is currently active, where 1 is active and 0 is inactive. | [optional] 
**actively_managed_flag** | **int** | Binary indicator of whether the fund is actively managed, where 1 is active and 0 is inactive. | [optional] 
**brand** | **str** | The Funds Brand Name in proper format. | [optional] 
**country_domicile** | **str** | Returns the fund&#39;s country of domicile in ISO2 format. Only available for Mutual Funds. | [optional] 
**currency** | **str** | The fund&#39;s currency. | [optional] 
**desc_info** | **str** | The Fund&#39;s Investment Strategy short description. | [optional] 
**fund_of_funds_id** | **str** | The fund of fund&#39;s id if applicable. Will provide plain Fund of Funds text. | [optional] 
**inception_date** | **str** | The fund&#39;s inception date in YYYY-MM-DD format. | [optional] 
**insight** | **str** | The fund&#39;s investment strategy long description. Use &#x60;descInfo&#x60; if needing short description. | [optional] 
**issuer_id** | **str** | The Issuer Identifier. | [optional] 
**issuer_name** | **str** | The Issuer Name in proper format. | [optional] 
**legal_structure** | **str** | The legal structure of the fund, e.g. Open-Ended Fund, close-ended fund | [optional] 
**leverage_factor** | **float** | The leverage factor of the fund. | [optional] 
**leverage_inverse** | **str** | Indicates whether the fund is leveraged, inverse, or neither in proper format. | [optional] 
**name** | **str** | The Fund security&#39;s name in proper format. | [optional] 
**nav_currency** | **str** | The NAV currency for the specified share class. | [optional] 
**objective** | **str** | The Fund&#39;s objective long description. | [optional] 
**price_first_date** | **str** | The fund&#39;s first available date for prices (NAV) in YYYY-MM-DD format. This can be used to fetch the first available price from FactSet. *NOTE: This is not the inception date of fund.* | [optional] 
**price_recent_date** | **str** | The fund&#39;s most recent available date for prices (NAV) in YYYY-MM-DD format. | [optional] 
**shr_class** | **str** | The Funds Share class type name in proper format. | [optional] 
**shr_class_active_flag** | **int** | Returns a binary indicator of whether the specified share class is currently active, where 1 is active and 0 is inactive. | [optional] 
**shr_cls_currency** | **str** | The currency for the specified share class. | [optional] 
**shr_cls_incept_date** | **str** | The specified share class&#39;s inception date in YYYY-MM-DD format. | [optional] 
**shr_cls_name** | **str** | The specified share class name for the fund in proper format. | [optional] 
**shr_cls_term_date** | **str** | The Share class Termination Date in YYYY-MM-DD format. If still active, value will be null. | [optional] 
**termination_date** | **str** | The Termination Date in YYYY-MM-DD format. If still active, value will be null. | [optional] 
**type** | **str** | The Type of Fund, e.g. Mutual Fund, Unit Investment Trust | [optional] 
**web_site** | **str** | The URL of the Fund. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


