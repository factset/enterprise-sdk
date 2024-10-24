

# CompanyEventRequestData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateTime** | [**CompanyEventRequestDataDateTime**](CompanyEventRequestDataDateTime.md) |  |  [optional]
**universe** | [**CompanyEventRequestDataUniverse**](CompanyEventRequestDataUniverse.md) |  |  [optional]
**eventTypes** | [**java.util.List&lt;EventTypesEnum&gt;**](#java.util.List&lt;EventTypesEnum&gt;) | The type of events returned in the response |  [optional]
**lastModifiedWithin** | [**LastModifiedWithinEnum**](#LastModifiedWithinEnum) | The duration within which the events were last modified.  **Note 1:** When using &#x60;lastModifiedWithin&#x60; without providing &#x60;startDate&#x60; or &#x60;endDate&#x60;, the default period will be the previous and upcoming 45 days from the current date.  **Note 2:** If both &#x60;dateTime&#x60; and &#x60;lastModifiedWithin&#x60; are provided in the same request, the API will return an error.  |  [optional]



## Enum: java.util.List&lt;EventTypesEnum&gt;

Name | Value
---- | -----
EARNINGS | &quot;Earnings&quot;
SALESREVENUECALL | &quot;SalesRevenueCall&quot;
GUIDANCECALL | &quot;GuidanceCall&quot;
ANALYSTSINVESTORSMEETING | &quot;AnalystsInvestorsMeeting&quot;
SHAREHOLDERSMEETING | &quot;ShareholdersMeeting&quot;
SPECIALSITUATION | &quot;SpecialSituation&quot;
CONFERENCE | &quot;Conference&quot;
CONFIRMEDEARNINGSRELEASE | &quot;ConfirmedEarningsRelease&quot;
PROJECTEDEARNINGSRELEASE | &quot;ProjectedEarningsRelease&quot;
SALESREVENUERELEASE | &quot;SalesRevenueRelease&quot;
SPLIT | &quot;Split&quot;
DIVIDEND | &quot;Dividend&quot;



## Enum: LastModifiedWithinEnum

Name | Value
---- | -----
SIXHOURS | &quot;SixHours&quot;
TWELVEHOURS | &quot;TwelveHours&quot;
TODAY | &quot;Today&quot;
TWODAYS | &quot;TwoDays&quot;
ONEWEEK | &quot;OneWeek&quot;
ONEMONTH | &quot;OneMonth&quot;


## Implemented Interfaces

* Serializable


