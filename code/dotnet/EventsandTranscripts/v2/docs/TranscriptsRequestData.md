# FactSet.SDK.EventsandTranscripts.Model.TranscriptsRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartDate** | **DateTime** | Start Date (YYYY-MM-DD). If dates are not provided, default will return all files.  | [optional] 
**EndDate** | **DateTime** | End Date (YYYY-MM-DD). If dates are not provided, default will return all files.  | [optional] 
**StartDateRelative** | **int** | - Start date relative to today (0&#x3D;today, -1&#x3D;yesterday). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used.* - If dates are not provided, default will return all files.  | [optional] 
**EndDateRelative** | **int** | -  End date relative to today (0&#x3D;today, -1&#x3D;yesterday). -  *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used.* -  If dates are not provided, default will return all files.    | [optional] 
**TimeZone** | **string** | Time Zone for story dates/times (POSIX format from IANA timeZone registry).  Use the &#x60;/meta/time-zones&#x60; endpoint to get the list of available time zones. | [optional] [default to "America/New_York"]
**DateType** | **string** | &lt;p&gt;&#39;dateType&#x3D;storyDateTime&#39; Enables filtering of transcripts based on their storyDateTime&lt;/p&gt; &lt;p&gt;&#39;dateType&#x3D;uploadDateTime&#39; Enables filtering of transcripts based on their uploadDateTime&lt;/p&gt;  &lt;p&gt;Default value is set to storyDateTime.&lt;/p&gt;  | [optional] 
**SearchText** | **string** | Text to search for within the transcript document stories. | [optional] 
**PrimaryId** | **bool** | If true, search only for documents where the provided &#x60;ids&#x60; are the primary identifiers. If false, search for any mention.  **Note:** Transcripts only have a primary ID, so the results remain the same regardless of whether primaryId&#x3D;true or primaryId&#x3D;false is specified in the request.  | [optional] [default to false]
**Ids** | **List&lt;string&gt;** | Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID | 
**ReportIds** | **List&lt;string&gt;** | List of report IDs (max 1000). | [optional] 
**Categories** | **List&lt;string&gt;** | List of category codes (country, industry, subject). Use &#x60;/meta/categories&#x60; endpoint. Default is all. | [optional] 
**EventIds** | **List&lt;string&gt;** | List of event IDs (max 1000). | [optional] 
**EventType** | **string** | Specifies the type of event:  * Earnings: Regular quarterly calls where companies provide insights into their latest earnings, sharing details on their financial performance, including revenue, profits, and earnings per share.  * Guidance: Calls where companies offer estimated financial information about future earnings or outline business outlooks before official earnings are released.  * Analyst, Investor &amp; Shareholder Meeting: Gatherings hosted by companies for analysts, investors, and shareholders to discuss strategic updates, financial health, and corporate developments.  * ConferencePresentation: A structured delivery of information within a conference setting, where individuals gather to discuss shared interests through formats such as keynote speeches, panel discussions, workshops, seminars, or webinars.  * SalesRevenue: Conference calls focused on discussing comprehensive sales activity and revenue figures, typically held monthly or quarterly.  * SpecialSituation: Conference calls addressing situations that do not fit into standard categories, often concerning mergers, acquisitions, joint ventures, or significant business updates. | [optional] 
**StartDateTime** | **DateTime** | The date from which data is required. If dates are not provided, default will return all files.  | [optional] 
**EndDateTime** | **DateTime** | The date to which data is required. If dates are not provided, default will return all files.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

