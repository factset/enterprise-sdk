# FundamentalsPITData

Represents a single value for a fundamental metric as it was known during a specific Point-in-Time window for a given security and fiscal period.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The identifier provided in the input request that corresponds to this data point. | [optional] 
**fsym_id** | **str, none_type** | FactSet Regional Security Identifier representing the specific data series for the requested &#x60;requestId&#x60;. | [optional] 
**metric** | **str, none_type** | The identifier of the fundamental metric being reported (e.g., &#x60;FF_SALES&#x60;). | [optional] 
**periodicity** | **str, none_type** | Periodicity of this data point (e.g., &#x60;QTR&#x60;, &#x60;ANN&#x60;). | [optional] 
**fiscal_period** | **int, none_type** | Integer representing the fiscal period. For &#x60;QTR&#x60; periodicity, possible values are 1, 2, 3, or 4. For &#x60;SEMI&#x60; periodicity, possible values are 1 or 2. | [optional] 
**fiscal_year** | **int, none_type** | Fiscal year of the reported period, expressed in a YYYY format. | [optional] 
**fiscal_end_date** | **date, none_type** | The official ending date of the fiscal period (YYYY-MM-DD). | [optional] 
**currency** | **str, none_type** | Currency of the reported &#x60;value&#x60;, expressed as a 3-character ISO 4217 code. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**value** | [**FundamentalValue**](FundamentalValue.md) |  | [optional] 
**update_type** | **str, none_type** | Indicates the status of the source filing when this data point was recorded (&#x60;Preliminary&#x60; or &#x60;Final&#x60;). | [optional] 
**pit_start** | **datetime, none_type** | Start of Point-in-Time (inclusive, in UTC) during which this value was current. Format: ISO 8601 &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. If frequency is weekly (w) or monthly (m), this will be null.  | [optional] 
**pit_end** | **datetime, none_type** | End of Point-in-Time (inclusive, in UTC). Format: ISO 8601 &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. If value is &#x60;null&#x60; -&gt; this value is current (latest active snapshot). If frequency is weekly or monthly, and this is an end-of-week or end-of-month snapshot -&gt; &#x60;pitStart&#x60; will be null.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


