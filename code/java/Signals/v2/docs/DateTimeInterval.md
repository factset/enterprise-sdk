

# DateTimeInterval

Represents a valid date/time interval. The upper bound of the interval is represented by the attribute **gt** or **gte**. The lower bound of the interval is presented by **lt** or **lte** The interval can contain either of the bounds or both. e.g. { \"gt\": \"2021-05-01T00:00:00.000Z\", \"lt\": \"2021-05-08T00:00:00.000Z\" } 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gt** | **OffsetDateTime** | A date/time string in ISO 8601 format. |  [optional]
**gte** | **OffsetDateTime** | A date/time string in ISO 8601 format. |  [optional]
**lt** | **OffsetDateTime** | A date/time string in ISO 8601 format. |  [optional]
**lte** | **OffsetDateTime** | A date/time string in ISO 8601 format. |  [optional]


## Implemented Interfaces

* Serializable


