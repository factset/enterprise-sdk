# eventsandtranscripts.CompanyEventResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** | Ticker-region identifier of the entity hosting the event. | [optional] 
**entityName** | **String** | The official name of the entity. | [optional] 
**description** | **String** | Brief description of the event. | [optional] 
**eventDateTime** | **Date** | Event start time as date/time string according to ISO 8601. | [optional] 
**marketTimeCode** | **String** | Timing code related to opening or closing of market. | [optional] 
**eventType** | **String** | Refers to the various event types returned in the response:    * Earnings: Regular quarterly calls where companies provide insights into their latest earnings, sharing details on their financial performance, including revenue, profits, and earnings per share.    * SalesRevenueCall: Conference calls focused on discussing comprehensive sales activity and revenue figures, typically held monthly or quarterly.    * GuidanceCall: Calls where companies offer estimated financial information about future earnings or outline business outlooks before official earnings are released.    * AnalystsInvestorsMeeting: A company-hosted gathering for analysts and investors to discuss strategic updates and financial health.    * ShareholdersMeeting: A meeting where shareholders convene to discuss corporate developments and vote on important matters.    * SpecialSituation: Conference calls addressing situations that do not fit into standard categories, often concerning mergers, acquisitions, joint ventures, or significant business updates.    * Conference: An event where individuals gather to discuss and share ideas on common interests, often including various formats such as panel discussions, workshops, and keynote presentations.    * ConfirmedEarningsRelease: Officially announced date when a company will publish its actual earnings results.    * ProjectedEarningsRelease:  Scheduled release date of a company’s estimated or forecasted earnings before actual results.    * SalesRevenueRelease: Disclosure of a company’s revenue figures, usually as part of earnings or performance updates.    * Split: Corporate action that multiplies share count and reduces share price proportionally, without affecting market cap.    * Dividend: Cash or stock distribution paid to shareholders, reflecting a share of company profits. | [optional] 
**eventId** | **String** | Unique identifier for the event. | [optional] 
**webcastLink** | **String** | Link to the webcast of the event. | [optional] 
**irLink** | **String** | Link to the ir page of the company. | [optional] 
**fiscalYear** | **String** | The fiscal year of the company to which the event pertains. | [optional] 
**fiscalPeriod** | **String** | The fiscal period of the company to which the event pertains. | [optional] 
**contactEmail** | **String** | Contact email for inquiries related to the event. | [optional] 
**contactPhone** | **String** | Contact phone number for inquiries related to the event. | [optional] 
**contactName** | **String** | Name of the contact person for queries related to the event. | [optional] 
**reportId** | **String** | Unique identifier for the report.    **Note:** We do not have a reportId for split and dividend event types.  | [optional] 
**lastModifiedDate** | **Date** | The date and time when the event was last modified. | [optional] 



## Enum: EventTypeEnum


* `Earnings` (value: `"Earnings"`)

* `SalesRevenueCall` (value: `"SalesRevenueCall"`)

* `GuidanceCall` (value: `"GuidanceCall"`)

* `AnalystsInvestorsMeeting` (value: `"AnalystsInvestorsMeeting"`)

* `ShareholdersMeeting` (value: `"ShareholdersMeeting"`)

* `SpecialSituation` (value: `"SpecialSituation"`)

* `Conference` (value: `"Conference"`)

* `ConfirmedEarningsRelease` (value: `"ConfirmedEarningsRelease"`)

* `SalesRevenueRelease` (value: `"SalesRevenueRelease"`)

* `ProjectedEarningsRelease` (value: `"ProjectedEarningsRelease"`)

* `Split` (value: `"Split"`)

* `Dividend` (value: `"Dividend"`)




