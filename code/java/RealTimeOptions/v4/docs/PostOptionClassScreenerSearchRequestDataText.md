

# PostOptionClassScreenerSearchRequestDataText

Text-related parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**java.util.Set&lt;AttributesEnum&gt;**](#java.util.Set&lt;AttributesEnum&gt;) | List of attributes to be searched in. The value &#x60;allEntitled&#x60; cannot appear with any other value. | Value | Description | | --- | --- | | allEntitled | Search within all entitled attributes. | | symbol | Symbol of the option class. Class symbols are unique on an exchange (market). The search is executed as an \&quot;exact match\&quot;. | | ISIN | ISIN of the option class. The search is executed as an \&quot;exact match\&quot;. | | name | Name of the option class. |   |  [optional]
**value** | **String** | Text string to be searched for. |  [optional]



## Enum: java.util.Set&lt;AttributesEnum&gt;

Name | Value
---- | -----
ALLENTITLED | &quot;allEntitled&quot;
SYMBOL | &quot;symbol&quot;
ISIN | &quot;ISIN&quot;
NAME | &quot;name&quot;


## Implemented Interfaces

* Serializable


