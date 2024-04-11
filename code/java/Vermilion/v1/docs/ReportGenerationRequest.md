

# ReportGenerationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report** | **String** |  |  [optional]
**tenancy** | **String** |  |  [optional]
**outputFormat** | [**OutputFormatEnum**](#OutputFormatEnum) |  |  [optional]
**sectionFilter** | **String** |  |  [optional]
**priority** | **String** |  |  [optional]
**startDate** | **String** |  |  [optional]
**entitySelection** | [**Map&lt;String, EntitySelection&gt;**](EntitySelection.md) |  |  [optional]



## Enum: OutputFormatEnum

Name | Value
---- | -----
WORD | &quot;WORD&quot;
WORD2010 | &quot;WORD2010&quot;
EXCEL | &quot;EXCEL&quot;
EXCEL2010 | &quot;EXCEL2010&quot;
PPT | &quot;PPT&quot;
PPT2010 | &quot;PPT2010&quot;
PDF | &quot;PDF&quot;
CSV | &quot;CSV&quot;
XML | &quot;XML&quot;
VXML | &quot;VXML&quot;
HTML | &quot;HTML&quot;
PS | &quot;PS&quot;


## Implemented Interfaces

* Serializable


