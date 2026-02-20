# RollingDetailRequest

Request object for requesting rolling detail estimates.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**Ids**](Ids.md) |  | 
**metrics** | [**Metrics**](Metrics.md) |  | 
**start_date** | **date** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint.  | [optional] 
**end_date** | **date** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**include_all** | **bool** | Include All filter is used to identify included and excluded broker details from the consensus   By default the service would return only the brokers included in the consensus-   * **TRUE** &#x3D; Returns all the brokers included and excluded in the consensus   * **FALSE** &#x3D; Returns only the broker details included in the consensus  | [optional]  if omitted the server will use the default value of False
**relative_fiscal_start** | [**RelativeFiscalStart**](RelativeFiscalStart.md) |  | [optional] 
**relative_fiscal_end** | [**RelativeFiscalEnd**](RelativeFiscalEnd.md) |  | [optional] 
**periodicity** | [**PeriodicityDetail**](PeriodicityDetail.md) |  | [optional] 
**currency** | **str** | Currency code for adjusting the data. Use input as &#39;ESTIMATE&#39; for values in Estimate currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**broker_names** | [**BrokerNames**](BrokerNames.md) |  | [optional] 
**updates_only** | **bool** | When set to &#39;true&#39;, the endpoint returns the first reported estimates during this period and any subsequent changes reported by the brokers. When set to &#39;false&#39;, data is returned for all dates in the requested date range based on the selected frequency. If unspecified, it is treated as &#39;false&#39; by default. | [optional]  if omitted the server will use the default value of False
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


