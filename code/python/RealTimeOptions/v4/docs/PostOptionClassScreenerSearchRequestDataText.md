# PostOptionClassScreenerSearchRequestDataText

Text-related parameters.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **[str]** | List of attributes to be searched in. The value &#x60;allEntitled&#x60; cannot appear with any other value. | Value | Description | | --- | --- | | allEntitled | Search within all entitled attributes. | | symbol | Symbol of the option class. Class symbols are unique on an exchange (market). The search is executed as an \&quot;exact match\&quot;. | | ISIN | ISIN of the option class. The search is executed as an \&quot;exact match\&quot;. | | name | Name of the option class. |   | [optional]  if omitted the server will use the default value of ["allEntitled"]
**value** | **str** | Text string to be searched for. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


