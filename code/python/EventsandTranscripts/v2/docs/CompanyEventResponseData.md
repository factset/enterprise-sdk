# CompanyEventResponseData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **str** | Ticker-region identifier of the entity hosting the event. | [optional] 
**entity_name** | **str** | The official name of the entity. | [optional] 
**description** | **str** | Brief description of the event. | [optional] 
**event_date_time** | **datetime** | Event start time as date/time string according to ISO 8601. | [optional] 
**market_time_code** | **str** | Timing code related to opening or closing of market. | [optional] 
**event_type** | **str** | Refers to the various event types returned in the response:    * Earnings: Regular quarterly calls where companies provide insights into their latest earnings, sharing details on their financial performance, including revenue, profits, and earnings per share.    * SalesRevenueCall: Conference calls focused on discussing comprehensive sales activity and revenue figures, typically held monthly or quarterly.    * GuidanceCall: Calls where companies offer estimated financial information about future earnings or outline business outlooks before official earnings are released.    * AnalystsInvestorsMeeting: A company-hosted gathering for analysts and investors to discuss strategic updates and financial health.    * ShareholdersMeeting: A meeting where shareholders convene to discuss corporate developments and vote on important matters.    * SpecialSituation: Conference calls addressing situations that do not fit into standard categories, often concerning mergers, acquisitions, joint ventures, or significant business updates.    * Conference: An event where individuals gather to discuss and share ideas on common interests, often including various formats such as panel discussions, workshops, and keynote presentations.    * ConfirmedEarningsRelease: Officially announced date when a company will publish its actual earnings results.    * ProjectedEarningsRelease:  Scheduled release date of a company’s estimated or forecasted earnings before actual results.    * SalesRevenueRelease: Disclosure of a company’s revenue figures, usually as part of earnings or performance updates.    * Split: Corporate action that multiplies share count and reduces share price proportionally, without affecting market cap.    * Dividend: Cash or stock distribution paid to shareholders, reflecting a share of company profits. | [optional] 
**event_id** | **str** | Unique identifier for the event. | [optional] 
**webcast_link** | **str** | Link to the webcast of the event. | [optional] 
**ir_link** | **str** | Link to the ir page of the company. | [optional] 
**fiscal_year** | **str** | The normalized fiscal year of the company to which the event pertains. | [optional] 
**fiscal_period** | **str** | The fiscal period of the company to which the event pertains. | [optional] 
**contact_email** | **str** | Contact email for inquiries related to the event. | [optional] 
**contact_phone** | **str** | Contact phone number for inquiries related to the event. | [optional] 
**contact_name** | **str** | Name of the contact person for queries related to the event. | [optional] 
**report_id** | **str** | Unique identifier for the report.    **Note:** We do not have a reportId for split and dividend event types.  | [optional] 
**last_modified_date** | **datetime** | The date and time when the event was last modified. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


