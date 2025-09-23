# Summaries


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. | [optional] 
**fsym_entity_id** | **str, none_type** | FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E), resolved from the requestId of the Fund requested. | [optional] 
**fsym_regional_id** | **str, none_type** | FactSet Regional Identifier. Six alpha-numeric characters, excluding vowels, with a -R suffix (XXXXXX-R), resolved from the requestId of the Fund requested. | [optional] 
**fsym_ticker_region** | **str, none_type** | FactSet Ticker-Region for the requested fund. | [optional] 
**fsym_ultimate_parent_id** | **str, none_type** | The FactSet Ultimate Parent Entity Identifer, with a -E suffix (XXXXXX-E). | [optional] 
**isin** | **str, none_type** | Unique 12-character identifier for the requested fund, as per the International Securities Identification Number (ISIN) standard. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**active_flag** | **int, none_type** | Binary flag to indicate whether the fund is currently active, where 1 is active and 0 is inactive. | [optional] 
**actively_managed_flag** | **int, none_type** | Binary indicator of whether the fund is actively managed, where 1 is active and 0 is inactive. | [optional] 
**brand** | **str, none_type** | The Funds Brand Name in proper format. | [optional] 
**country_domicile** | **str, none_type** | Returns the fund&#39;s country of domicile in ISO2 format. Only available for Mutual Funds. | [optional] 
**country_of_registration** | **str, none_type** | Countries where the mutual fund is registered and is available for sale, represented as ISO 3166 2-letter country codes. | [optional] 
**currency** | **str, none_type** | The fund&#39;s currency. | [optional] 
**desc_info** | **str, none_type** | The Fund&#39;s Investment Strategy short description. | [optional] 
**fund_of_funds_id** | **str, none_type** | The fund of fund&#39;s id if applicable. Will provide plain Fund of Funds text. | [optional] 
**inception_date** | **date, none_type** | The fund&#39;s inception date in YYYY-MM-DD format. | [optional] 
**insight** | **str, none_type** | The fund&#39;s investment strategy long description. Use &#x60;descInfo&#x60; if needing short description. | [optional] 
**issuer_id** | **str, none_type** | The Issuer Identifier. | [optional] 
**issuer_name** | **str, none_type** | The Issuer Name in proper format. | [optional] 
**issuer_legacy_name** | **str, none_type** | The Issuer Legacy Name in proper format. | [optional] 
**legal_structure** | **str, none_type** | The legal structure of the fund, e.g. Open-Ended Fund, close-ended fund | [optional] 
**leverage_factor** | **float, none_type** | The leverage factor of the fund. | [optional] 
**leverage_inverse** | **str, none_type** | Indicates whether the fund is leveraged, inverse, or neither in proper format. | [optional] 
**name** | **str, none_type** | The Fund security&#39;s name in proper format. | [optional] 
**nav_currency** | **str, none_type** | The NAV currency for the specified share class. | [optional] 
**objective** | **str, none_type** | The Fund&#39;s objective long description. | [optional] 
**price_first_date** | **date, none_type** | The fund&#39;s first available date for prices (NAV) in YYYY-MM-DD format. This can be used to fetch the first available price from FactSet. *NOTE: This is not the inception date of fund.* | [optional] 
**price_recent_date** | **date, none_type** | The fund&#39;s most recent available date for prices (NAV) in YYYY-MM-DD format. | [optional] 
**primary_advisor** | **str, none_type** | The name of the fund&#39;s primary advisor. | [optional] 
**sub_advisor** | **str, none_type** | The name of the fund&#39;s sub-advisor. | [optional] 
**shr_class** | **str, none_type** | The Funds Share class type name in proper format. | [optional] 
**shr_class_active_flag** | **int, none_type** | Returns a binary indicator of whether the specified share class is currently active, where 1 is active and 0 is inactive. | [optional] 
**shr_cls_actively_managed_flag** | **int, none_type** | Returns a binary indicator of whether the specified share class is actively managed, where 1 is active and 0 is inactive. | [optional] 
**shr_cls_currency** | **str, none_type** | The currency for the specified share class. | [optional] 
**shr_cls_incept_date** | **date, none_type** | The specified share class&#39;s inception date in YYYY-MM-DD format. | [optional] 
**shr_cls_name** | **str, none_type** | The specified share class name for the fund in proper format. | [optional] 
**shr_cls_term_date** | **date, none_type** | The Share class Termination Date in YYYY-MM-DD format. If still active, value will be null. | [optional] 
**termination_date** | **date, none_type** | The Termination Date in YYYY-MM-DD format. If still active, value will be null. | [optional] 
**type** | **str, none_type** | The Type of Fund, e.g. Mutual Fund, Unit Investment Trust | [optional] 
**web_site** | **str, none_type** | The URL of the Fund. | [optional] 
**ucits_compliance** | **int, none_type** | A regulatory flag that shows if the fund can be marketed within all countries that are part of the European Union. Returns 1 for True to 0 for False. | [optional] 
**ucits_scheme** | **str, none_type** | Determines whether the fund is regulated under the UCITS IV (Directive 2009/65/EC) or UCITS V (Directive 2014/91/EU) | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


