# universalscreening.DelimitedOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isDatabase** | **Boolean** | Output will be returned in a legacy database format.  Will be ignored if file type of \&quot;text/csv\&quot; is requested.  Default is false.  Additional access is required for this format. | [optional] [default to false]
**delimiter** | **String** | Specifies the delimiter used between each data point.  A comma is the default delimiter; if this argument is not specified, a comma delimiter will be used.  If the file type of \&quot;text/csv\&quot; is requested, this field will be ignored and a comma will be used. | [optional] [default to &#39;,&#39;]
**hideHeaderRows** | **Boolean** | Specifies whether column column headers should be included in the output. By default, the option is set to true. | [optional] [default to true]
**applyQuotedStrings** | **Boolean** | Specifies whether textual data should have quotes around it (i.e., true will include quotes around textual values). By default, the option is set to true. | [optional] [default to true]
**applySavedNAFormatting** | **Boolean** | Specifies that the NA formatting specified in the column format menu will be used to indicate unavailable data in your output. By default, this option is set to false, which means \&quot;NA\&quot; will be used to indicate the data that is not available. | [optional] [default to false]
**applyFilters** | **Boolean** | Specifies whether the filters present in the screen should be applied to the output. By default, this option is set to false, which means that filters will not be applied and all securities passing the screen will be included in the output. | [optional] [default to false]


