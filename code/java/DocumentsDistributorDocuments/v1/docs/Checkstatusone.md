

# Checkstatusone


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product** | **String** | Defines the name of the product |  [optional]
**jobID** | **String** | Unique id to get the xml files for the requested date |  [optional]
**status** | **String** | Returns any of the 2 results Submitted -&gt;Running-&gt;Completed and Failed |  [optional]
**percentDone** | **Integer** | Returns how much percentage of  task is completed for the requested jobID |  [optional]
**startDate** | **LocalDate** | The date from which the data is required in YYYY-MM-DDTHH:MM:SSZ format |  [optional]
**endDate** | **LocalDate** | The date until which the data is fetched in YYYY-MM-DDTHH:MM:SSZ format |  [optional]
**part** | **Integer** | Returns the part number of the jobID |  [optional]


## Implemented Interfaces

* Serializable


