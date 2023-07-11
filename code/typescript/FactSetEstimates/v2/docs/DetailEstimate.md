# factsetestimates.DetailEstimate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** |  | [optional] 
**metric** | **String** | Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). | [optional] 
**periodicity** | **String** | Company&#39;s &#39;periodicity&#39; for the estimate record, reflecting Annual, Quarterly, or Semi-Annual report periods. | [optional] 
**fiscalYear** | **Number** | Company&#39;s &#39;fiscal year&#39; for the estimate record | [optional] 
**fiscalPeriod** | **Number** | Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period. | [optional] 
**fiscalEndDate** | **Date** | Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format | [optional] 
**relativePeriod** | **Number** | &#39;Fiscal period&#39; based on relationship to &#39;estimate date&#39;. This is not applicable for fixed-consensus endpoint. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**currency** | **String** | Currency code for adjusting the data. Use &#39;ESTIMATE&#39; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**estimateDate** | **Date** | Date of estimate expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**estimateValue** | **Number** | The value of the estimate. | [optional] 
**analystId** | **String** | The FactSet Entity Identifier for the analyst making the estimate. | [optional] 
**analystName** | **String** | The name of the analyst making the estimate. | [optional] 
**brokerId** | **String** | The FactSet Entity Identifier for the broker making the estimate. | [optional] 
**brokerName** | **String** | The name of the broker making the estimate. | [optional] 
**lastModifiedDate** | **Date** | The date at which a broker provided an estimate that is a revision. | [optional] 
**prevEstimateDate** | **Date** | Date the previous estimate was made expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**prevEstimateValue** | **Number** | The value of the previous estimate. | [optional] 
**section** | **String** | Section of the estimate.Returns the details of brokers inlcuded and excluded in the consensus | [optional] 
**statusCode** | **Number** | Status code of the estimate. | [optional] 
**statusText** | **String** | Status description of the estimate. | [optional] 
**requestId** | **String** | Identifier that was used for the request. | [optional] 
**inputDateTime** | **String** | Date and time when the data is available at the source. | [optional] 
**securityCurrency** | **String** | The currency that the company trades in. | [optional] 
**brokerEstimateCurrency** | **String** | The currency in which estimates are made by broker. | [optional] 
**estimateCurrency** | **String** | Estimate currency of the requested Security | [optional] 


