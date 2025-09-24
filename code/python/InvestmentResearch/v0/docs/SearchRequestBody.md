# SearchRequestBody

Search request body elements

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**Ids**](Ids.md) |  | 
**start_date** | **date** | Start Date. Format is YYYY-MM-DD. If the parameter is not provided, will return the today&#39;s results.  | [optional] 
**end_date** | **date** | End Date. Format is YYYY-MM-DD. If the parameter is not provided, will return the today&#39;s results.  | [optional] 
**start_date_relative** | **int** | The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  | [optional] 
**end_date_relative** | **int** | The latest date of the feed file the API should fetch based on the file timestamp.   Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  - Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both. - If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error. - If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.  | [optional] 
**sources** | [**Sources**](Sources.md) |  | [optional] 
**timezone** | **str** | Returns a list of all time zones supported by the API, formatted in POSIX style (e.g., &#x60;America/New_York&#x60;, &#x60;Africa/Malabo&#x60;). These time zones are automatically adjusted for daylight saving time where applicable. This list is used for setting or converting story dates and times accurately across different regions. | [optional]  if omitted the server will use the default value of "America/New_York"
**categories** | [**Categories**](Categories.md) |  | [optional] 
**primary_id** | **bool** | Type of identifier search — set to true to search by primary identifier. | [optional]  if omitted the server will use the default value of False
**search_text** | **str** | Restricts the search to include only document stories that include the searched text. This parameter supports boolean operators as well.  | [optional] 
**contributor_id** | [**ContributorId**](ContributorId.md) |  | [optional] 
**analyst_id** | [**AnalystId**](AnalystId.md) |  | [optional] 
**report_foci** | [**ReportFoci**](ReportFoci.md) |  | [optional] 
**security_types** | [**SecurityTypes**](SecurityTypes.md) |  | [optional] 
**asset_types** | [**AssetTypes**](AssetTypes.md) |  | [optional] 
**asset_classes** | [**AssetClasses**](AssetClasses.md) |  | [optional] 
**coverage_actions** | [**CoverageActions**](CoverageActions.md) |  | [optional] 
**compilation_indicators** | **bool** | An indication of whether the document contains new material or is a compilation/summary of separately published material. If this parameter is not used, it will not return whether the record in the result has complilation indicator or not.     | [optional] 
**disciplines** | [**Disciplines**](Disciplines.md) |  | [optional] 
**issuer_types** | [**IssuerTypes**](IssuerTypes.md) |  | [optional] 
**periodicities** | [**Periodicities**](Periodicities.md) |  | [optional] 
**purposes** | [**Purposes**](Purposes.md) |  | [optional] 
**rating_actions** | [**RatingActions**](RatingActions.md) |  | [optional] 
**research_approaches** | [**ResearchApproaches**](ResearchApproaches.md) |  | [optional] 
**target_actions** | [**TargetActions**](TargetActions.md) |  | [optional] 
**weighting_actions** | [**WeightingActions**](WeightingActions.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


