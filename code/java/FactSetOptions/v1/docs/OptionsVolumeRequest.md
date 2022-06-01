

# OptionsVolumeRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Option Security Identifier. For more details visit [OA 12636 - Options Identifiers](https://my.apps.factset.com/oa/pages/12636#options)  | 
**startDate** | **String** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. |  [optional]
**endDate** | **String** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. |  [optional]
**frequency** | **Frequency** |  |  [optional]
**exchange** | **Exchange** |  |  [optional]
**calendar** | **Calendar** |  |  [optional]


## Implemented Interfaces

* Serializable


