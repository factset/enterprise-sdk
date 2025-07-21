# eventsandtranscripts.TranscriptsRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **Date** | Start Date (YYYY-MM-DD).  | [optional] 
**endDate** | **Date** | End Date (YYYY-MM-DD).  | [optional] 
**startDateRelative** | **Number** | Start date relative to today (0&#x3D;today, -1&#x3D;yesterday). *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used.*  | [optional] 
**endDateRelative** | **Number** | End date relative to today (0&#x3D;today, -1&#x3D;yesterday). *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used.*  | [optional] 
**timeZone** | **String** | Time Zone for story dates/times (POSIX format from IANA timeZone registry).  Use the &#x60;/meta/time-zones&#x60; endpoint to get the list of available time zones. | [optional] [default to &#39;America/New_York&#39;]
**searchText** | **String** | Text to search for within the transcript document stories. | [optional] 
**primaryId** | **Boolean** | If true, search only for documents where the provided &#x60;ids&#x60; are the primary identifiers. If false, search for any mention. | [optional] [default to false]
**ids** | **[String]** | Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID | 
**reportIds** | **[String]** | List of report IDs (max 1000). | [optional] 
**categories** | **[String]** | List of category codes (country, industry, subject). Use &#x60;/meta/categories&#x60; endpoint. Default is all. | [optional] 
**eventIds** | **[String]** | List of event IDs (max 1000). | [optional] 
**eventType** | **String** | Specifies the type of event:  * Earnings: Regular quarterly calls where companies provide insights into their latest earnings, sharing details on their financial performance, including revenue, profits, and earnings per share.  * Guidance: Calls where companies offer estimated financial information about future earnings or outline business outlooks before official earnings are released.  * Analyst, Investor &amp; Shareholder Meeting: Gatherings hosted by companies for analysts, investors, and shareholders to discuss strategic updates, financial health, and corporate developments.  * ConferencePresentation: A structured delivery of information within a conference setting, where individuals gather to discuss shared interests through formats such as keynote speeches, panel discussions, workshops, seminars, or webinars.  * SalesRevenue: Conference calls focused on discussing comprehensive sales activity and revenue figures, typically held monthly or quarterly.  * SpecialSituation: Conference calls addressing situations that do not fit into standard categories, often concerning mergers, acquisitions, joint ventures, or significant business updates. | [optional] 
**startDateTime** | **Date** | The date from which data is required  | [optional] 
**endDateTime** | **Date** | The date to which data is required  | [optional] 



## Enum: EventTypeEnum


* `Earnings` (value: `"Earnings"`)

* `Guidance` (value: `"Guidance"`)

* `AnalystsShareholdersMeeting` (value: `"AnalystsShareholdersMeeting"`)

* `ConferencePresentation` (value: `"ConferencePresentation"`)

* `SalesRevenue` (value: `"SalesRevenue"`)

* `SpecialSituation` (value: `"SpecialSituation"`)




