

# ConsensusRatings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** |  |  [optional]
**estimateDate** | **LocalDate** | Date of estimate expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) |  [optional]
**buyCount** | **Integer** | The number of Buy ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus. |  [optional]
**overweightCount** | **Integer** | The number of overWeight ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus. |  [optional]
**holdCount** | **Integer** | The number of Hold ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus. |  [optional]
**underweightCount** | **Integer** | The number of underWeight ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus. |  [optional]
**sellCount** | **Integer** | The number of Sell ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus. |  [optional]
**ratingsNestTotal** | **Integer** | The total number of ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus. |  [optional]
**ratingsNote** | **Double** | The mean average of ratings for the fiscal dates indicated, where each underlying rating is given a numerical score and then aggregated to a mean consensus - __*Individual Ratings Scores*__ |Value|Rating Description| |---|---| |1|Buy| |1.5|overWeight| |2|Hold| |2.5|underWeight| |3|Sell|  |  [optional]
**ratingsNoteText** | **String** | The mean textual rating for the fiscal dates indicated. The text rating is assigned by falling within the below defined ranges -  __*Textual Ranges for Average*__ |Value|Rating Description| |---|---| |&lt; 1.25|Buy| |&lt; 1.75|overWeight| |&lt; 2.25|Hold| |&lt; 2.75|underWeight| |&lt;&#x3D; 3|Sell|  |  [optional]
**requestId** | **String** | Identifier that was used for the request. |  [optional]


## Implemented Interfaces

* Serializable


