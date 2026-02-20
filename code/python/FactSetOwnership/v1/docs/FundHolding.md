# FundHolding

fundHolding response object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Fund Identifier that was used in the request. | [optional] 
**fsym_id** | **str, none_type** | FactSet Security Identifier of Fund. Identifies the security level id of the Fund requested (not-representing the underlying holding). Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. | [optional] 
**date** | **str, none_type** | Date of the reported holding in YYYY-MM-DD format. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262). | [optional] 
**currency** | **str, none_type** | Currency code. The service will default to the funds local currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**adj_holding** | **float, none_type** | Adjusted number of shares held. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet&#39;s Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262). | [optional] 
**adj_market_value** | **float, none_type** | Adjusted market values of shares held. Market Value. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet&#39;s Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262). | [optional] 
**weight_close** | **float, none_type** | Closing weight of security in the fund for the requested asset type (percent). | [optional] 
**issue_type** | **str, none_type** | Issue type of held security. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262). | [optional] 
**fsym_security_id** | **str, none_type** | Represents the security id for the underlying holding, not the parent holding. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. | [optional] 
**fsym_regional_id** | **str, none_type** | FactSet Regional Security identifier of the security held in the fund. | [optional] 
**security_name** | **str, none_type** | Name of held security. | [optional] 
**security_ticker** | **str, none_type** | Ticker of held security. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


