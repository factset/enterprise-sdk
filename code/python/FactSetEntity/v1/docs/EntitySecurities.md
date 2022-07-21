# EntitySecurities


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | FactSet Ultimate Parent ID of the Requested Security ID | [optional] 
**fsym_security_id** | **str, none_type** | FactSet Security ID (-S). | [optional] 
**fsym_listing_id** | **str, none_type** | FactSet Listing ID (-L). Corresponds to the listing exchange for the requested security. Not applicable for FI instruments. | [optional] 
**security_type** | **str, none_type** | The Security Type Code. Security Type Code details and mapping are described on Online Assistant Page 15776 for Equity and Page 16014 for Fixed Income. | [optional] 
**listing_exchange** | **str, none_type** | The securities primary listing exchange. | [optional] 
**security_name** | **str, none_type** | Security name | [optional] 
**fsym_entity_id** | **str, none_type** | Unique FactSet-generated identifier representing an entity. | [optional] 
**fsym_ticker_exchange** | **str, none_type** | The security&#39;s ticker-exchange, representing the listing exchange symbol. | [optional] 
**fsym_ticker_region** | **str, none_type** | The security&#39;s regional ticker. | [optional] 
**active_flag** | **int, none_type** | Indicates if security is active. 1 &#x3D; Active; 0 &#x3D; Inactive. | [optional] 
**request_id** | **str** | Identifier used in &#x60;ids&#x60; parameter.  When list of identifiers used, they will be parsed and resolved individually. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


