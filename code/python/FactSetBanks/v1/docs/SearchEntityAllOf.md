# SearchEntityAllOf


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str, none_type** | The identifier as submitted in the request (e.g., ticker or entity ID). Null when the entity was matched via &#x60;searchText&#x60; without a submitted id. | [optional] 
**ticker_region** | **str, none_type** | Regional ticker for the matching entity. Null when the entity has no public ticker. | [optional] 
**fsym_regional_id** | **str, none_type** | FactSet Symbology regional identifier. Null when the entity has no public ticker. | [optional] 
**start_date** | **date, none_type** | Date the relationship to the ultimate parent began, in YYYY-MM-DD format. | [optional] 
**end_date** | **date, none_type** | Date the relationship to the ultimate parent ended, in YYYY-MM-DD format. Null indicates the relationship is currently active. | [optional] 
**factset_ult_parent_entity_id** | **str, none_type** | FactSet entity identifier of the ultimate parent | [optional] 
**factset_ult_parent_proper_name** | **str, none_type** | Legal name of the ultimate parent | [optional] 
**report_type** | **str** | Echoes the requested &#x60;reportType&#x60; this entity was resolved for. | [optional] 
**iso_country** | **str, none_type** | ISO country code | [optional] 
**entity_type** | **str, none_type** | Three-character FactSet entity type code.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---|   |ABS|Asset-Backed Security|MUC|Municipal (City)|   |AIR|Aircraft|MUE|Municipal Entity|   |BAS|Basket|MUT|Mutual Fund|   |BRA|Branch|NPO|Non-Profit Organization|   |CAC|Commodity Asset Class|OPD|Operating Division|   |CMD|Commodity|PEF|Private Equity Fund|   |COL|College/University|PRO|Professional Organization|   |COR|Corporate (public company)|PRT|Partnership|   |CUR|Currency|PUB|Public (government-owned entity)|   |ESP|Employee Stock Plan|PVF|Private Fund|   |EXT|Extinct/Inactive entity|PVT|Private Company|   |FAF|Family of Funds|SHP|Ship|   |FND|Foundation|SOV|Sovereign|   |FNS|Financial Subsidiary|SUB|Subsidiary|   |FRX|Forex|TRU|Trust|   |GOV|Government (Agency)|UIT|Unit Investment Trust|   |HED|Hedge Fund|UMB|Umbrella Fund|   |HOL|Holding Company|VEN|Venture Capital|   |IDX|Index| | |   |IND|Industry| | |   |JVT|Joint Venture| | |   |MED|Media| | |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


