

# AnalystRating


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. |  [optional]
**requestId** | **String** | Identifier that was used for the request. |  [optional]
**asOfMonth** | **String** | Ending date for the period requested expressed in YYYY-MM format. |  [optional]
**currency** | **String** | The 3 digit ISO code for the currency. ​For a list of currency ISO codes, visit [Online Assistant Page#1470](https://oa.apps.factset.com/pages/1470). |  [optional]
**ratingsCount** | [**RatingsCount**](RatingsCount.md) |  |  [optional]
**meanRecommendation** | [**MeanRecommendationEnum**](#MeanRecommendationEnum) | Specifies the average recommendation for a given security identifier for the period requested by the client. It represents the consensus of various analyst ratings. The corresponding date of validity for this data is detailed in the &#x60;asOfMonth&#x60; field. |  [optional]
**meanRecommendationScale** | **Double** | Mean recommendation scale for the period requested, calculated as an average of all recommendations converted into numeric values (e.g., Buy&#x3D;1, Sell&#x3D;3, Hold&#x3D;2, overWeight&#x3D;1.5, underWeight&#x3D;2.5) from various analysts for the period. |  [optional]
**targetPrice** | [**TargetPrice**](TargetPrice.md) |  |  [optional]



## Enum: MeanRecommendationEnum

Name | Value
---- | -----
BUY | &quot;Buy&quot;
SELL | &quot;Sell&quot;
HOLD | &quot;Hold&quot;
OVERWEIGHT | &quot;Overweight&quot;
UNDERWEIGHT | &quot;Underweight&quot;


## Implemented Interfaces

* Serializable


