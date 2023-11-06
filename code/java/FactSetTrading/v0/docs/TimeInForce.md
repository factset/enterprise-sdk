

# TimeInForce

Time in Force

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tif** | [**TifEnum**](#TifEnum) | Time in force: if GTD, then Expire Time or Expire Date is a required field |  [optional]
**expireDate** | **String** | Expire date in YYYYMMDD format expressed in UTC |  [optional]
**expireTime** | **String** | Expire time in YYYYMMDD-HH:MM:SS format expressed in UTC |  [optional]



## Enum: TifEnum

Name | Value
---- | -----
DAY | &quot;DAY&quot;
GTC | &quot;GTC&quot;
OPG | &quot;OPG&quot;
IOC | &quot;IOC&quot;
FOK | &quot;FOK&quot;
GTX | &quot;GTX&quot;
GTD | &quot;GTD&quot;
ATC | &quot;ATC&quot;


## Implemented Interfaces

* Serializable


