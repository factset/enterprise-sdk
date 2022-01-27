

# Region


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **LocalDate** | Ending date for the period requested expressed in YYYY-MM-DD format. |  [optional]
**fsymId** | **String** | FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E). |  [optional]
**regionId** | **String** | Identifier representing the geographic Region. |  [optional]
**requestId** | **String** | Identifier that was used for the request. |  [optional]
**regionCertaintyClass** | **String** | Designated classes from A (highest) to E (lowest) based on &#x60;regionCertaintyRank&#x60;, where --&gt;  |Class|Minimum Certainty Rank|Maximum Certainty Rank| |---|---|---| |A|71|80| |B|57|70| |C|42|56| |D|24|41| |E|1|23|  |  [optional]
**regionCertaintyRank** | **Integer** | Indicates the relative reliability of estimates. Ranks are based on multiple factors related to the reported information and the algorithmic estimation. Ranks range from 1 to 80, with 1 indicating the lowest certainty in the estimate, and 80 indicating a reported exposure. Certainty Rank factors include -  * Reporting standards of the country where the source annual report/filing was filed * A company’s previous years’ country-level reporting * Reliability of country GDP data * Proportion of total report value that must be estimated  |  [optional]
**regionConfidence** | **Double** | Returns the confidence score for the company percentage revenue for the selected geographic area. Confidence score is a measure of how confident we are that our algorithm has done a good job in estimating geographic revenue given the estimation parameters ( GDP, accounting standards, details of data that a company has disclosed,...). Confidence Factors are calculated for all estimated country values, then weighted and aggregated up the geographic tree for areas, regions, and super regions. The confidence factor should not be interpreted as the equivalent of a confidence interval from a statistical sense. The confidence factor is ordinal by nature, and its current range of 0.5000 to 1.0000. A confidence factor of 1.000 indicates that the revenue is an actual, reported, or declared value. **Please see OA page 17555 for more details **.  |  [optional]
**regionName** | **String** | The Region Name in proper format, describing the regionId. |  [optional]
**regionPercent** | **Double** | Returns the company percentage revenue for the selected geographic region. Conventional geographic revenue data are difficult to interpret and compare between companies because they are not normalized. Furthermore, these non-normalized geographic revenue data do not provide any exposure estimates on countries and regions that are not explicitly disclosed by the companies. GeoRev answers these two challenges by first mapping companies’ revenues to a normalized geographic taxonomy, and then applying a proprietary algorithm to estimate % revenue exposure to countries and regions that are not explicitly disclosed. Estimates are accompanied by a Confidence Factor, which offers an easy way to distinguish them from actual disclosed values. Please see OA page 17555 for more details.  |  [optional]
**regionRevenue** | **Double** | Returns the company revenue for the selected geographic region in Millions for the requested currency. Conventional geographic revenue data are difficult to interpret and compare between companies because they are not normalized. Furthermore, these non-normalized geographic revenue data do not provide any exposure estimates on countries and regions that are not explicitly disclosed by the companies. GeoRev answers these two challenges by first mapping companies’ revenues to a normalized geographic taxonomy, and then applying a proprietary algorithm to estimate % revenue exposure to countries and regions that are not explicitly disclosed. Estimates are accompanied by a Confidence Factor, which offers an easy way to distinguish them from actual disclosed values. Please see OA page 17555 for more details.   |  [optional]
**currency** | **String** | The Currency Code representing the Revenue values in the response. |  [optional]
**fiscalEndDate** | **LocalDate** | The latest fully reported fiscal annual period date in YYYY-MM-DD format as of the dates requested. |  [optional]
**reportDate** | **LocalDate** | The Report Date for the latest fully reported fiscal year in YYYY-MM-DD format. |  [optional]


## Implemented Interfaces

* Serializable


