# FactSet.SDK.EventsandTranscripts.Model.CompanyEventResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Identifier** | **string** | Ticker-region identifier of the entity hosting the event. | [optional] 
**EntityName** | **string** | The official name of the entity. | [optional] 
**Description** | **string** | Brief description of the event. | [optional] 
**EventDateTime** | **DateTime** | Event start time as date/time string according to ISO 8601. | [optional] 
**MarketTimeCode** | **string** | Timing code related to opening or closing of market. | [optional] 
**EventType** | **string** | Refers to the various event types returned in the response:    * Earnings: Regular quarterly calls where companies provide insights into their latest earnings, sharing details on their financial performance, including revenue, profits, and earnings per share.    * SalesRevenueCall: Conference calls focused on discussing comprehensive sales activity and revenue figures, typically held monthly or quarterly.    * GuidanceCall: Calls where companies offer estimated financial information about future earnings or outline business outlooks before official earnings are released.    * AnalystsInvestorsMeeting: A company-hosted gathering for analysts and investors to discuss strategic updates and financial health.    * ShareholdersMeeting: A meeting where shareholders convene to discuss corporate developments and vote on important matters.    * SpecialSituation: Conference calls addressing situations that do not fit into standard categories, often concerning mergers, acquisitions, joint ventures, or significant business updates.    * Conference: An event where individuals gather to discuss and share ideas on common interests, often including various formats such as panel discussions, workshops, and keynote presentations.    * ConfirmedEarningsRelease: Officially announced date when a company will publish its actual earnings results.    * ProjectedEarningsRelease:  Scheduled release date of a company’s estimated or forecasted earnings before actual results.    * SalesRevenueRelease: Disclosure of a company’s revenue figures, usually as part of earnings or performance updates.    * Split: Corporate action that multiplies share count and reduces share price proportionally, without affecting market cap.    * Dividend: Cash or stock distribution paid to shareholders, reflecting a share of company profits. | [optional] 
**EventId** | **string** | Unique identifier for the event. | [optional] 
**WebcastLink** | **string** | Link to the webcast of the event. | [optional] 
**IrLink** | **string** | Link to the ir page of the company. | [optional] 
**FiscalYear** | **string** | The fiscal year of the company to which the event pertains. | [optional] 
**FiscalPeriod** | **string** | The fiscal period of the company to which the event pertains. | [optional] 
**ContactEmail** | **string** | Contact email for inquiries related to the event. | [optional] 
**ContactPhone** | **string** | Contact phone number for inquiries related to the event. | [optional] 
**ContactName** | **string** | Name of the contact person for queries related to the event. | [optional] 
**ReportId** | **string** | Unique identifier for the report.    **Note:** We do not have a reportId for split and dividend event types.  | [optional] 
**LastModifiedDate** | **DateTime** | The date and time when the event was last modified. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

