

# InlineResponse2003DataPerformanceIssue

Ask and bid-based performance since issue, see attribute `issue` in endpoint `/securitizedDerivative/get` for the issue date. It represents the difference between the ask (bid respectively) price of the derivative's notation and the issue price. For securitized derivatives quoted in percent, the result is multiplied with the nominal (see attribute `nominal.value` in endpoint `/securitizedDerivative/get`) in order to calculate the value in absolute terms.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ask** | [**InlineResponse2003DataPerformanceIssueAsk**](InlineResponse2003DataPerformanceIssueAsk.md) |  |  [optional]
**bid** | [**InlineResponse2003DataPerformanceIssueBid**](InlineResponse2003DataPerformanceIssueBid.md) |  |  [optional]


## Implemented Interfaces

* Serializable


