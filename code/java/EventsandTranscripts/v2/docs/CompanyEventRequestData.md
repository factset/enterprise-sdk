

# CompanyEventRequestData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateTime** | [**CompanyEventRequestDataDateTime**](CompanyEventRequestDataDateTime.md) |  |  [optional]
**universe** | [**CompanyEventRequestDataUniverse**](CompanyEventRequestDataUniverse.md) |  |  [optional]
**eventTypes** | [**java.util.List&lt;EventTypesEnum&gt;**](#java.util.List&lt;EventTypesEnum&gt;) | Refers to the various event types returned in the response:  * Earnings: Regular quarterly calls where companies provide insights into their latest earnings, sharing details on their financial performance, including revenue, profits, and earnings per share.  * SalesRevenueCall: Conference calls focused on discussing comprehensive sales activity and revenue figures, typically held monthly or quarterly.  * GuidanceCall: Calls where companies offer estimated financial information about future earnings or outline business outlooks before official earnings are released.  * AnalystsInvestorsMeeting: A company-hosted gathering for analysts and investors to discuss strategic updates and financial health.  * ShareholdersMeeting: A meeting where shareholders convene to discuss corporate developments and vote on important matters.  * SpecialSituation: Conference calls addressing situations that do not fit into standard categories, often concerning mergers, acquisitions, joint ventures, or significant business updates.  * Conference: An event where individuals gather to discuss and share ideas on common interests, often including various formats such as panel discussions, workshops, and keynote presentations.  * ConfirmedEarningsRelease: Officially announced date when a company will publish its actual earnings results.  * ProjectedEarningsRelease:  Scheduled release date of a company’s estimated or forecasted earnings before actual results.  * SalesRevenueRelease: Disclosure of a company’s revenue figures, usually as part of earnings or performance updates.  * Split: Corporate action that multiplies share count and reduces share price proportionally, without affecting market cap.  * Dividend: Cash or stock distribution paid to shareholders, reflecting a share of company profits. |  [optional]
**lastModifiedWithin** | [**LastModifiedWithinEnum**](#LastModifiedWithinEnum) | The duration within which the events were last modified.  **Note 1:** When using &#x60;lastModifiedWithin&#x60;, the endpoint will return events that have been modified within the specified interval in the recent past as well as those anticipated in the near future—within a span of 45 days.  **Note 2:** If both &#x60;dateTime&#x60; and &#x60;lastModifiedWithin&#x60; are provided in the same request, the API will return an error.  |  [optional]



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


