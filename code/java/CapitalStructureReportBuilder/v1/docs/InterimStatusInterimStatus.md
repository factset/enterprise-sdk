

# InterimStatusInterimStatus

classifies the status of each debt issue since last report period. - newIssue - New debt issued by the company. - newIssueAcq - New debt assumed from an acquisition. - matured - Debt that has matured. - redeemed - Debt that has been redeemed prior to maturity. - terminated - Debt that has been terminated prior to maturity. - defaulted - Debt that the issuer has missed interest payment(s) or principal. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**ValueEnum**](#ValueEnum) |  |  [optional]



## Enum: ValueEnum

Name | Value
---- | -----
NEWISSUE | &quot;newIssue&quot;
NEWISSUEACQ | &quot;newIssueAcq&quot;
MATURED | &quot;matured&quot;
REDEEMED | &quot;redeemed&quot;
TERMINATED | &quot;terminated&quot;
DEFAULTED | &quot;defaulted&quot;


## Implemented Interfaces

* Serializable


