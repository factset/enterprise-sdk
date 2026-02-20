

# TranscriptsByTimesRequest

Search criteria for transcripts based on date-time

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDateTime** | **OffsetDateTime** | The date from which data is required. If dates are not provided, default will return all files.  |  [optional]
**endDateTime** | **OffsetDateTime** | The date to which data is required. If dates are not provided, default will return all files.  |  [optional]
**dateType** | [**DateTypeEnum**](#DateTypeEnum) | &lt;p&gt;&#39;dateType&#x3D;storyDateTime&#39; Enables filtering of transcripts based on their storyDateTime&lt;/p&gt; &lt;p&gt;&#39;dateType&#x3D;uploadDateTime&#39; Enables filtering of transcripts based on their uploadDateTime&lt;/p&gt;  &lt;p&gt;Default value is set to storyDateTime.&lt;/p&gt;  |  [optional]



## Enum: DateTypeEnum

Name | Value
---- | -----
STORYDATETIME | &quot;storyDateTime&quot;
UPLOADDATETIME | &quot;uploadDateTime&quot;


## Implemented Interfaces

* Serializable


