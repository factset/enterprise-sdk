# BatchResult


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The identifier provided in the input request that corresponds to this period information. | [optional] 
**fsym_id** | **str, none_type** | FactSet Regional Security Identifier representing the specific data series for the requested &#x60;requestId&#x60;. | [optional] 
**metric** | **str, none_type** | The identifier of the fundamental metric being reported (e.g., &#x60;FF_SALES&#x60;). | [optional] 
**periodicity** | **str, none_type** | Periodicity code for this fiscal period (e.g., &#x60;QTR&#x60;, &#x60;ANN&#x60;). | [optional] 
**fiscal_year** | **int, none_type** | Fiscal year of the reported period, expressed in a YYYY format. | [optional] 
**fiscal_period_length** | **int, none_type** | Length of the fiscal period in days. | [optional] 
**fiscal_end_date** | **date, none_type** | The official ending date of the fiscal period (YYYY-MM-DD). | [optional] 
**report_date** | **date, none_type** | The date the reported fiscal period ended. | [optional] 
**eps_report_date** | **date, none_type** | The date the EPS was reported for the requested periodicity. In YYYY-MM-DD format. | [optional] 
**update_type** | **str, none_type** | Indicates the status of the source filing when this data point was recorded (&#x60;Preliminary&#x60; or &#x60;Final&#x60;). | [optional] 
**currency** | **str, none_type** | Currency of the reported &#x60;value&#x60;, expressed as a 3-character ISO 4217 code. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**value** | [**FundamentalValue**](FundamentalValue.md) |  | [optional] 
**date** | **date, none_type** | Date for the period requested expressed in YYYY-MM-DD format | [optional] 
**pit_start** | **datetime, none_type** | The UTC timestamp for when the fiscal period information was first published and became available. | [optional] 
**pit_end** | **datetime, none_type** | The UTC timestamp for when this version of the fiscal period information was superseded by a newer version. A &#x60;null&#x60; value indicates that this is the latest available version. | [optional] 
**fiscal_interim_number** | **int, none_type** | The sequential number of the interim period within the fiscal year (e.g., 1 for Q1, 2 for Q2). | [optional] 
**fiscal_date** | **date, none_type** | The specific date used for reporting the period end, which may occasionally differ slightly from the period&#39;s actual calendar end date (YYYY-MM-DD). | [optional] 
**fye_change** | **bool, none_type** | Flag indicating if a Fiscal Year End (FYE) change occurred during or impacted this specific period (&#x60;true&#x60; if changed, &#x60;false&#x60; otherwise). | [optional] 
**fiscal_period** | **int, none_type** | Integer representing the fiscal period. For &#x60;QTR&#x60; periodicity, possible values are 1, 2, 3, or 4. For &#x60;SEMI&#x60; periodicity, possible values are 1 or 2. | [optional] 
**label** | **str, none_type** | Report labels of the segment type requested. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


