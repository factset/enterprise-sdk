# eventsandtranscripts.TranscriptsByTimesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDateTime** | **Date** | The date from which data is required. If dates are not provided, default will return all files.  | [optional] 
**endDateTime** | **Date** | The date to which data is required. If dates are not provided, default will return all files.  | [optional] 
**dateType** | **String** | &lt;p&gt;&#39;dateType&#x3D;storyDateTime&#39; Enables filtering of transcripts based on their storyDateTime&lt;/p&gt; &lt;p&gt;&#39;dateType&#x3D;uploadDateTime&#39; Enables filtering of transcripts based on their uploadDateTime&lt;/p&gt;  &lt;p&gt;Default value is set to storyDateTime.&lt;/p&gt;  | [optional] 



## Enum: DateTypeEnum


* `storyDateTime` (value: `"storyDateTime"`)

* `uploadDateTime` (value: `"uploadDateTime"`)




