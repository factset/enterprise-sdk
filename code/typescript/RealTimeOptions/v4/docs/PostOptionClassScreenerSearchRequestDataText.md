# realtimeoptions.PostOptionClassScreenerSearchRequestDataText

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **[String]** | List of attributes to be searched in. The value &#x60;allEntitled&#x60; cannot appear with any other value. | Value | Description | | --- | --- | | allEntitled | Search within all entitled attributes. | | symbol | Symbol of the option class. Class symbols are unique on an exchange (market). The search is executed as an \&quot;exact match\&quot;. | | ISIN | ISIN of the option class. The search is executed as an \&quot;exact match\&quot;. | | name | Name of the option class. |   | [optional] 
**value** | **String** | Text string to be searched for. | [optional] 



## Enum: [AttributesEnum]


* `allEntitled` (value: `"allEntitled"`)

* `symbol` (value: `"symbol"`)

* `ISIN` (value: `"ISIN"`)

* `name` (value: `"name"`)




