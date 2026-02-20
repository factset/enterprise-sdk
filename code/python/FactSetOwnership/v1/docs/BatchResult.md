# BatchResult

Batch Result Item

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used in the request. | [optional] 
**fsym_id** | **str, none_type** | FactSet Security Identifier of Fund. Identifies the security level id of the Fund requested (not-representing the underlying holding). Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. | [optional] 
**date** | **date, none_type** | Date of the reported holding in YYYY-MM-DD format. For more details regarding date resolution, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262). | [optional] 
**currency** | **str, none_type** | Currency code. The service will default to the funds local currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**adj_holding** | **float, none_type** | Adjusted number of shares held. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet&#39;s Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262). | [optional] 
**adj_market_value** | **float, none_type** | Adjusted market values of shares held. Market Value. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet&#39;s Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262). | [optional] 
**weight_close** | **float, none_type** | \&quot;Closing weight of the security for the holders of the requested security (percent). To learn more about how ownership weight is calculated please visit [Online Assistant Page #11247](https://my.apps.factset.com/oa/pages/11247).\&quot;  | [optional] 
**issue_type** | **str, none_type** | Issue type of held security. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262). | [optional] 
**fsym_security_id** | **str, none_type** | Represents the security id for the underlying holding, not the parent holding. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. | [optional] 
**fsym_regional_id** | **str, none_type** | FactSet Regional Security identifier of the security held in the fund. | [optional] 
**security_name** | **str, none_type** | Name of held security. | [optional] 
**security_ticker** | **str, none_type** | Ticker of held security. | [optional] 
**holder_id** | **str, none_type** | Returns the holder IDs for the insiders involved in the transactions that occurred between the specified start and end dates. | [optional] 
**holder_entity_id** | **str, none_type** | FactSet Entity ID that corresponds to the specified holder ID. | [optional] 
**holder_name** | **str, none_type** | Returns the names of the institutions involved in the transactions that occurred between the specified start and end dates. | [optional] 
**investor_type** | **str, none_type** | FactSet Ownership Institution, Mutual Fund, and Insider/Stakeholder investor types. To learn more about the different investor types, visit [Online Assistant Page #11656](https://my.apps.factset.com/oa/pages/11656). | [optional] 
**holder_type** | **str, none_type** | Holder Type name of the respective holder object. The name will align to the holderType requested.  | [optional] 
**percent_outstanding** | **float, none_type** | The percent of the outstanding common shares held by a particular filing institution. To learn more, visit [Online Assistant Page #11041](https://my.apps.factset.com/oa/pages/11041). | [optional] 
**source** | **str, none_type** | Either the 13F Form or ND-30D report filed where the security holdings data was sourced from. To learn more about source, please visit https://my.apps.factset.com/oa/pages/11260 | [optional] 
**holder_title** | **str, none_type** | Returns the titles of the insiders involved in the transactions that occurred between the specified start and end dates. | [optional] 
**shares** | **float, none_type** | Returns the transaction shares for the transactions that occurred between the specified start and end dates. | [optional] 
**price** | **float, none_type** | Returns the transaction prices for the transactions that occurred between the specified start and end dates. | [optional] 
**net_value_change** | **float, none_type** | Returns the transaction values for the transactions that occurred between the specified start and end dates. | [optional] 
**filing_date** | **str, none_type** | Returns the dates on which the transactions that occurred between the specified start and end dates were processed. | [optional] 
**is_derivative** | **bool, none_type** | Returns a Derivative/Non-Derivative flag for the transactions that occurred between the specified start and end dates. Returns true for Derivative and false for Non-Derivative. | [optional] 
**is_direct** | **bool, none_type** | Returns a direct/indirect flag for the transactions that occurred between the specified start and end dates. | [optional] 
**trade_type** | **str, none_type** | Returns an acquisition/disposition flag for the transactions that occurred between the specified start and end dates. | [optional] 
**form_type** | **str, none_type** | Returns the form types for the transactions that occurred between the specified start and end dates. | [optional] 
**transaction_date** | **str, none_type** | Returns the transaction dates for the transactions that occurred between the specified start and end dates. | [optional] 
**shares_owned** | **float, none_type** | Returns the shares owned data for the transactions that occurred between the specified start and end dates. | [optional] 
**sec_rule10b51** | **bool, none_type** | Returns rule 10b5-1 flags for the insiders involved in the transactions that occurred between the specified start and end dates. | [optional] 
**pct_os** | **float, none_type** | Returns position held as a percentage of total outstanding data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**pct_change** | **float, none_type** | Returns change in position held as a percentage of total outstanding data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**pos_change** | **float, none_type** | Returns position change data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**market_val** | **float, none_type** | Returns market value data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**period_of_measure** | **str, none_type** | Returns the range over which the code calculates change for Percent Ownership and Position Change. | [optional] 
**report_date** | **date, none_type** | Returns the report date for the transactions that occurred between the specified start and end dates. | [optional] 
**as_of_date** | **date, none_type** | Date on which the specified data or information is accurate or relevant. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


