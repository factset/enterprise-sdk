# FactSet.SDK.FactSetEstimates.Model.Actual

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**FsymId** | **string** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**Metric** | **string** | Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). | [optional] 
**Periodicity** | **string** | The reporting interval for the estimate. This is derived from Estimate Date and is translated to the Period List &#x3D; ANN, QTR, SEMI, LTMA, or NMTA. | [optional] 
**FiscalPeriod** | **int?** | Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period. | [optional] 
**FiscalYear** | **int?** | Company&#39;s &#39;fiscal year&#39; for the estimate record | [optional] 
**FiscalEndDate** | **DateTime?** | Company&#39;s &#39;fiscal year&#39; for the estimate record. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**ActualValue** | **decimal?** | The Online Assistant Page URL, used to lookup the definition and methodology of the requested item. | [optional] 
**ActualType** | **string** | The type of actual returned. The following is returned:   * **Company Actual**. This is collected directly from a company’s press release for the corresponding past period.    * **European Actual**. This is also collected directly from a company&#39;s press release before January 2017 for European countries. However, **Company Actual ** is used from 2017 onwards to fetch actual irrespective of country or listing.   * **Broker Actual**. A broker actual is a median consensus that can be updated up to 100 days post the fiscal period’s report date. Broker actuals are a post-event only consensus if a report date is collected from an earnings release, unless no brokers have contributed to the post-event consensus yet, in which case the broker actual will be a pre-event consensus.  The broker actual is a pre and post event consensus if the report date is a calculation  For more details on the actual types, visit [Online Assistant Page #13379](https://my.apps.factset.com/oa/pages/13379).     | [optional] 
**ReportDate** | **DateTime?** | Date at which Actual has been reported and/or fiscal period has rolled. | [optional] 
**Currency** | **string** | Currency code for adjusting the data. Use &#39;ESTIMATE&#39; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**EstimateCurrency** | **string** | Estimate currency of the requested Security | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

