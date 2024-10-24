# eventsandtranscripts.CompanyEventRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateTime** | [**CompanyEventRequestDataDateTime**](CompanyEventRequestDataDateTime.md) |  | [optional] 
**universe** | [**CompanyEventRequestDataUniverse**](CompanyEventRequestDataUniverse.md) |  | [optional] 
**eventTypes** | **[String]** | The type of events returned in the response | [optional] 
**lastModifiedWithin** | **String** | The duration within which the events were last modified.  **Note 1:** When using &#x60;lastModifiedWithin&#x60; without providing &#x60;startDate&#x60; or &#x60;endDate&#x60;, the default period will be the previous and upcoming 45 days from the current date.  **Note 2:** If both &#x60;dateTime&#x60; and &#x60;lastModifiedWithin&#x60; are provided in the same request, the API will return an error.  | [optional] 



## Enum: [EventTypesEnum]


* `Earnings` (value: `"Earnings"`)

* `SalesRevenueCall` (value: `"SalesRevenueCall"`)

* `GuidanceCall` (value: `"GuidanceCall"`)

* `AnalystsInvestorsMeeting` (value: `"AnalystsInvestorsMeeting"`)

* `ShareholdersMeeting` (value: `"ShareholdersMeeting"`)

* `SpecialSituation` (value: `"SpecialSituation"`)

* `Conference` (value: `"Conference"`)

* `ConfirmedEarningsRelease` (value: `"ConfirmedEarningsRelease"`)

* `ProjectedEarningsRelease` (value: `"ProjectedEarningsRelease"`)

* `SalesRevenueRelease` (value: `"SalesRevenueRelease"`)

* `Split` (value: `"Split"`)

* `Dividend` (value: `"Dividend"`)





## Enum: LastModifiedWithinEnum


* `SixHours` (value: `"SixHours"`)

* `TwelveHours` (value: `"TwelveHours"`)

* `Today` (value: `"Today"`)

* `TwoDays` (value: `"TwoDays"`)

* `OneWeek` (value: `"OneWeek"`)

* `OneMonth` (value: `"OneMonth"`)




