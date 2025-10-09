

# BrokerResearchSummary

Broker research summary configuration object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**style** | [**StyleEnum**](#StyleEnum) | Include summarized broker research notes on the company, or just the footnote, or none. Only available for Broker Research users |  [optional]
**brokerIds** | **java.util.List&lt;Integer&gt;** | List of broker IDs covering the company to receive individual research summaries for each over the specified period.Summaries are presented separately by broker, not combined. |  [optional]



## Enum: StyleEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
SUMMARY | &quot;summary&quot;
FOOTNOTE | &quot;footnote&quot;


## Implemented Interfaces

* Serializable


