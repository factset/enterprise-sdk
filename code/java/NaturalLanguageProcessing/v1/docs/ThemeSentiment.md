

# ThemeSentiment

Schema that defines the extracted theme and the corresponding sentiments

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sentiment** | [**SentimentEnum**](#SentimentEnum) | The sentiment of the theme. |  [optional]
**sentimentScore** | **BigDecimal** | Confidence score of the sentiment |  [optional]
**themeScore** | **BigDecimal** | The confidence score associated to the theme | 
**themeText** | **String** | The extracted theme as text | 



## Enum: SentimentEnum

Name | Value
---- | -----
POSITIVE | &quot;positive&quot;
NEGATIVE | &quot;negative&quot;
NEUTRAL | &quot;neutral&quot;


## Implemented Interfaces

* Serializable


