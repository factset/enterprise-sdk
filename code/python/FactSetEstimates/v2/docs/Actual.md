# Actual


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**fsym_id** | **str, none_type** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**metric** | **str, none_type** | Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). | [optional] 
**periodicity** | **str, none_type** | The reporting interval for the estimate. This is derived from Estimate Date and is translated to the Period List &#x3D; ANN, QTR, SEMI, LTMA, or NMTA. | [optional] 
**fiscal_period** | **int, none_type** | Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period. | [optional] 
**fiscal_year** | **int, none_type** | Company&#39;s &#39;fiscal year&#39; for the estimate record | [optional] 
**fiscal_end_date** | **date, none_type** | Company&#39;s &#39;fiscal year&#39; for the estimate record. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**actual_value** | **float, none_type** | The Online Assistant Page URL, used to lookup the definition and methodology of the requested item. | [optional] 
**actual_type** | **str, none_type** | The type of actual returned. The following is returned:   * **Company Actual**. This is collected directly from a company’s press release for the corresponding past period.    * **European Actual**. This is also collected directly from a company&#39;s press release before January 2017 for European countries. However, **Company Actual ** is used from 2017 onwards to fetch actual irrespective of country or listing.   * **Broker Actual**. A broker actual is a median consensus that can be updated up to 100 days post the fiscal period’s report date. Broker actuals are a post-event only consensus if a report date is collected from an earnings release, unless no brokers have contributed to the post-event consensus yet, in which case the broker actual will be a pre-event consensus.  The broker actual is a pre and post event consensus if the report date is a calculation  For more details on the actual types, visit [Online Assistant Page #13379](https://my.apps.factset.com/oa/pages/13379).     | [optional] 
**report_date** | **date, none_type** | Date at which Actual has been reported and/or fiscal period has rolled. | [optional] 
**currency** | **str, none_type** | Currency code for adjusting the data. Use &#39;ESTIMATE&#39; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**estimate_currency** | **str, none_type** | Estimate currency of the requested Security | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


