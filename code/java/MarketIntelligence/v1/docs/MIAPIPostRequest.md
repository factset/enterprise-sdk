

# MIAPIPostRequest

Post request allows users to pass the necessary parameters such as the report name, identifier, id type, time zone, and report content.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportName** | **String** | report name |  [optional]
**identifier** | **String** | Index or portfolio for which the report to be created. |  [optional]
**idType** | **String** | identifier type |  [optional]
**timeZone** | **String** | Time zone for the report (this shall be utilized if a user wants to use the report via API and also from Workstation/web). |  [optional]
**content** | [**java.util.List&lt;PostRequestExample&gt;**](PostRequestExample.md) |  |  [optional]


## Implemented Interfaces

* Serializable


