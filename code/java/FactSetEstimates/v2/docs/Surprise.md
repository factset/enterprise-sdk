

# Surprise


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** |  |  [optional]
**date** | **LocalDate** | Date for data expressed in YYYY-MM-DD format. |  [optional]
**currency** | **String** | Currency used estimates in consensus calculations. Currency used estimates in consensus calculations. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). |  [optional]
**metric** | **String** | Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). |  [optional]
**statistic** | **String** | Method of calculation for the consensus &#39;statistic&#39;. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114). |  [optional]
**periodicity** | **String** | Company&#39;s &#39;periodicity&#39; for the estimate record, reflecting Annual, Quarterly, or Semi-Annual report periods. Next-twelve-months (NTMA) and Last-twelve-months (LTMA) also supported. |  [optional]
**fiscalEndDate** | **LocalDate** | Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format |  [optional]
**fiscalYear** | **Integer** | Company&#39;s &#39;fiscal year&#39; for the estimate record |  [optional]
**fiscalPeriod** | **Integer** | Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period. |  [optional]
**surpriseDate** | **LocalDate** | Date of the reported event expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601). |  [optional]
**surpriseAmount** | **Double** | Amount of difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145). |  [optional]
**surprisePercent** | **Double** | Percent difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145). |  [optional]
**surpriseBefore** | **Double** | Last consensus before event. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145). |  [optional]
**surpriseAfter** | **Double** | Actual value after event. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145). |  [optional]
**eventDescription** | **String** | Description of event. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601). |  [optional]
**eventFlag** | **Integer** | Flag for event. Code of Event Flag, where 0 &#x3D; results and 1 &#x3D; profit warning. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601). |  [optional]
**requestId** | **String** |  |  [optional]


## Implemented Interfaces

* Serializable


