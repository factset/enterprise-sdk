# TranscriptsRequestData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_date** | **date** | Start Date (YYYY-MM-DD). If dates are not provided, default will return all files.  | [optional] 
**end_date** | **date** | End Date (YYYY-MM-DD). If dates are not provided, default will return all files.  | [optional] 
**start_date_relative** | **int** | - Start date relative to today (0&#x3D;today, -1&#x3D;yesterday). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used.* - If dates are not provided, default will return all files.  | [optional] 
**end_date_relative** | **int** | -  End date relative to today (0&#x3D;today, -1&#x3D;yesterday). -  *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used.* -  If dates are not provided, default will return all files.    | [optional] 
**time_zone** | **str** | Time Zone for story dates/times (POSIX format from IANA timeZone registry).  Use the &#x60;/meta/time-zones&#x60; endpoint to get the list of available time zones. | [optional]  if omitted the server will use the default value of "America/New_York"
**search_text** | **str** | Text to search for within the transcript document stories. | [optional] 
**primary_id** | **bool** | If true, search only for documents where the provided &#x60;ids&#x60; are the primary identifiers. If false, search for any mention.  **Note:** Transcripts only have a primary ID, so the results remain the same regardless of whether primaryId&#x3D;true or primaryId&#x3D;false is specified in the request.  | [optional]  if omitted the server will use the default value of False
**report_ids** | **[str]** | List of report IDs (max 1000). | [optional] 
**categories** | **[str]** | List of category codes (country, industry, subject). Use &#x60;/meta/categories&#x60; endpoint. Default is all. | [optional] 
**date_type** | **str** | Enables filtering of transcripts based on their uploadDateTime.  | [optional] 
**event_ids** | **[str]** | List of event IDs (max 1000). | [optional] 
**event_type** | **str** | Specifies the type of event:  * Earnings: Regular quarterly calls where companies provide insights into their latest earnings, sharing details on their financial performance, including revenue, profits, and earnings per share.  * Guidance: Calls where companies offer estimated financial information about future earnings or outline business outlooks before official earnings are released.  * Analyst, Investor &amp; Shareholder Meeting: Gatherings hosted by companies for analysts, investors, and shareholders to discuss strategic updates, financial health, and corporate developments.  * ConferencePresentation: A structured delivery of information within a conference setting, where individuals gather to discuss shared interests through formats such as keynote speeches, panel discussions, workshops, seminars, or webinars.  * SalesRevenue: Conference calls focused on discussing comprehensive sales activity and revenue figures, typically held monthly or quarterly.  * SpecialSituation: Conference calls addressing situations that do not fit into standard categories, often concerning mergers, acquisitions, joint ventures, or significant business updates. | [optional] 
**start_date_time** | **datetime** | The date from which data is required. If dates are not provided, default will return all files.  | [optional] 
**end_date_time** | **datetime** | The date to which data is required. If dates are not provided, default will return all files.  | [optional] 
**ids** | **[str]** | Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


