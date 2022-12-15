

# PostNotationSearchByTextRequestDataText

Text-related parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**java.util.Set&lt;AttributesEnum&gt;**](#java.util.Set&lt;AttributesEnum&gt;) | List of attributes to be searched in. The value &#x60;allEntitled&#x60; cannot appear with any other value. |  [optional]
**value** | **String** | Full-text search string. It may be enclosed in double quotes (\&quot;). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \&quot; daimler\&quot;. If only two characters are submitted, the search is executed as an exact search. | 



## Enum: java.util.Set&lt;AttributesEnum&gt;

Name | Value
---- | -----
ALLENTITLED | &quot;allEntitled&quot;
ISIN | &quot;isin&quot;
WKN | &quot;wkn&quot;
VALOR | &quot;valor&quot;
SEDOL | &quot;sedol&quot;
CUSIP | &quot;cusip&quot;
SYMBOL | &quot;symbol&quot;
LONGNAME | &quot;longName&quot;
SHORTNAME | &quot;shortName&quot;


## Implemented Interfaces

* Serializable


